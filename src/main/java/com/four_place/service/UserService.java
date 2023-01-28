package com.four_place.service;

import com.four_place.domain.dto.UserDto;
import com.four_place.domain.entity.UserEntity;
import com.four_place.domain.mapping.UserMapper;
import com.four_place.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    private final UserMapper userMapper;

    public UserService(final UserRepository userRepository, final UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    public void save(UserDto userDto) {
        UserEntity entity = userRepository.save(userMapper.toEntity(userDto));
        userMapper.fromEntity(entity);
    }

    public List<UserDto> getAllByName(String name){
        List<UserEntity> entities = userRepository.getAllByUsername(name);
        return userMapper.listFromEntity(entities);
    }

    public void deleteById(long id) {
        userRepository.deleteById(id);
    }
}
