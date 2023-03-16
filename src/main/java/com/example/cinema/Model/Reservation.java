package com.example.cinema.Model;

import com.example.cinema.Model.MovieAndShowmanagement.MovieTheater;
import com.example.cinema.Model.MovieAndShowmanagement.Showtime;
import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Reservation {

  @Id
  private int reservationId;

  @ManyToOne
  @JoinColumn(name = "userId", referencedColumnName = "userId")
  private User user;

  @ManyToOne
  @JoinColumn(name = "theaterId", referencedColumnName = "movieTheaterId")
  private MovieTheater movieTheater;

  @OneToMany
  private Set<Showtime> showtime;




}
