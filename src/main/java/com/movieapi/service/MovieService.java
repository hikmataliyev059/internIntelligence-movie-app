package com.movieapi.service;

import com.movieapi.dao.request.MovieRequest;
import com.movieapi.dao.response.MovieResponse;

import java.util.List;

public interface MovieService {

    List<MovieResponse> getAllMovies();

    MovieResponse getMovieById(Long movieId);

    MovieResponse createMovie(MovieRequest movieRequest);

    MovieResponse updateMovie(MovieRequest movieRequest, Long movieId);

    void deleteMovieById(Long id);
}
