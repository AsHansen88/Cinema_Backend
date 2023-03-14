package com.example.cinema.Controller;

import com.example.cinema.Model.Reservation;
import com.example.cinema.Repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ResevationRESTController {

  @Autowired
  ReservationRepository reservationRepository;

  @GetMapping("/Reservations")
  public List<Reservation> GetAllReservations() {

    return reservationRepository.findAll();
  }

  @PostMapping("/resevation")
  @ResponseStatus(HttpStatus.CREATED)
  public Reservation postReservations(@RequestBody Reservation reservation) {
    System.out.println(reservation);
    return reservationRepository.save(reservation);
  }
}
