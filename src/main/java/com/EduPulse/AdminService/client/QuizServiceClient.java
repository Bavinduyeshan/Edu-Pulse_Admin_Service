package com.EduPulse.AdminService.client;

import com.EduPulse.AdminService.dto.QuizSummaryDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "quiz-service", url = "${services.quiz.url:http://localhost:8083}")
public interface QuizServiceClient {

    @GetMapping("/api/quizzes/count")
    Long getTotalQuizzes();

    @GetMapping("/api/quizzes")
    List<QuizSummaryDTO> getAllQuizzes();

//    @GetMapping("/api/quizzes/{quizId}/results")
//    List<QuizResultSummaryDTO> getQuizResults(@PathVariable("quizId") Long quizId);
//
//    @GetMapping("/api/quizzes/analytics")
//    PlatformQuizStatsDTO getPlatformQuizStats();
}