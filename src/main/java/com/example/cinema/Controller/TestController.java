package com.example.cinema.Controller;

import com.example.cinema.Model.Worker;
import com.example.cinema.Repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    WorkerRepository workerRepository;
    @PostMapping("/testLogin")
    public Worker getWorkerTest(@RequestBody Worker worker) {
        return workerRepository.save(worker);
    }


}
