package com.bus.reservation.service;

import org.springframework.stereotype.Service;

import com.bus.reservation.exception.ReservationException;
import com.bus.reservation.exception.UserException;
import com.bus.reservation.model.Reservation;
import com.bus.reservation.model.ReservationDTO;

import java.util.List;

@Service
public interface ReservationService {

    public Reservation addReservation(ReservationDTO dto, String key) throws ReservationException;

    public Reservation viewReservation(Integer rid, String key) throws ReservationException;

    public List<Reservation> getAllReservation(String key) throws ReservationException;

    public List<Reservation> viewReservationByUerId(Integer uid, String key) throws ReservationException;

    public Reservation deleteReservation(Integer rid, String key) throws ReservationException;

    public Reservation updateReservation(Integer rid, ReservationDTO dto, String key) throws ReservationException;

}
