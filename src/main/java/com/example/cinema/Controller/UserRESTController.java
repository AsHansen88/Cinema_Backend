package com.example.cinema.Controller;

import com.example.cinema.Model.User;
import com.example.cinema.Repository.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    public ResponseEntity<String> postUser(@RequestBody User user) {
        System.out.println(user);
        System.out.println(user.getName());
        System.out.println(user.getPassword());// test

        Optional<User> loginUser = userInterface.findUserByNameAndAndPassword(user.getName(), user.getPassword());
        if (loginUser.isPresent()) {
            return new ResponseEntity<>("Userlogin Successful", HttpStatus.ACCEPTED);
        }
        else
            return new ResponseEntity<>("Userlogin Unsuccessful", HttpStatus.UNAUTHORIZED);
    }

    @PostMapping("/createUser")
    public ResponseEntity<String> createUser(@RequestBody User user) {
        // TODO Refactor this business logic to service layer if theres time
        User tempUser = userInterface.findUserByName(user.getName());
        if (tempUser.getName() == user.getName()) {
            return new ResponseEntity<>("User already exists", HttpStatus.UNAUTHORIZED);
        }
        else {
            userInterface.save(user);
            return new ResponseEntity<>("User successfully created", HttpStatus.CREATED);
        }
    }

}
