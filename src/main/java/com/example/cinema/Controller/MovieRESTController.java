package com.example.cinema.Controller;

import com.example.cinema.Model.Movie;
import com.example.cinema.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

public class MovieRESTController {

  @Autowired
  MovieRepository movieRepository;

  @GetMapping("/movies")
  public List<Movie> movie(){
    return movieRepository.findAll();
  }

@PostMapping("/movie")
@ResponseStatus(HttpStatus.CREATED)

  public Movie postMovie(@RequestBody Movie movie){
  System.out.println(movie);
  return movieRepository.save(movie);
  }

}
