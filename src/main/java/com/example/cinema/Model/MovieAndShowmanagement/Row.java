package com.example.cinema.Model.MovieAndShowmanagement;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Row {

    @Id
    private int rowId;

    @OneToMany
    private List<Seat> seats = new ArrayList<>();

    @ManyToOne
    // @JoinColumn
    private MovieTheater movieTheater;

    public int getRowId() {
        return rowId;
    }

    public void setRowId(int id) {
        this.rowId = id;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seat) {
        this.seats = seat;
    }

    public MovieTheater getMovieTheater() {
        return movieTheater;
    }

    public void setMovieTheater(MovieTheater movieTheater) {
        this.movieTheater = movieTheater;
    }
}
