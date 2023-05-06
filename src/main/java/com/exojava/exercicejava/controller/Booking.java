package com.exojava.exercicejava.controller;

import java.util.Date;

public class Booking {
    private Client client;
    private Room room;
    private Date dateArrive;
    private Date dateOut;
    private int nbPeople;

    public Booking() {
    }

    public Booking(Client client, Room room, Date dateArrive, Date dateOut, int nbPeople) {
        this.client = client;
        this.room = room;
        this.dateArrive = dateArrive;
        this.dateOut = dateOut;
        this.nbPeople = nbPeople;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Date getDateArrive() {
        return dateArrive;
    }

    public void setDateArrive(Date dateArrive) {
        this.dateArrive = dateArrive;
    }

    public Date getDateOut() {
        return dateOut;
    }

    public void setDateOut(Date dateOut) {
        this.dateOut = dateOut;
    }

    public int getNbPeople() {
        return nbPeople;
    }

    public void setNbPeople(int nbPeople) {
        this.nbPeople = nbPeople;
    }
}
