package com.example.cinema.Model;
import com.example.cinema.Model.Enums.MovieCategory;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Movie {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int movieId;

  // Metadata for movie
  private String name;
  private int ageRestriction;
  private List<MovieCategory> categories;
  private int rating;
  private int length;
  @Column(name = "photo")
  private String photo;


  public List<MovieCategory> getCategories() {
    return categories;
  }

  public void setCategories(List<MovieCategory> categories) {
    this.categories = categories;
  }

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

  public int getMovieId() {
    return movieId;
  }

  public void setMovieId(int id) {
    this.movieId = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public int getAgeRestriction() {
    return ageRestriction;
  }

  public void setAgeRestriction(int ageRestriction) {
    this.ageRestriction = ageRestriction;
  }

  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }
}
