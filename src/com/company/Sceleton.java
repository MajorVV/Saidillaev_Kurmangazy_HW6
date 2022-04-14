package com.company;

public class Sceleton extends Boss {
    private int kolstrel;

    public int getKolstrel() {
        return kolstrel;
    }

    public void setKolstrel(int kolstrel) {
        this.kolstrel = kolstrel;
    }

    public String printlninfo() {
        return super.printlninfo() + "\nКол-во стрел:" + getKolstrel();
    }
}
