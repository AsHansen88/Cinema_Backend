package com.example.cinema.Model.MovieAndShowmanagement;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Entity
public class MovieTheater {

  // There's 2 theaters
  @Id
  private int id;


  // Implementing showtimes for each movie theater??
  /*
   As a theater manager,
   I want to be able to assign movies to different screens and showtimes,
   so that customers can plan their visit and book seats in advance.
   */

  // should showtime be assigned to movie as well or instead??? i need a break
  @OneToMany
  private Set<Showtime> showtimes = new HashSet<>();


  // TODO Ask Douglas, Do we really have to make another entity to implement rows and their seats?....
  private ArrayList<int> rows = new ArrayList<int>();

}
