package com.training.springbootrestfullwebservices.service;

import com.training.springbootrestfullwebservices.dto.UserDto;
import com.training.springbootrestfullwebservices.entity.User;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto user);
    UserDto getUserById(Long userId);
    List<UserDto> getAllUsers();
    UserDto updateUser(UserDto user);
    void deleteUser(Long userId);
}
