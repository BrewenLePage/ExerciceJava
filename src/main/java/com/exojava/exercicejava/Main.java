package com.exojava.exercicejava;

import com.exojava.exercicejava.controller.Hotel;
import java.util.Optional;

public class Main{

    public static void main(String[] args) {
        Optional<Hotel> optionalHotel = getHotelParis();
        Hotel hotelParis;
        if (optionalHotel.isPresent()){
            hotelParis = optionalHotel.get();
            System.out.println(hotelParis);
        }

    }

    static Optional<Hotel> getHotelParis(){
        Hotel hotelParis = new Hotel();
        hotelParis.setNameHotel("Hotel de la Paix");
        hotelParis.setNumberHotelPhone("0606060606");

        return Optional.empty();
    }
}