package com.example.cinema.Controller;

import com.example.cinema.Model.User;
import com.example.cinema.Repository.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class UserRESTController {

    @Autowired
    UserInterface userInterface;

    @GetMapping("/User")
    public List<User> GetAllUsers(){
        return userInterface.findAll();
    }

    @PostMapping("/userLogin")
    @ResponseStatus(HttpStatus.CREATED)
    public User postUser(@RequestBody User user) {
        System.out.println(user);
        return userInterface.save(user);
    }


}
