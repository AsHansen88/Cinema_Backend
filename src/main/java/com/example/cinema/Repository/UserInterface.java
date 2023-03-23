package com.example.cinema.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.apache.logging.log4j.util.Strings;
import com.example.cinema.Model.User;

import java.util.Optional;


public interface UserInterface extends JpaRepository<User, Integer> {


    Optional<User> findUserByNameAndAndPassword(String name, String password);

}
