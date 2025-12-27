package com.EduPulse.AdminService.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class ClassSummaryDTO {
    private Long id;
    private String name;
    private String description;
    private Long gradeId;
    private String gradeName;
    private Long lecturerId;
    private String lecturerName;
    private LocalDate startDate;
    private LocalDate endDate;
    private String status;
    private int lectureCount;
    private int enrolledStudentsCount;
}