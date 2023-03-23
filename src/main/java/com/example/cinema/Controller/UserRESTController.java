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
    //@ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity<String> postUser(@RequestBody User user) {
        System.out.println(user);
        System.out.println(user.getName());
        System.out.println(user.getPassword());// test
        /*
        userInterface.findUserByNameAndAndPassword(user.getName(), user.getPassword()).ifPresentOrElse(
                (value) -> new ResponseEntity<>("Userlogin Successful",HttpStatus.ACCEPTED),
                () -> new ResponseEntity<>("Userlog Unsuccessful", HttpStatus.NOT_ACCEPTABLE));
                ); */
        Optional<User> loginUser = userInterface.findUserByNameAndAndPassword(user.getName(), user.getPassword());
        if (loginUser.isPresent()) {
            return new ResponseEntity<>("Userlogin Successful", HttpStatus.ACCEPTED);
        }
        else
            return new ResponseEntity<>("Userlogin Unsuccessful", HttpStatus.UNAUTHORIZED);
    }
}
