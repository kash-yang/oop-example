package com.kashyang.example.oop.toy;

public class Toy implements Playable {

    private static final long DEFAULT_WARRANTY = 3 * 365 * 24 * 60 * 60 * 1000L;
    protected final String brand;
    protected final String name;
    private final long purchaseDate;
    public Toy (String brand, String name) {
        this.brand = brand;
        this.name = name;
        this.purchaseDate = System.currentTimeMillis();
    }

    @Override
    public void bringJoy() {
        System.out.println("play with " + name + " makes me happy");
    }

    public boolean isUnderWarranty() {
        return System.currentTimeMillis() - purchaseDate < DEFAULT_WARRANTY;
    }
}