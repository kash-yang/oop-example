package com.kashyang.example.oop.event;

import com.kashyang.example.oop.toy.Barbie;
import com.kashyang.example.oop.toy.Gundam;
import com.kashyang.example.oop.toy.Toy;
import com.kashyang.example.oop.toy.Transformer;

import java.util.ArrayList;
import java.util.List;

public class ParkEvent extends Event {

    List<Toy> toys = new ArrayList<>();
    public ParkEvent(String location, long time, String eventName) {
        super(location, time, eventName);
        toys.add(new Gundam("wing gundam"));
        toys.add(new Barbie("barbie", "red"));
        toys.add(new Transformer("bumblebee"));
    }

    public void playWithToys() {
        toys.forEach(Toy::bringJoy);
    }

}