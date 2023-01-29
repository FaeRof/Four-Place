package com.four_place.domain.mapping;

import com.four_place.domain.dto.RestaurantDto;
import com.four_place.domain.entity.RestaurantEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RestaurantMapper {

    RestaurantDto fromEntity(RestaurantEntity entity);

    RestaurantEntity toEntity(RestaurantDto dto);

    List<RestaurantDto> listFromEntity(List<RestaurantEntity> entities);
}
