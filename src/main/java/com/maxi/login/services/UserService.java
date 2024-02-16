package com.maxi.login.services;

import com.maxi.login.domains.User;
import com.maxi.login.dtos.UserRequestDTO;

public interface UserService {

    public User register(UserRequestDTO data);
}
