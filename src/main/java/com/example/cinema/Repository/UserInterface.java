package com.example.cinema.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.apache.logging.log4j.util.Strings;
import com.example.cinema.Model.User;


public interface UserInterface extends JpaRepository<User, Strings> {

}
