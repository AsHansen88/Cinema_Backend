package com.example.cinema.Model.MovieAndShowmanagement;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Seat {


    @Id
    private int seatId;
    private int rowNo;
    private int seatNo;

    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    public int getRowNo() {
        return rowNo;
    }

    public void setRowNo(int rowNo) {
        this.rowNo = rowNo;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }
}
