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
  private Set<Row> rows = new HashSet<>();



  // Implementing showtimes for each movie theater??
  /*
   As a theater manager,
   I want to be able to assign movies to different screens and showtimes,
   so that customers can plan their visit and book seats in advance.
   */

  // should showtime be assigned to movie as well or instead??? i need a break
  @OneToMany
  private List<Showtime> showtimes = new ArrayList<>();

  // TODO Ask Douglas, Do we really have to make another entity to implement rows and their seats?....


  public int getMovieTheaterId() {
    return movieTheaterId;
  }

  public void setMovieTheaterId(int id) {
    this.movieTheaterId = id;
  }

  public Set<Row> getRows() {
    return rows;
  }

  public void setRows(Set<Row> rows) {
    this.rows = rows;
  }

  public Set<Showtime> getShowtimes() {
    return showtimes;
  }

  public void setShowtimes(Set<Showtime> showtimes) {
    this.showtimes = showtimes;
  }
}
