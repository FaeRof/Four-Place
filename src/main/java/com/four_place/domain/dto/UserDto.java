package com.four_place.domain.dto;

import lombok.Data;

import java.util.Date;

@Data
public class UserDto {

    private Long id;

    private String username;

    private String surname;

    private Date birthDate;

    private String phone;

    private String email;

    private String password;
}
