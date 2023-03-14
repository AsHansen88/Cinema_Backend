package com.example.cinema.Model;


import com.example.cinema.Model.Enums.MovieCategory;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Movie {

   @Id
  private int id;
  private String name;
  @OneToMany
  private Set<Category> categories;
  private int ageRestriction;


}
