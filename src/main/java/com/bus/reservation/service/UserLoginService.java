package com.bus.reservation.service;

import com.bus.reservation.exception.LoginException;
import com.bus.reservation.model.CurrentUserSession;
import com.bus.reservation.model.UserLoginDTO;

public interface UserLoginService {
    public CurrentUserSession userLogin(UserLoginDTO userLoginDTO) throws LoginException;
    public String userLogout(String key) throws LoginException;
}
