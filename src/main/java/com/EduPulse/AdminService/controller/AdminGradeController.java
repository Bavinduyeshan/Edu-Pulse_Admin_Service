package com.EduPulse.AdminService.controller;


import com.EduPulse.AdminService.dto.GradeDTO;
import com.EduPulse.AdminService.service.AdminGradeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/grades")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.OPTIONS})

public class AdminGradeController {

    private final AdminGradeService adminGradeService;

    @GetMapping
    public ResponseEntity<List<GradeDTO>> getAllGrades() {
        return ResponseEntity.ok(adminGradeService.getAllGrades());
    }

    @PostMapping
    public ResponseEntity<GradeDTO> createGrade(@RequestBody GradeDTO grade) {
        return ResponseEntity.ok(adminGradeService.createGrade(grade));
    }

    @PutMapping("/{id}")
    public ResponseEntity<GradeDTO> updateGrade(@PathVariable Long id, @RequestBody GradeDTO grade) {
        return ResponseEntity.ok(adminGradeService.updateGrade(id, grade));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGrade(@PathVariable Long id) {
        adminGradeService.deleteGrade(id);
        return ResponseEntity.noContent().build();
    }
}