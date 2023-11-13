package com.bus.reservation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bus.reservation.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
//    public Admin findByEmail(String email);
	List<Admin> findByEmail(String email);
    
}
