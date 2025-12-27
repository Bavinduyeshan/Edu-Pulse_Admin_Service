package com.EduPulse.AdminService.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class UserDetailsDTO {
    private Long id;
    private String fullName;
    private String email;
    private String username;
    private String role;
    private boolean verified;
    private boolean banned;
    private String banReason;
    private String phoneNumber;
    private LocalDate dateOfBirth;
    private String institution;
    private String department;     // for lecturers
    private String bio;
    private String profilePictureUrl;
    private Long gradeId;
    private String gradeName;
    private List<QualificationDTO> qualifications; // only for lecturers
    private LocalDateTime createdAt;
    private LocalDateTime lastLogin; // if you track it
}