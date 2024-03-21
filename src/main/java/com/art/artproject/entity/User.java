package com.art.artproject.entity;

import com.art.artproject.domain.NewUserRequest;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "user_art")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private String userName;
    private String phoneNumber;
    private String mail;
    private String profileImage;
    private String password;

    @OneToMany(mappedBy = "user" )
    private List<Card> cards = new ArrayList<>();public static User of(NewUserRequest request){
        User user=new User();
        user.firstName=request.getFirstName();
        user.lastName=request.getLastName();
        user.userName=request.getUserName();
        user.phoneNumber=request.getPhoneNumber();
        user.mail=request.getMail();
        user.profileImage=request.getProfileImage();
        user.password=request.getPassword();
        return user;
    }



}