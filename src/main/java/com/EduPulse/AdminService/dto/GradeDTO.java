package com.EduPulse.AdminService.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GradeDTO {

    private Long id;

    private String name;          // e.g., "Grade 10", "O/L", "A/L"

    private String description;   // Optional: "Ordinary Level Science Stream"

    private LocalDateTime createdAt = LocalDateTime.now();
}