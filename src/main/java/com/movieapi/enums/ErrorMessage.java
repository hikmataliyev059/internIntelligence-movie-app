package com.movieapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ErrorMessage {

    MOVIE_NOT_FOUND("Movie not found with given id: %s");

    private final String message;
}
