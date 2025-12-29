package com.EduPulse.AdminService.service;

import com.EduPulse.AdminService.client.ClassServiceClient;
import com.EduPulse.AdminService.client.EnrollmentServiceClient;
import com.EduPulse.AdminService.client.QuizServiceClient;
import com.EduPulse.AdminService.client.UserServiceClient;
import com.EduPulse.AdminService.dto.PlatformOverviewDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminAnalyticsService {

    private final UserServiceClient userClient;
    private final ClassServiceClient classClient;
    private final EnrollmentServiceClient enrollmentClient;
    private final QuizServiceClient quizClient;

    public PlatformOverviewDTO getPlatformOverview() {
        long totalUsers = userClient.getAllUsers().size();
        long totalStudents = userClient.getAllUsers().stream()
                .filter(u -> "STUDENT".equals(u.getRole()))
                .count();
        long totalLecturers = userClient.getAllUsers().stream()
                .filter(u -> "LECTURER".equals(u.getRole()))
                .count();
        long pendingLecturers = userClient.getPendingLecturers().size();

        long totalClasses = classClient.getAllClasses().size();
        long totalLectures = classClient.getTotalLecturesCount();
        long totalEnrollments = enrollmentClient.getTotalEnrollments();
        long totalQuizzes = quizClient.getTotalQuizzes();

        // Optional: more complex stats (e.g., average quiz score)
        double averageQuizScore = 0.0; // Can fetch from quizClient.getPlatformQuizStats() later

        return PlatformOverviewDTO.builder()
                .totalUsers(totalUsers)
                .totalStudents(totalStudents)
                .totalLecturers(totalLecturers)
                .pendingLecturers(pendingLecturers)
                .totalClasses(totalClasses)
                .totalLectures(totalLectures)
                .totalEnrollments(totalEnrollments)
                .totalQuizzes(totalQuizzes)
                .averageQuizScore(averageQuizScore)
                .build();
    }
}