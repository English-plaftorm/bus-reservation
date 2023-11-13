package com.bus.reservation.service;

import java.util.List;

import com.bus.reservation.exception.AdminException;
import com.bus.reservation.exception.UserException;
import com.bus.reservation.model.User;

public interface UserService {
    public User createUser(User user) throws UserException;
    public User updateUser(User user, String key) throws UserException;
    public User deleteUser(Integer userId, String key) throws UserException, AdminException;
    public User viewUserById(Integer userId, String key) throws UserException, AdminException;
    public List<User> viewAllUser(String key) throws UserException, AdminException;
}
