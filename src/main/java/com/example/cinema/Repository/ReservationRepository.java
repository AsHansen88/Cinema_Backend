package com.example.cinema.Repository;

import com.example.cinema.Model.Reservation;
import org.apache.logging.log4j.util.Strings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {


}
