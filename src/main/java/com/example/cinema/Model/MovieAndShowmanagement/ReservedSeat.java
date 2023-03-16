package com.example.cinema.Model.MovieAndShowmanagement;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

public class ReservedSeat {

    @Id
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
