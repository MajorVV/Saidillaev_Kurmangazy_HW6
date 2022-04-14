package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("----Thanos----");
        Boss boss = new Boss();
        boss.setHealthy(1000);
        boss.setAttack(150);
        boss.bossesGun.setNameWeapon("Винтовка");
        boss.bossesGun.setNameWeapon("Infinity Gloves");
        System.out.println(boss.printlninfo());
        System.out.println("---------------------------");
        System.out.println("----SKELET----");
        Sceleton skeleton = new Sceleton();
        skeleton.setHealthy(150);
        skeleton.setAttack(15);
        skeleton.setKolstrel(10);
        skeleton.bossesGun.setNameWeapon("DIAMOND MEDALIST 38");
        skeleton.bossesGun.setNameWeapon("Блочный лук");
        System.out.println(skeleton.printlninfo());
        System.out.println("---------------------------");
        System.out.println("----SKELET2.0----");
        Sceleton skeleton2 = new Sceleton();
        skeleton2.setHealthy(300);
        skeleton2.setAttack(30);
        skeleton2.setKolstrel(7);
        skeleton2.bossesGun.setNameWeapon("Sebastien Flute Optimo");
        skeleton2.bossesGun.setNameWeapon("Древний лук");
        System.out.println(skeleton2.printlninfo());

    }
}
