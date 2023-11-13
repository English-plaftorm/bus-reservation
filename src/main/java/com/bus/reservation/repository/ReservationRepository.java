package com.bus.reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bus.reservation.model.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
}
