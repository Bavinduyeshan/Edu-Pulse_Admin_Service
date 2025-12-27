package com.EduPulse.AdminService.dto;

import lombok.Builder;
import lombok.Data;

// Platform-wide overview stats (dashboard home)
@Data
@Builder
public class PlatformOverviewDTO {
    private long totalUsers;
    private long totalStudents;
    private long totalLecturers;
    private long pendingLecturers;
    private long totalClasses;
    private long totalLectures;
    private long totalEnrollments;
    private long totalQuizzes;
    private double averageQuizScore;
    private double overallPassRate;
}
