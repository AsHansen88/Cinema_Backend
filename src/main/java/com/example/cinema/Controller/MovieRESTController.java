package com.example.cinema.Controller;

import com.example.cinema.Model.Movie;
import com.example.cinema.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class MovieRESTController {

  @Autowired
  MovieRepository movieRepository;

  @GetMapping("/Movies")
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
