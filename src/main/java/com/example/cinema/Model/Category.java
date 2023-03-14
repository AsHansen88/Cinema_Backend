package com.example.cinema.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Category {

  @Id
  private String name;

  @ManyToOne
  @JoinColumn(name = "movieId", referencedColumnName = "id")
  private Movie movie;
}
