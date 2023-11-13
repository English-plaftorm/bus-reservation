package com.bus.reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bus.reservation.model.CurrentUserSession;

@Repository
public interface CurrentUserSessionRepository extends JpaRepository<CurrentUserSession, Integer> {
    public CurrentUserSession findByUuid(String uuid);
}
