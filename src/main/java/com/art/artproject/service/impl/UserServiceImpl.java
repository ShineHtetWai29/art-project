package com.art.artproject.service.impl;

import com.art.artproject.domain.NewUserRequest;
import com.art.artproject.domain.UserResponse;
import com.art.artproject.entity.Feedback;
import com.art.artproject.entity.User;
import com.art.artproject.repo.FeedbackRepo;
import com.art.artproject.repo.UserRepo;
import com.art.artproject.service.UserService;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private ModelMapper mapper;

    @Override
    public UserResponse registerUser(NewUserRequest request) {
        User user=User.of(request);
        return mapper.map(userRepo.save(user),UserResponse.class);
    }
}
