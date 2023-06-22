package org.example.controller;

import org.example.controller.dto.UserRegistrationDTO;
import org.example.model.users.Employer;
import org.example.service.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employer")
public class EmployerController {

    private final EmployerService employerService;

    @Autowired
    public EmployerController( EmployerService employerService) {
        this.employerService = employerService;
    }



    @PostMapping("/registration")
    public ResponseEntity<String> registration(@RequestBody UserRegistrationDTO userRegistrationDTO) {
        try {
            if (employerService.exists(userRegistrationDTO)) {
                return ResponseEntity.status(HttpStatus.CONFLICT)
                        .body("User already exists!");
            }

            Employer employerToAdd = Employer
                    .builder()
                    .userName(userRegistrationDTO.username())
                    .password(userRegistrationDTO.password())
                    .userEmail(userRegistrationDTO.userEmail())
                    .build();

            employerService.saveEmployer(employerToAdd);

            return ResponseEntity.ok("User added.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An error occurred.");
        }
    }

}
