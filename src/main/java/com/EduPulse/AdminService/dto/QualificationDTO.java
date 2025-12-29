package com.EduPulse.AdminService.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class QualificationDTO {
    private String qualification;
    private String institution;
    private int yearAwarded;
}