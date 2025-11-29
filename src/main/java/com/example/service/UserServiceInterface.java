package com.example.service;

import java.util.List;

import com.example.dto.CreateUserRequest;
import com.example.dto.UserDto;

public interface UserServiceInterface {
        UserDto createUser(CreateUserRequest request);
        UserDto getUser(Long id);
        UserDto updateUser(Long id, CreateUserRequest request);
        void deleteUser(Long id);
        List<UserDto> getAllUsers();
}