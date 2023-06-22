package org.example.controller.dto;

public record UserRegistrationDTO(
        String userName,

        String userEmail,

        String password

) {}