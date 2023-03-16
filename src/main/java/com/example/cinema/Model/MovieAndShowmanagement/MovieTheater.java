package com.example.cinema.Model.MovieAndShowmanagement;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class MovieTheater {

  // There's 2 theaters in DB
  @Id
  private int movieTheaterId;
  @OneToMany
  private Set<Showtime> showtimes = new HashSet<>();


  public int getMovieTheaterId() {
    return movieTheaterId;
  }

  public void setMovieTheaterId(int id) {
    this.movieTheaterId = id;
  }

  public Set<Showtime> getShowtimes() {
    return showtimes;
  }

  public void setShowtimes(Set<Showtime> showtimes) {
    this.showtimes = showtimes;
  }
}
