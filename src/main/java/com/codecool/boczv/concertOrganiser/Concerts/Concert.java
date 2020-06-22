package com.codecool.boczv.concertOrganiser.Concerts;

import com.codecool.boczv.concertOrganiser.Bands.MainBand;
import com.codecool.boczv.concertOrganiser.Bands.WarmUpBand;
import com.codecool.boczv.concertOrganiser.Util.Style;
import com.codecool.boczv.concertOrganiser.Util.Util;

import java.util.Random;

public abstract class Concert {
    protected int capacity;
    protected Style style;
    protected int beerPrice;
    protected int ticketPrice;
    protected int actualCapacity;
    protected double duration;
    protected MainBand mainBand;
    protected WarmUpBand warmUpBand;
    protected boolean raining;
    protected static final Random random = new Random();
    protected static final int chanceOfRaining = 30;
    protected static final int chanceOfFullHouse = 80;
    protected static final double percentageOfProfit = 0.40;

    protected void setConcertData(){
        int randomNumber = 1 + Util.randomNumberFromGivenRange(1, 100);
        int randomNumber2 = 1 + Util.randomNumberFromGivenRange(70, 80);
        raining = randomNumber <= chanceOfRaining;
        int calculatedCapacity = (capacity * randomNumber2) / 100;
        actualCapacity = randomNumber <= chanceOfFullHouse ? capacity : calculatedCapacity;
    }

    public abstract int makeProfit();

    protected int buyBeers() {
        int profitInBar = 0;
        for (int i = 0; i < duration * 2; i++) {
            profitInBar += actualCapacity * beerPrice;
        }
        return profitInBar;
    }

    public void addMainBandToConcert(MainBand mainBand) {
        this.mainBand = mainBand;
        this.warmUpBand = mainBand.getWarmUpBand();
        this.style = mainBand.getStyle();
    }
}
