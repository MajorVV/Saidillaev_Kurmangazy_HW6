package com.company;

public class Boss extends  GameEntity{
Weapon bossesGun = new Weapon();

    public Weapon getBossesGun() {
        return bossesGun;
    }

    public void setBossesGun() {
        this.bossesGun = bossesGun;
    }

    public String printlninfo() {
        return super.printlninfo() +"Тип Орудия:"+  bossesGun.getNameWeapon() +"\nМодель:"+ bossesGun.getTypeWeapon();

    }
}
