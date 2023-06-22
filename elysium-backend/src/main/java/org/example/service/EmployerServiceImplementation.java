package org.example.service;

import org.example.controller.dto.UserRegistrationDTO;
import org.example.model.users.Employer;
import org.example.repository.EmployerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployerServiceImplementation implements EmployerService {

    private final EmployerRepository employerRepository;


    @Autowired
    public EmployerServiceImplementation(EmployerRepository employerRepository) {
        this.employerRepository = employerRepository;
    }

    @Override
    public boolean exists(UserRegistrationDTO userRegistrationDTO) {
        return employerRepository.existsEmployerByUserNameAndPasswordAndUserEmail(
                userRegistrationDTO.userName(),
                userRegistrationDTO.userEmail(),
                userRegistrationDTO.password()

        );
    }

    @Override
    public void saveEmployer(Employer employer) {
        employerRepository.save(employer);
    }
}
