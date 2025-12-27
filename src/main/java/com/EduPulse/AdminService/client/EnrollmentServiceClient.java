package com.EduPulse.AdminService.client;

import com.EduPulse.AdminService.dto.StudentPerformanceDTO;
import com.EduPulse.AdminService.dto.UserSummaryDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "enrollment-service", url = "${services.enrollment.url:http://localhost:8082}")
public interface EnrollmentServiceClient {

    @GetMapping("/api/enrollments/count")
    Long getTotalEnrollments();

    @GetMapping("/api/enrollments/class/{classId}/students")
    List<UserSummaryDTO> getEnrolledStudentsForClass(@PathVariable("classId") Long classId);

    @GetMapping("/api/enrollments/lecturer/{lecturerId}/students/count")
    Long getStudentCountForLecturer(@PathVariable("lecturerId") Long lecturerId);

    @GetMapping("/api/enrollments/lecturer/student/{studentId}/details")
    StudentPerformanceDTO getStudentPerformance(@PathVariable("studentId") Long studentId);
}