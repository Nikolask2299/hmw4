package com.example.dto;

import java.time.LocalDateTime;

import org.springframework.hateoas.RepresentationModel;

import com.example.entity.User;

public class UserDto extends RepresentationModel<UserDto> {
    Long id;
    String name;
    String email;
    Integer age;
    LocalDateTime createdAt;

    public UserDto() {}

    public UserDto(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
        this.age = user.getAge();
        this.createdAt = user.getCreatedAt();
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}
    public Integer getAge() {return age;}
    public void setAge(Integer age) {this.age = age;}
    public LocalDateTime getCreatedAt() {return createdAt;}
}
