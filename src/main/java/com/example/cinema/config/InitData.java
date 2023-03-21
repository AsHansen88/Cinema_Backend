package com.example.cinema.config;

import com.example.cinema.Model.Enums.MovieCategory;
import com.example.cinema.Model.Movie;
import com.example.cinema.Model.MovieAndShowmanagement.Showtime;
import com.example.cinema.Repository.MovieRepository;
import com.example.cinema.Repository.ShowtimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    MovieRepository movieRepository;

    @Autowired
    ShowtimeRepository showtimeRepository;

    @Override
    public void run(String... args) throws Exception {
        /*
        Showtime mummyShowtime = new Showtime();
        java.sql.Date date2 = new java.sql.Date(11111);

        mummyShowtime.setMovie(movieRepository.getReferenceById(0));
        mummyShowtime.setTimeslot(date2);
        // mummyShowtime.setShowtimeId(1);

        showtimeRepository.save(mummyShowtime);

         */
        /*
        List<MovieCategory> genreList = new ArrayList<>();
        genreList.add(MovieCategory.ACTION);
        genreList.add(MovieCategory.COMEDY);
        genreList.add(MovieCategory.THRILLER);


        Movie m1 = new Movie();
        m1.setName("The Mummy");
        m1.setCategories(genreList);
        m1.setAgeRestriction(15);
        m1.setRating(120);
        m1.setLength(120);

        movieRepository.save(m1);
        System.out.println(m1);
        */



    }
}
