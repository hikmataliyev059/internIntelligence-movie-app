package com.movieapi.mapper;

import com.movieapi.dao.request.MovieRequest;
import com.movieapi.dao.response.MovieResponse;
import com.movieapi.entity.MovieEntity;

public enum MovieMapper {

    MOVIE_MAPPER;

    public MovieResponse mapToResponse(MovieEntity movieEntity) {
        return MovieResponse.builder()
                .id(movieEntity.getId())
                .title(movieEntity.getTitle())
                .genre(movieEntity.getGenre())
                .director(movieEntity.getDirector())
                .releaseYear(movieEntity.getReleaseYear())
                .imdbRating(movieEntity.getImdbRating())
                .build();
    }

    public MovieEntity mapToEntity(MovieRequest movieRequest) {
        return MovieEntity.builder()
                .title(movieRequest.getTitle())
                .genre(movieRequest.getGenre())
                .director(movieRequest.getDirector())
                .releaseYear(movieRequest.getReleaseYear())
                .imdbRating(movieRequest.getImdbRating())
                .build();
    }
}
