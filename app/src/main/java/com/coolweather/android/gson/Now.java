package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 联想 on 2018/6/5.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
