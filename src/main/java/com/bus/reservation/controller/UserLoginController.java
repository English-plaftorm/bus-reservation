package com.bus.reservation.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.bus.reservation.exception.LoginException;
import com.bus.reservation.model.CurrentUserSession;
import com.bus.reservation.model.UserLoginDTO;
import com.bus.reservation.service.UserLoginService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/safar")
public class UserLoginController {

    @Autowired
    private UserLoginService userLoginService;

    @PostMapping("/user/login")
    public ResponseEntity<CurrentUserSession> logInUser(@Valid @RequestBody UserLoginDTO loginDTO) throws LoginException {
        CurrentUserSession currentUserSession = userLoginService.userLogin(loginDTO);
        return new ResponseEntity<CurrentUserSession>(currentUserSession, HttpStatus.ACCEPTED );
    }

    @PostMapping("/user/logout")
    public String logoutUser(@RequestParam(required = false) String key) throws LoginException {
        return userLoginService.userLogout(key);
    }

}
