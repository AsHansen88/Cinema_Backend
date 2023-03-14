package com.example.cinema.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.ManyToOne;


@Entity
public class Category {

  @Id
  private String name;

  @ManyToOne
  private Movie movie;
}
