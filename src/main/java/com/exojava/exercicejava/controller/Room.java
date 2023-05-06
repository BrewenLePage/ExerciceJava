package com.exojava.exercicejava.controller;

public class Room {
    private int number;
    private double price;
    private boolean available;

    public Room() {
    }

    public Room(int number, double price, boolean available) {
        this.number = number;
        this.price = price;
        this.available = available;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
