package com.BoczV.ConcertOrganiser.Main;

import com.BoczV.ConcertOrganiser.Bands.MainBand;
import com.BoczV.ConcertOrganiser.Bands.WarmUpBand;
import com.BoczV.ConcertOrganiser.Company.ConcertOrganiser;
import com.BoczV.ConcertOrganiser.Concerts.Festival;
import com.BoczV.ConcertOrganiser.Concerts.Indoor;
import com.BoczV.ConcertOrganiser.Concerts.Outdoor;
import com.BoczV.ConcertOrganiser.Util.Style;

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
