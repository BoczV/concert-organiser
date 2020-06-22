package com.codecool.boczv.concertOrganiser.Bands;


import com.codecool.boczv.concertOrganiser.Util.Style;

public abstract class Band {
    protected String name;
    protected Style style;

    public Band(String name, Style style){
        this.name = name;
        this.style = style;
    }

    public Style getStyle() {
        return style;
    }
}
