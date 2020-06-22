package com.codecool.boczv.concertOrganiser.Company;

import com.codecool.boczv.concertOrganiser.Bands.MainBand;
import com.codecool.boczv.concertOrganiser.Bands.WarmUpBand;
import com.codecool.boczv.concertOrganiser.Concerts.Concert;

import java.util.HashSet;
import java.util.Set;

public class ConcertOrganiser {
    private Set<Concert> concerts = new HashSet<Concert>();
    private Set<MainBand> mainBands = new HashSet<MainBand>();
    private Set<WarmUpBand> warmUpBands = new HashSet<WarmUpBand>();
    private int profit;

    public void addConcert(Concert concert) {
        concerts.add(concert);
    }


    public void addBand(MainBand band) {
        mainBands.add(band);
    }

    public void addBand(WarmUpBand warmUpBand) {
        warmUpBands.add(warmUpBand);
    }

    private void setUpWarmBandsForMainBands() {
        for (MainBand mainBand : mainBands) {
            for (WarmUpBand warmUpBand : warmUpBands) {
                mainBand.selectWarmUpBand(warmUpBand);
                if (mainBand.getWarmUpBand() != null) {
                    break;
                }
            }
        }
    }

    private void setUpMainBandsForConcerts() {
        int i = 0;
        for (Concert concert : concerts) {
            for (MainBand mainBand : mainBands) {
                concert.addMainBandToConcert(mainBand);
                mainBands.remove(mainBand);
                break;
            }
        }
    }

    public int calculateProfitByConcerts() {
        setUpWarmBandsForMainBands();
        setUpMainBandsForConcerts();
        for (Concert concert : concerts) {
            profit += concert.makeProfit();
        }
        return profit;
    }
}
