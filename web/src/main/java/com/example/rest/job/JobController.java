package com.example.rest.job;

import com.example.rest.job.dto.ListJobResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rest/v1/jobs")
public class JobController {

    @GetMapping
    public ListJobResponse listJobs() {
        return ListJobResponse.builder()
                .id("1")
                .title("Tester")
                .description("Test job")
                .build();
    }

}
