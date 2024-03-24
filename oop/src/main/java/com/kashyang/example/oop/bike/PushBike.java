package com.kashyang.example.oop.bike;

import com.kashyang.example.oop.toy.Playable;

public class PushBike implements Playable {

    @Override
    public void bringJoy() {
        System.out.println("Push the bike makes me happy");
    }
}