package com.example.cinema.Model;

import jakarta.persistence.*;

@Entity
public class Reservation {

  @Id
  private int id;

private

  // Cause one user can have multiple reservations right?
  @ManyToOne
  private User user;


}
