package com.kashyang.example.oop.event;

public class Event {
    protected String location;
    protected long time;
    protected String eventName;

    public Event(String location, long time, String eventName) {
        this.location = location;
        this.time = time;
        this.eventName = eventName;
    }
}