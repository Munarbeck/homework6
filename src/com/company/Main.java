package com.company;

import java.io.OutputStream;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Boss boss = new Boss();
        boss.setHp(365);
        boss.setDamage(563);
        boss.weapon.setWeaponName("m416");
        boss.weapon.setWeaponType("Штурмовая винтовка");
        boss.printlnfo();

        System.out.println("Boss moloko SOS!!!");

        System.out.println("-------------------------------------------------");


        Skeleton skeleton = new Skeleton();
        skeleton.setHp(777);
        skeleton.setDamage(666);
        skeleton.weapon.setWeaponType("scar");
        skeleton.weapon.setWeaponName("автоматчичечкий");
        skeleton.printlnfo();


        System.out.println("-------------------------------------------------");



        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHp(69);
        skeleton2.setDamage(96);
        skeleton2.weapon.setWeaponType("scar");
        skeleton2.weapon.setWeaponName("автоматчичечкий");
        skeleton2.printlnfo();
        System.out.println("yeee baby");


        System.out.println("-------------------------------------------------");

    }
}
