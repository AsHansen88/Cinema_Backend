package com.example.cinema.Repository;

import com.example.cinema.Model.MovieAndShowmanagement.Showtime;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ShowtimeRepository extends JpaRepository<Showtime, Integer> {



    List<Showtime> findShowtimeByMovie_MovieIdOrderByTimeslot(int movie_movieId);
    
    Optional<Showtime> findShowtimeByMovie_MovieId(int movie_movieId);
}
