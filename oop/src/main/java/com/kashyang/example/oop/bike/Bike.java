package com.kashyang.example.oop.bike;

import com.kashyang.example.oop.toy.Playable;

public class Bike implements Playable {
    @Override
    public void bringJoy() {
        System.out.println("Ride the bike makes me happy");
    }
}