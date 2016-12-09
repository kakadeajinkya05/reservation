package com.reservation.repository;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.reservation.domain.Reservation;

@RepositoryRestResource
public interface ReservationRepository extends CrudRepository<Reservation, Long> {

    Collection<Reservation> findByReservationName(String name);
    
}
