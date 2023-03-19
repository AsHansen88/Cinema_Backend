package com.example.cinema.Controller;


import com.example.cinema.Model.Worker;
import com.example.cinema.Repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class WorkerRESTController {


    @Autowired
    WorkerRepository workerRepository;

    @GetMapping("/Worker")
    public List<Worker> GetAllWorkers(){
      return workerRepository.findAll();
    }

    @PostMapping("/WorkerLogin")
    @ResponseStatus(HttpStatus.CREATED)
    public Worker postWorker(@RequestBody Worker worker) {
      System.out.println(worker);
      return workerRepository.save(worker);
    }


  }


