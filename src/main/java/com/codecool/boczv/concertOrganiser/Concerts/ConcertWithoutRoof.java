package com.codecool.boczv.concertOrganiser.Concerts;

public abstract class ConcertWithoutRoof extends Concert {


    @Override
    public int makeProfit(){
        if(!raining){
            return (int)(actualCapacity * ticketPrice * percentageOfProfit) + buyBeers();
        }
        return 0;
    }

}
