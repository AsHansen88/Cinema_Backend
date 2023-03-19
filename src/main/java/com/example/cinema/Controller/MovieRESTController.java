package com.example.cinema.Controller;

import com.example.cinema.Model.Movie;
import com.example.cinema.Model.MovieAndShowmanagement.Showtime;
import com.example.cinema.Repository.MovieRepository;
import com.example.cinema.Repository.ShowtimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class MovieRESTController {

  @Autowired
  MovieRepository movieRepository;

  @Autowired
  ShowtimeRepository showtimeRepository;

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

  @GetMapping("/movie/showtimes/{movieId}")
  public List<Showtime> getShowtimeByMovieId(@PathVariable int movieId) {
    List<Showtime> showtimeList= showtimeRepository.findShowtimeByMovie_MovieIdOrderByTimeslot(movieId);
    // TODO figure out if the repository String/Integer mixup is causing problems
    return showtimeList;
  }

}
