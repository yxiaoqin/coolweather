package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 联想 on 2018/6/4.
 */

public class Province extends DataSupport{
    private  int id;
    private  String procinceName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public String getProcinceName() {
        return procinceName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProcinceName(String procinceName) {
        this.procinceName = procinceName;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
