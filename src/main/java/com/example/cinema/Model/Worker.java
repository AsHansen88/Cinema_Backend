package com.example.cinema.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Worker {

    @Id
    private int workerId;
    private String workerName;
    private String WorkerPassword;

       
//Eventuel ono to one relationship da en worker ville have en account?


    public int getWorkerId() {
        return workerId;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerId(int workerId) {
        this.workerId = workerId;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public String getWorkerPassword() {
        return WorkerPassword;
    }

    public void setWorkerPassword(String workerPassword) {
        WorkerPassword = workerPassword;
    }

}
