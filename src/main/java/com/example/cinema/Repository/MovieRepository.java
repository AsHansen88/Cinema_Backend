package com.example.cinema.Repository;

import com.example.cinema.Model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MovieRepository extends JpaRepository<Movie, String>{

}

