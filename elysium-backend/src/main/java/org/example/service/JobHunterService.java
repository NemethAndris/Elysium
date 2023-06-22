package org.example.service;

import org.example.controller.dto.UserRegistrationDTO;
import org.example.model.users.JobHunter;

public interface JobHunterService {
    boolean exists(UserRegistrationDTO userRegistrationDTO);

    void saveJobHunter(JobHunter jobHunter);
}
