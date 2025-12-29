package com.EduPulse.AdminService.client;


import com.EduPulse.AdminService.dto.GradeDTO;
import com.EduPulse.AdminService.dto.UserDetailsDTO;
import com.EduPulse.AdminService.dto.UserResponse;
import com.EduPulse.AdminService.dto.UserSummaryDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@FeignClient(name = "user-service", url = "${services.user.url:http://localhost:8080}")
public interface UserServiceClient {

    @GetMapping("/api/users/grades")
    List<GradeDTO> getAllGrades();

    @PostMapping("/api/users/grades")
    GradeDTO createGrade(@RequestBody GradeDTO grade);

    @PutMapping("/api/users/grades/{id}")
    GradeDTO updateGrade(@PathVariable("id") Long id, @RequestBody GradeDTO grade);

    @DeleteMapping("/api/users/grades/{id}")
    void deleteGrade(@PathVariable("id") Long id);

    @GetMapping("/api/users")  // ✅ This will now work
    List<UserResponse> getAllUsers();

    @GetMapping("/api/users/getuser/{id}")  // ✅ Use existing endpoint
    UserResponse getUserById(@PathVariable("id") Long id);

    @GetMapping("/api/users/lecturers/pending")
    List<UserResponse> getPendingLecturers();

    @PutMapping("/api/users/lecturers/{id}/verify")
    void verifyLecturer(@PathVariable("id") Long id, @RequestParam boolean approve);

    @PutMapping("/api/users/{id}/ban")
    void toggleBan(
            @PathVariable("id") Long id,
            @RequestParam("ban") boolean ban,
            @RequestParam("reason") String reason,
            @RequestParam("adminId") Long adminId
    );

}