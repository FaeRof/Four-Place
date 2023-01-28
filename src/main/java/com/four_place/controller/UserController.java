package com.four_place.controller;

import com.four_place.domain.dto.UserDto;
import com.four_place.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(final UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/save")
    public ResponseEntity<UserDto> saveUser(@RequestBody UserDto user){
        userService.save(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{name}")
    public ResponseEntity<List<UserDto>> getAllByUsername(@RequestParam("name") String name){
        return new ResponseEntity<>(userService.getAllByName(name), HttpStatus.OK);
    }

}
