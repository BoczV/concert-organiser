package com.codecool.boczv.concertOrganiser.Bands;


import com.codecool.boczv.concertOrganiser.Util.Style;

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
