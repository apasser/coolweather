package com.fan.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Suggesstion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CartWash cartWash;

    public Sport sport;


    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class CartWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}
