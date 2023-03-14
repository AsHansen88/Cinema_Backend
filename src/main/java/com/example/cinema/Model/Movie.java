package com.example.cinema.Model;
import com.example.cinema.Model.MovieAndShowmanagement.Showtime;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Movie {

  // id
  @Id
  private int id;
  // Metadata for movie
  private String name;
  @ManyToMany
  private Set<Category> categories;
  private int ageRestriction;
  private int rating;
  private int length;
  @Column(name = "photo")
  private String photo;


  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
  }

  public int getLength() {
    return length;
  }

  public void setLength(int length) {
    this.length = length;
  }

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
