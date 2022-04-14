package com.company;

public class GameEntity {
    private int healthy;
    private  int attack;


    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public String printlninfo(){
        return String.valueOf ("HP:" +healthy + "\nURON:" + attack +"\n");
    }
}
