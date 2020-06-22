package com.codecool.boczv.concertOrganiser.Main;

import com.codecool.boczv.concertOrganiser.Bands.MainBand;
import com.codecool.boczv.concertOrganiser.Bands.WarmUpBand;
import com.codecool.boczv.concertOrganiser.Company.ConcertOrganiser;
import com.codecool.boczv.concertOrganiser.Concerts.Festival;
import com.codecool.boczv.concertOrganiser.Concerts.Indoor;
import com.codecool.boczv.concertOrganiser.Concerts.Outdoor;
import com.codecool.boczv.concertOrganiser.Util.Style;


public class Main {
    public static void main(String[] args) {
        ConcertOrganiser concertOrganiser = new ConcertOrganiser();

        for(int i = 0; i < 3; i++){
            concertOrganiser.addBand(new MainBand("Band1", Style.Pop));
            concertOrganiser.addBand(new MainBand("Band2", Style.Jazz));
            concertOrganiser.addBand(new MainBand("Band3", Style.Rock));
            concertOrganiser.addBand(new WarmUpBand("wBand1", Style.Pop));
            concertOrganiser.addBand(new WarmUpBand("wBand2", Style.Jazz));
            concertOrganiser.addBand(new WarmUpBand("wBand3", Style.Rock));
            concertOrganiser.addConcert(new Festival());
            concertOrganiser.addConcert(new Indoor());
            concertOrganiser.addConcert(new Outdoor());
        }


        System.out.println("Profit for this session: " + concertOrganiser.calculateProfitByConcerts() + " HUF.");
    }
}
