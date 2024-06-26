package com.kashyang.example.oop;

import com.kashyang.example.oop.event.ParkEvent;
import com.kashyang.example.oop.toy.Barbie;
import com.kashyang.example.oop.toy.Gundam;
import com.kashyang.example.oop.toy.Toy;

public class Main {
    public static void main(String[] args){

        Toy gundam = new Toy("BANDAI", "GUNDAM");
        gundam.bringJoy();

        Gundam freedom = new Gundam("freedom");
        freedom.attack();
        freedom.bringJoy();
        freedom.isUnderWarranty();

        Barbie barbie = new Barbie("barbie", "red");
        barbie.showNailColor();
        barbie.bringJoy();
        barbie.putOnHighHeels();
        barbie.isUnderWarranty();


        Toy toy1 = new Gundam("wing gundam");
        Toy toy2 = new Barbie("barbie", "black");
        toy1.bringJoy(); // play with wing gundam makes me happy
        toy2.bringJoy(); // barbie wants to find kenny, or she doesn't want to play


        ParkEvent parkEvent =
                new ParkEvent("Da'an Forest Park",
                        System.currentTimeMillis() + 10L * 3600,
                        "Happy Playing Party!");

        parkEvent.playWithToys();

    }
}