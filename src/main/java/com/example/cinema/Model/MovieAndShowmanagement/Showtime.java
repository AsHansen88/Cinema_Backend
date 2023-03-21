package com.example.cinema.Model.MovieAndShowmanagement;

import com.example.cinema.Model.Movie;
import jakarta.persistence.*;
import org.springframework.boot.context.properties.bind.DefaultValue;

import java.util.Date;

@Entity
public class Showtime {

    // TODO GeneratedValue makes the creation of objects go haywire. ERROR: "Field Doesn’t Have A Default Value for showtime_id"
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int showtimeId;

    private Date timeslot;

    @ManyToOne
    @JoinColumn(name = "movieId", referencedColumnName = "movieId")
    private Movie movie;

    @ManyToOne
    @JoinColumn(name="movieTheaterId", referencedColumnName = "movieTheaterId")
    private MovieTheater movieTheater;

    public MovieTheater getMovieTheater() {
        return movieTheater;
    }

    public void setMovieTheater(MovieTheater movieTheater) {
        this.movieTheater = movieTheater;
    }

    public int getShowtimeId() {
        return showtimeId;
    }

    public void setShowtimeId(int showtimeId) {
        this.showtimeId = showtimeId;
    }

    public Date getTimeslot() {
        return timeslot;
    }

    public void setTimeslot(Date timeslot) {
        this.timeslot = timeslot;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
