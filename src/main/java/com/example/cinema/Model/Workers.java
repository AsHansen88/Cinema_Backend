package com.example.cinema.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Workers {

    @Id
    private int workerId;
    private String workerName;
    private String role;

//Eventuel ono to one relationship da en worker ville have en account?


    public int getWorkerId() {
        return workerId;
    }

    public String getWorkerName() {
        return workerName;
    }

    public String getRole() {
        return role;
    }

    public void setWorkerId(int workerId) {
        this.workerId = workerId;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
