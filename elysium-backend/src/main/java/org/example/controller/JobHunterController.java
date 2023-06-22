package org.example.controller;

import org.example.service.JobHunterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class JobHunterController {
    private final JobHunterService jobHunterService;

    public JobHunterController(JobHunterService jobHunterService) {
        this.jobHunterService = jobHunterService;
    }

}

