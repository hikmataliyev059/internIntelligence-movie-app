package com.movieapi.exception;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@Getter
@Setter
public class ErrorResponse {

    private String message;
    private LocalDateTime timestamp;
    private List<String> errors;
}
