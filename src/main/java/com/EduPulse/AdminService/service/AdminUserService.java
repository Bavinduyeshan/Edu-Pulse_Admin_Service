package com.EduPulse.AdminService.service;


import com.EduPulse.AdminService.client.UserServiceClient;
import com.EduPulse.AdminService.dto.UserDetailsDTO;
import com.EduPulse.AdminService.dto.UserResponse;
import com.EduPulse.AdminService.dto.UserSummaryDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class AdminUserService {

    private final UserServiceClient userClient;

    public List<UserResponse> getAllUsers() {  // ✅ Changed return type
        return userClient.getAllUsers();
    }

    public UserResponse getUserDetails(Long userId) {  // ✅ Changed return type
        return userClient.getUserById(userId);
    }

    public List<UserResponse> getPendingLecturers() {  // ✅ Changed return type
        return userClient.getPendingLecturers();
    }

    public void verifyLecturer(Long lecturerId, boolean approve) {
        userClient.verifyLecturer(lecturerId, approve);
    }

    public void toggleBan(Long userId, boolean ban, String reason) {
        userClient.toggleBan(userId, ban, reason);
    }
}