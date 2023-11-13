package com.bus.reservation.service;

import com.bus.reservation.exception.AdminException;
import com.bus.reservation.model.Admin;

public interface AdminService {
    public Admin createAdmin(Admin admin) throws AdminException;
    public Admin updateAdmin(Admin admin, String key) throws AdminException;
}
