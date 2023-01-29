package com.four_place.controller;

import com.four_place.domain.dto.RestaurantDto;
import com.four_place.service.RestaurantService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    private final RestaurantService restaurantService;

    public RestaurantController(final RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    @PostMapping("/save")
    public ResponseEntity<RestaurantDto> saveRestaurant(@RequestBody RestaurantDto restaurant) {
        restaurantService.save(restaurant);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RestaurantDto> getById(@RequestParam("id") Long id) {
        return new ResponseEntity<>(restaurantService.getRestaurant(id), HttpStatus.OK);
    }
}
