package com.BoczV.ConcertOrganiser.Concerts;

import com.BoczV.ConcertOrganiser.Bands.MainBand;
import com.BoczV.ConcertOrganiser.Bands.WarmUpBand;
import com.BoczV.ConcertOrganiser.Util.Style;

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

    protected void setConcertData(){
        int randomNumber = 1 + random.nextInt(101);
        int randomNumber2 = 70 + random.nextInt(11);
        raining = randomNumber <= 30;
        int calculatedCapacity = (capacity * randomNumber2) / 100;
        actualCapacity = randomNumber <= 80 ? capacity : calculatedCapacity;
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
