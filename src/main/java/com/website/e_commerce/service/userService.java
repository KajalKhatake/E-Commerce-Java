package com.website.e_commerce.service;

import com.website.e_commerce.exception.UserException;
import com.website.e_commerce.model.User;
import jdk.jshell.spi.ExecutionControl;

public interface userService {

    public User findUserById(long userId)throws UserException;
    public User fineUserProfileByJwt(String jwt)throws UserException;
}
