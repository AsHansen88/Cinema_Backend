package com.example.cinema.Repository;

import com.example.cinema.Model.Worker;
import org.apache.logging.log4j.util.Strings;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WorkerRepository extends JpaRepository<Worker, Integer> {
    Optional<Worker> findWorkerByWorkerName(String workerName);
}
