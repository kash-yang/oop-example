package com.kashyang.example.oop.event;

import com.kashyang.example.oop.ball.Baseball;
import com.kashyang.example.oop.ball.Basketball;
import com.kashyang.example.oop.bike.Bike;
import com.kashyang.example.oop.bike.PushBike;
import com.kashyang.example.oop.toy.*;

import java.util.ArrayList;
import java.util.List;

public class ParkEvent extends Event {

    List<Playable> playableList = new ArrayList<>();
    public ParkEvent(List<Playable> playableList,
            String location, long time, String eventName) {
        super(location, time, eventName);
        this.playableList.addAll(playableList);
    }

    public void playWithToys() {
        playableList.forEach(Playable::bringJoy);
    }

}