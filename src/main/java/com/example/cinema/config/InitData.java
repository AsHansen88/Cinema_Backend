package com.example.cinema.config;

import com.example.cinema.Model.Enums.MovieCategory;
import com.example.cinema.Model.Movie;
import com.example.cinema.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    MovieRepository movieRepository;
    @Override
    public void run(String... args) throws Exception {
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
