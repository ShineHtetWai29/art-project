package com.art.artproject.service;

import com.art.artproject.domain.NewUserRequest;
import com.art.artproject.domain.UserResponse;
import com.art.artproject.entity.User;

public interface UserService {
    UserResponse registerUser(NewUserRequest request);
}
