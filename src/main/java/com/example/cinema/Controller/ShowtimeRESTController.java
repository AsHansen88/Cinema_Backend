package com.example.cinema.Controller;

import com.example.cinema.Model.Movie;
import com.example.cinema.Model.MovieAndShowmanagement.Showtime;
import com.example.cinema.Repository.MovieRepository;
import com.example.cinema.Repository.ShowtimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
public class ShowtimeRESTController {

    @Autowired
    ShowtimeRepository showtimeRepository;

    @Autowired
    MovieRepository movieRepository;

    @PostMapping("/postShowtime")
    //@ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<String> createShowtime(@RequestBody Showtime showtime) {
        // This is a hacktogether to secure acceptance of existing backend movie object data that's passed around frontend.
        System.out.println(showtime);
        Optional<Movie> existingMovie = movieRepository.findById(showtime.getMovie().getMovieId());
        showtime.setMovie(existingMovie.get());
        System.out.println(showtime.getMovie());


        showtimeRepository.save(showtime);
        // TODO Be sure that the entry for fits with this: Hibernate: insert into showtime (movie_id, movie_theater_id, timeslot, showtime_id) values (?, ?, ?, ?)
        return new ResponseEntity<>("Things worked out great",HttpStatus.OK);
    }
}
