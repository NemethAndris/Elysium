package org.example.controller.dto;

public record UserRegistrationDTO(
        String username,
        String password,
        String userEmail
) {}