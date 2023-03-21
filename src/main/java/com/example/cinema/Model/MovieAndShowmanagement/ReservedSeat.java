package com.example.cinema.Model.MovieAndShowmanagement;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

public class ReservedSeat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reservedSeatId;

    @JoinColumn(name = "seatId", referencedColumnName = "seatId")
    private Seat seatId;

    public int getReservedSeatId() {
        return reservedSeatId;
    }

    public void setReservedSeatId(int reservedSeatId) {
        this.reservedSeatId = reservedSeatId;
    }

    public Seat getSeatId() {
        return seatId;
    }

    public void setSeatId(Seat seatId) {
        this.seatId = seatId;
    }
}
