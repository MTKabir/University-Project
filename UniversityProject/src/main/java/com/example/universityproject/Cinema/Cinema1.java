package com.example.universityproject.Cinema;

import java.time.LocalDate;

public class Cinema1 {
    private LocalDate startRoom1;
    private LocalDate endRoom1;
    private String titleRoom1;
    private int seatsRoom1;
    private double priceRoom1;

    public Cinema1(LocalDate startRoom1, LocalDate endRoom1, String titleRoom1, int seatsRoom1, double priceRoom1) {
        this.startRoom1 = startRoom1;
        this.endRoom1 = endRoom1;
        this.titleRoom1 = titleRoom1;
        this.seatsRoom1 = seatsRoom1;
        this.priceRoom1 = priceRoom1;
    }

    public LocalDate getStartRoom1(){return startRoom1;}
    public LocalDate getEndRoom1(){return endRoom1;}
    public String getTitleRoom1(){return titleRoom1;}
    public int getSeatsRoom1(){return seatsRoom1;}
    public double getPriceRoom1(){return priceRoom1;}






}
