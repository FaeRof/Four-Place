package com.four_place.service;

import com.four_place.domain.dto.RestaurantDto;
import com.four_place.domain.entity.RestaurantEntity;
import com.four_place.domain.mapping.RestaurantMapper;
import com.four_place.repository.RestaurantRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RestaurantService {

    private final RestaurantRepository restaurantRepository;

    private final RestaurantMapper restaurantMapper;


    public RestaurantService(final RestaurantRepository restaurantRepository,
                             final RestaurantMapper restaurantMapper) {
        this.restaurantRepository = restaurantRepository;
        this.restaurantMapper = restaurantMapper;
    }

    public void save(RestaurantDto restaurantDto) {
        restaurantRepository.save(restaurantMapper.toEntity(restaurantDto));
    }

    public RestaurantDto getRestaurant(long id){
        RestaurantEntity entity = restaurantRepository.findById(id);
        return restaurantMapper.fromEntity(entity);
    }

    public void deleteById(long id){
        restaurantRepository.deleteById(id);
    }
}
