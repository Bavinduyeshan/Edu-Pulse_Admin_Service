package com.EduPulse.AdminService.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class UserSummaryDTO {
    private Long id;
    private String fullName;
    private String email;
    private String username;
    private String role; // STUDENT / LECTURER / ADMIN
    private boolean verified;
    private boolean banned;
    private String department; // null for students
    private String gradeName;  // null for lecturers
    private LocalDateTime createdAt;
}