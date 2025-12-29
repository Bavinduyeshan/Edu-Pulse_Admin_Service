package com.EduPulse.AdminService.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class QuizSummaryDTO {
    private Long id;
    private String title;
    private Long lectureId;
    private String lectureTitle;
    private Long classId;
    private String className;
    private Long lecturerId;
    private String lecturerName;
    private int totalQuestions;
    private int timeLimitMinutes;
    private int passThreshold;
    private int totalSubmissions;
    private double averageScore;
    private double passRate;
    private LocalDateTime createdAt;
}