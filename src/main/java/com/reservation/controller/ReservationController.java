package com.reservation.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.reservation.domain.Reservation;
import com.reservation.repository.ReservationRepository;

@RestController
public class ReservationController {

    @Autowired
    ReservationRepository reservationRepository;
    
    @RequestMapping("/hello")
    @ResponseBody Collection<Reservation> helloWorld(){
        Reservation res =  Reservation.builder().id(123L).reservationName("Ajinkya").build();
        reservationRepository.save(res);
        return reservationRepository.findByReservationName("Ajinkya");
    }
    
}
