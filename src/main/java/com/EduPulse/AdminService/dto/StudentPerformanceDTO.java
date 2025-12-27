package com.EduPulse.AdminService.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentPerformanceDTO {
    private Long studentId;
    private String fullName;
    private String email;
    private String gradeName;
    private int totalEnrolledClasses;
    private int totalLecturesAttended;
    private int totalLectures;
    private double attendanceRate;
    private int totalQuizzesTaken;
    private double averageQuizScore;
    private int passedQuizzes;
    private double overallPassRate;
}