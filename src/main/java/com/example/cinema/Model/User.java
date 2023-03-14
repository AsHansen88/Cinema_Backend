package com.example.cinema.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


import java.util.ArrayList;
import java.util.Set;

@Entity
public class User {

  @Id
  private int id;
  private String name;
  private int number;

  private ArrayList<Reservation> reservations;


}
