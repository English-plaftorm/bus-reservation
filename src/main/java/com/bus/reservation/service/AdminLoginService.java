package com.bus.reservation.service;

import com.bus.reservation.exception.AdminException;
import com.bus.reservation.exception.LoginException;
import com.bus.reservation.model.AdminLoginDTO;
import com.bus.reservation.model.CurrentAdminSession;

public interface AdminLoginService {
    public CurrentAdminSession adminLogin(AdminLoginDTO loginDTO) throws LoginException, AdminException;
    public String adminLogout(String key) throws LoginException;
}
