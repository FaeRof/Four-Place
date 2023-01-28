package com.four_place.repository;

import com.four_place.domain.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<UserEntity, Long> {

    List<UserEntity> getAllByUsername(String name);
}
