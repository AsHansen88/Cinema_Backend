package com.example.cinema.Controller;


import com.example.cinema.Model.Worker;
import com.example.cinema.Repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    /*
    @GetMapping("/login")
    public ResponseEntity<String> login(@RequestBody Worker worker){
        var obj = workerRepository.findWorkerByWorkerName(worker.getWorkerName());


        // TODO fix error
        return new ResponseEntity<String>(HttpStatus.OK,"Du er nu logget ind");
    }

     */

  }


