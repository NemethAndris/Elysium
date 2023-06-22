package org.example.controller;

import org.example.controller.dto.UserRegistrationDTO;

import org.example.model.users.JobHunter;

import org.example.service.JobHunterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/jobHunter")
public class JobHunterController {
    private final JobHunterService jobHunterService;
    @Autowired
    public JobHunterController(JobHunterService jobHunterService) {
        this.jobHunterService = jobHunterService;
    }


    @PostMapping("/registration")
    public ResponseEntity<String> registration(@RequestBody UserRegistrationDTO userRegistrationDTO) {
        try {
            if (jobHunterService.exists(userRegistrationDTO)) {
                return ResponseEntity.status(HttpStatus.CONFLICT)
                        .body("User already exists!");
            }

            JobHunter employerToAdd = JobHunter
                    .builder()
                    .userName(userRegistrationDTO.userName())
                    .userEmail(userRegistrationDTO.userEmail())
                    .password(userRegistrationDTO.password())
                    .build();

            jobHunterService.saveJobHunter(employerToAdd);

            return ResponseEntity.ok("User added.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("An error occurred.");
        }
    }

}

