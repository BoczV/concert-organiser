package com.BoczV.ConcertOrganiser.Bands;

import com.BoczV.ConcertOrganiser.Util.Style;

public class MainBand extends Band {
    private WarmUpBand warmUpBand;

    public MainBand(String name, Style style) {
        super(name, style);
    }


    public void selectWarmUpBand(WarmUpBand warmUpBand){
        if(warmUpBand.getStyle().equals(this.getStyle())){
            this.warmUpBand = warmUpBand;
        }
    }

    public WarmUpBand getWarmUpBand() {
        return warmUpBand;
    }
}
