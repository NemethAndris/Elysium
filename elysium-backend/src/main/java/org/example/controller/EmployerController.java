package org.example.controller;

import org.example.service.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class EmployerController {

    private final EmployerService employerService;

    @Autowired
    public EmployerController( EmployerService employerService) {
        this.employerService = employerService;
    }

}
