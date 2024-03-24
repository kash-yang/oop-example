package com.kashyang.example.oop.toy;

public class Barbie extends Toy {

    private final String nailColor;

    public Barbie(String name, String nailColor) {
        super("MATTEL", name);
        this.nailColor = nailColor;
    }
    @Override
    public void bringJoy() {
        System.out.println(name + " wants to find kenny, or she doesn't want to play");
    }
    public void putOnHighHeels(){
        System.out.println(name + " puts on high heels");
    }

    public void showNailColor() {
        System.out.println(name + "'s nail is " + nailColor);
    }
}