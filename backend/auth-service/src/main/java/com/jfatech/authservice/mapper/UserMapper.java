package com.jfatech.authservice.mapper;

import com.jfatech.authservice.dtos.SignUpDto;
import com.jfatech.authservice.dtos.UserDto;
import com.jfatech.authservice.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @author Fellipe Toledo
 */
@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toUserDto(User user);

    @Mapping(target = "password", ignore = true)
    User signUpToUser(SignUpDto signUpDto);


}
