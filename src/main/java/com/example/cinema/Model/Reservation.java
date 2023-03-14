package com.example.cinema.Model;

import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
public class Reservation {

  @Id
  private int id;



  // Cause one user can have multiple reservations right?
  @ManyToOne
  @JoinColumn(name = "userId", referencedColumnName = "id")
  private User user;




}
