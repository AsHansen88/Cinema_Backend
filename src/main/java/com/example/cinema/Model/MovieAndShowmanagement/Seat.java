package com.example.cinema.Model.MovieAndShowmanagement;

import com.example.cinema.Model.Reservation;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Seat {


    @Id
    private int seatId;

    @ManyToOne
    private Row row;


    @OneToOne
    private Reservation reservationId;
}
