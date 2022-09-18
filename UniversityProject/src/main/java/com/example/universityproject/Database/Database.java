package com.example.universityproject.Database;

import com.example.universityproject.Cinema.Cinema1;
import com.example.universityproject.Cinema.Cinema2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Database {
    List<Cinema1> listCinema1=new ArrayList<>();
    List<Cinema2> listCinema2=new ArrayList<>();

    public Database(){
        LocalDate start= LocalDate.of(2020, 5, 13);
        LocalDate end= LocalDate.of(2020, 5, 13);
        listCinema1.add(new Cinema1(start,end,"ABC",2,2.00));
        listCinema2.add(new Cinema2(start,end,"ABC",2,2.00));
    }

}
