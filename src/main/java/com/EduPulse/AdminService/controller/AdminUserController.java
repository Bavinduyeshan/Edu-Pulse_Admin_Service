package com.EduPulse.AdminService.controller;


import com.EduPulse.AdminService.dto.UserDetailsDTO;
import com.EduPulse.AdminService.dto.UserResponse;
import com.EduPulse.AdminService.dto.UserSummaryDTO;
import com.EduPulse.AdminService.service.AdminUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/admin/users")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.OPTIONS})
public class AdminUserController {

    private final AdminUserService adminUserService;

    @GetMapping
    public ResponseEntity<List<UserResponse>> getAllUsers() {  // ✅ Changed return type
        return ResponseEntity.ok(adminUserService.getAllUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponse> getUserDetails(@PathVariable Long id) {  // ✅ Changed return type
        return ResponseEntity.ok(adminUserService.getUserDetails(id));
    }

    @GetMapping("/pending-lecturers")
    public ResponseEntity<List<UserResponse>> getPendingLecturers() {  // ✅ Changed return type
        return ResponseEntity.ok(adminUserService.getPendingLecturers());
    }

    @PutMapping("/lecturers/{id}/verify")
    public ResponseEntity<Void> verifyLecturer(@PathVariable Long id, @RequestParam boolean approve) {
        adminUserService.verifyLecturer(id, approve);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}/ban")
    public ResponseEntity<Void> toggleBan(@PathVariable Long id, @RequestParam boolean ban, @RequestParam String reason) {
        adminUserService.toggleBan(id, ban, reason);
        return ResponseEntity.ok().build();
    }
}