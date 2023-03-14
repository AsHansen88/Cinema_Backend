package com.example.cinema.Model.MovieAndShowmanagement;

import com.example.cinema.Model.Movie;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Showtime {

    @Id
    private int id;

    private Date timeslot;

    @ManyToOne
    @JoinColumn(name = "movieId", referencedColumnName = "id")
    private Movie movie;

}
