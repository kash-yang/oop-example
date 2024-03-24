package com.kashyang.example.oop.ball;

import com.kashyang.example.oop.toy.Playable;

abstract public class Ball implements Playable {

    abstract public String playWithTheBall();
    @Override
    public void bringJoy() {
        System.out.println("YA, " + playWithTheBall() + " makes me happy");
    }
}