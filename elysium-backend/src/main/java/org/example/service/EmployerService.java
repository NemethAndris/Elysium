package org.example.service;

import org.example.controller.dto.UserRegistrationDTO;
import org.example.model.users.Employer;

public interface EmployerService {

    boolean exists(UserRegistrationDTO userRegistrationDTO);

    void saveEmployer(Employer employer);
}
