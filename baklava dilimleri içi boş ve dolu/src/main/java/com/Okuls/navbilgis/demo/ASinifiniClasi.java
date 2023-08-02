package com.Okuls.navbilgis.demo;

public class ASinifiniClasi implements ASinifi , {
    private int berat = 90;
    @Override
    public int asınıfısınavnotları() {
        int ayşe= 80;
        int mehmet=60;
        int mikail= 50;
        int kadir = 30;

        return ayşe+" "+mehmet+" "+mikail+" "+berat+" "+kadir;
    }

    public int getBerat() {
        return berat;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }
}
