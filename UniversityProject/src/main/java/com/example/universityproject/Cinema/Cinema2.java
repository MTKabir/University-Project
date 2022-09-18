package com.example.universityproject.Cinema;

import java.time.LocalDate;

public class Cinema2 {
    private LocalDate startRoom2;
    private LocalDate endRoom2;
    private String titleRoom2;
    private int seatsRoom2;
    private double priceRoom2;

    public LocalDate getStartRoom2(){return startRoom2;}
    public LocalDate getEndRoom2(){return endRoom2;}
    public String getTitleRoom2(){return titleRoom2;}
    public int getSeatsRoom2(){return seatsRoom2;}
    public double getPriceRoom2(){return priceRoom2;}

    public Cinema2(LocalDate startRoom2, LocalDate endRoom2, String titleRoom2, int seatsRoom2, double priceRoom2) {
        this.startRoom2 = startRoom2;
        this.endRoom2 = endRoom2;
        this.titleRoom2 = titleRoom2;
        this.seatsRoom2 = seatsRoom2;
        this.priceRoom2 = priceRoom2;
    }
}
