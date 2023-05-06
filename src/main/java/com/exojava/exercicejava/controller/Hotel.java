package com.exojava.exercicejava.controller;

public class Hotel {
    private Room room;
    private Booking booking;
    private String nameHotel;
    private String numberHotelPhone;

    public Hotel() {
    }

    public Hotel(Room room, Booking booking, String nameHotel, String numberHotelPhone) {
        this.room = room;
        this.booking = booking;
        this.nameHotel = nameHotel;
        this.numberHotelPhone = numberHotelPhone;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public String getNameHotel() {
        return nameHotel;
    }

    public void setNameHotel(String nameHotel) {
        this.nameHotel = nameHotel;
    }

    public String getNumberHotelPhone() {
        return numberHotelPhone;
    }

    public void setNumberHotelPhone(String numberHotelPhone) {
        this.numberHotelPhone = numberHotelPhone;
    }
}
