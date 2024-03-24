package com.kashyang.example.oop.toy;

public class Gundam extends Toy {
    public Gundam(String name) {
        super("BANDAI", name);
    }
    public void attack() {
        System.out.println(name + " attack!");
    }

    private void stop() { /* stop everything */}
    private void save() { /* save current state */}
    private void unregister() { /* unregister everything */}
    private void clear() { /* clear everything */}
    private void executePowerOff() {/* bye bye*/}
    public void powerOff() {
        stop();
        save();
        unregister();
        clear();
        executePowerOff();
    }
}