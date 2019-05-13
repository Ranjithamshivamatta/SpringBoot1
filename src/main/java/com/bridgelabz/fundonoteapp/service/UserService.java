package com.bridgelabz.fundonoteapp.service;

import com.bridgelabz.fundonoteapp.model.User;

public interface UserService {
    public String login(User user);

    public User userReg(User user);

	String encryptedPassword(User user);

}