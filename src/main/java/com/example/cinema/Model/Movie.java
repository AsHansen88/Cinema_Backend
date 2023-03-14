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


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Set<Category> getCategories() {
    return categories;
  }

  public void setCategories(Set<Category> categories) {
    this.categories = categories;
  }

  public int getAgeRestriction() {
    return ageRestriction;
  }

  public void setAgeRestriction(int ageRestriction) {
    this.ageRestriction = ageRestriction;
  }
}
