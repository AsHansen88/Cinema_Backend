package com.example.cinema.Model;

import com.example.cinema.Model.MovieAndShowmanagement.MovieTheater;
import com.example.cinema.Model.MovieAndShowmanagement.Showtime;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Set;

@Entity
public class Reservation {

  @Id
  private int id;



  // Cause one user can have multiple reservations right?
  @ManyToOne
  @JoinColumn(name = "userId", referencedColumnName = "id")
  private User user;


  @ManyToOne
  @JoinColumn(name = "theaterId", referencedColumnName = "id")
  private MovieTheater movieTheater;
  @OneToMany
  private Set<Showtime> showtimes;




}
