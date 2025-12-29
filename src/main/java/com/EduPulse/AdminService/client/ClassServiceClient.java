package com.EduPulse.AdminService.client;

import com.EduPulse.AdminService.dto.ClassSummaryDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;

@FeignClient(name = "class-service", url = "${services.class.url:http://localhost:8081}")
public interface ClassServiceClient {

    @GetMapping("/api/classes")
    List<ClassSummaryDTO> getAllClasses();

    @GetMapping("/api/classes/classes/{classId}")
    ClassSummaryDTO getClassById(@PathVariable("classId") Long classId);

    @GetMapping("/api/classes/lecturer/{lecturerId}")
    List<ClassSummaryDTO> getClassesByLecturer(@PathVariable("lecturerId") Long lecturerId);

    @GetMapping("/api/classes/lectures/count")
    Long getTotalLecturesCount();
}