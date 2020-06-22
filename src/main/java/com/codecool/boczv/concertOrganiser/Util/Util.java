package com.codecool.boczv.concertOrganiser.Util;

import java.util.Random;

public class Util {
    protected final static Random random = new Random();

    public static int randomNumberFromGivenRange(int start, int end){
        return start + random.nextInt(end - start);
    }
}
