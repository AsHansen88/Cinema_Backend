package com.example.cinema.Controller;

import com.example.cinema.Model.MovieAndShowmanagement.Showtime;
import com.example.cinema.Repository.ShowtimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class ShowtimeRESTController {

    @Autowired
    ShowtimeRepository showtimeRepository;

    @PostMapping("/postShowtime")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<String> createShowtime(@RequestBody Showtime showtime) {
        System.out.println(showtime);
        // make a dummy showtime to test it
        showtimeRepository.save(showtime);
        // TODO Be sure that the entry for fits with this: Hibernate: insert into showtime (movie_id, movie_theater_id, timeslot, showtime_id) values (?, ?, ?, ?)
        return new ResponseEntity<>("Things worked out great",HttpStatus.OK);
    }
}
