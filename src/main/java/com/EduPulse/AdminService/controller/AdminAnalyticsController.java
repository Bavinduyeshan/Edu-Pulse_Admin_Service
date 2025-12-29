package com.EduPulse.AdminService.controller;


import com.EduPulse.AdminService.dto.PlatformOverviewDTO;
import com.EduPulse.AdminService.service.AdminAnalyticsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/analytics")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.OPTIONS})

public class AdminAnalyticsController {

    private final AdminAnalyticsService adminAnalyticsService;

    @GetMapping("/overview")
    public ResponseEntity<PlatformOverviewDTO> getOverview() {
        return ResponseEntity.ok(adminAnalyticsService.getPlatformOverview());
    }
}