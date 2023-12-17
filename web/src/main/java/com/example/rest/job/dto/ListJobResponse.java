package com.example.rest.job.dto;

import lombok.Builder;
import lombok.NonNull;

@Builder
public record ListJobResponse(
    @NonNull String id,
    @NonNull String title,
    @NonNull String description
    )
{}
