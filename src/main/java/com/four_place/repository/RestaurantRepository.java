package com.four_place.repository;

import com.four_place.domain.entity.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<RestaurantEntity, Long> {

    RestaurantEntity findById(long id);
}
