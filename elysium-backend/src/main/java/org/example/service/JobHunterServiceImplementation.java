package org.example.service;

import org.example.controller.dto.UserRegistrationDTO;
import org.example.model.users.JobHunter;
import org.example.repository.JobHunterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobHunterServiceImplementation implements JobHunterService {

    private final JobHunterRepository jobHunterRepository;
    @Autowired
    public JobHunterServiceImplementation(JobHunterRepository jobHunterRepository) {
        this.jobHunterRepository = jobHunterRepository;
    }

    @Override
    public boolean exists(UserRegistrationDTO userRegistrationDTO) {
        return jobHunterRepository.existsJobHunterByUserNameAndPasswordAndUserEmail(
                userRegistrationDTO.userName(),
                userRegistrationDTO.userEmail(),
                userRegistrationDTO.password()

        );
    }

    @Override
    public void saveJobHunter(JobHunter jobHunter) {
        jobHunterRepository.save(jobHunter);
    }
}
