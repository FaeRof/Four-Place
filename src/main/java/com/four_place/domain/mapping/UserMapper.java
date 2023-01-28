package com.four_place.domain.mapping;

import com.four_place.domain.dto.UserDto;
import com.four_place.domain.entity.UserEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto fromEntity(UserEntity entity);

    UserEntity toEntity(UserDto dto);

    List<UserDto> listFromEntity(List<UserEntity> entities);
}
