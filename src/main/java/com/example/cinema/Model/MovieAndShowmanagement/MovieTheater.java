package com.example.cinema.Model.MovieAndShowmanagement;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.ArrayList;
import java.util.Set;

@Entity
public class MovieTheater {

  @Id
  private int id;


  // Implementing showtimes for each movie theater??
  /*
   As a theater manager,
   I want to be able to assign movies to different screens and showtimes,
   so that customers can plan their visit and book seats in advance.
   */
  private Set<Showtime> showtimes;

}
