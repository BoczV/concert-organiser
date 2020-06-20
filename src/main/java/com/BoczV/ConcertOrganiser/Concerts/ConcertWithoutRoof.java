package com.BoczV.ConcertOrganiser.Concerts;

public abstract class ConcertWithoutRoof extends Concert {


    @Override
    public int makeProfit(){
        if(!raining){
            return (int)(actualCapacity * ticketPrice * 0.4) + buyBeers();
        }
        return 0;
    }
    
}
