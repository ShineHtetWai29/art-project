package com.art.artproject.domain;

import com.art.artproject.entity.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NewUserRequest {
    private String firstName;
    private String lastName;
    private String userName;
    private String phoneNumber;
    private String mail;
    private String profileImage;
    private String password;


}