package com.codecool.boczv.concertOrganiser.Concerts;

public class Indoor extends Concert {


    public Indoor() {
        capacity = 3000;
        duration = 1.5;
        ticketPrice = 12000;
        beerPrice = 600;
        setConcertData();
    }

    public int makeProfit() {
        return (int)(actualCapacity * ticketPrice * 0.4) + buyBeers();
    }

}
