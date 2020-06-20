package com.BoczV.ConcertOrganiser.Bands;

import com.BoczV.ConcertOrganiser.Util.Style;

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
