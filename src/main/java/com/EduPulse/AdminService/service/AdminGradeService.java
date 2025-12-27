package com.EduPulse.AdminService.service;


import com.EduPulse.AdminService.client.UserServiceClient;
import com.EduPulse.AdminService.dto.GradeDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminGradeService {

    private final UserServiceClient userClient;

    public List<GradeDTO> getAllGrades() {
        return userClient.getAllGrades();
    }

    public GradeDTO createGrade(GradeDTO grade) {
        return userClient.createGrade(grade);
    }

    public GradeDTO updateGrade(Long id, GradeDTO grade) {
        return userClient.updateGrade(id, grade);
    }

    public void deleteGrade(Long id) {
        userClient.deleteGrade(id);
    }
}