package com.movieapi.controller;

import com.movieapi.dao.request.MovieRequest;
import com.movieapi.dao.response.MovieResponse;
import com.movieapi.service.MovieService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.movieapi.enums.MovieApiDocs.*;
import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping("api/v1/movie")
@Tag(name = GET_TAG, description = API_DESCRIPTION)
public class MovieController {

    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @Operation(
            summary = GET_ALL_MOVIES_SUMMARY,
            description = GET_ALL_MOVIES_DESCRIPTION,
            tags = {GET_TAG}
    )
    @GetMapping
    public List<MovieResponse> getAllMovies() {
        return movieService.getAllMovies();
    }

    @Operation(
            summary = GET_MOVIE_BY_ID_SUMMARY,
            description = GET_MOVIE_BY_ID_DESCRIPTION,
            tags = {GET_TAG}
    )
    @GetMapping("{id}")
    public MovieResponse getMovieById(@PathVariable Long id) {
        return movieService.getMovieById(id);
    }

    @Operation(
            summary = CREATE_MOVIE_SUMMARY,
            description = CREATE_MOVIE_DESCRIPTION,
            tags = {GET_TAG}
    )
    @PostMapping
    @ResponseStatus(CREATED)
    public MovieResponse createMovie(@Valid @RequestBody MovieRequest movieRequest) {
        return movieService.createMovie(movieRequest);
    }

    @Operation(
            summary = UPDATE_MOVIE_SUMMARY,
            description = UPDATE_MOVIE_DESCRIPTION,
            tags = {GET_TAG}
    )
    @PutMapping("{id}")
    @ResponseStatus(NO_CONTENT)
    public MovieResponse updateMovie(@Valid @RequestBody MovieRequest movieRequest, @PathVariable Long id) {
        return movieService.updateMovie(movieRequest, id);
    }

    @Operation(
            summary = DELETE_MOVIE_SUMMARY,
            description = DELETE_MOVIE_DESCRIPTION,
            tags = {GET_TAG}
    )
    @DeleteMapping("{id}")
    @ResponseStatus(NO_CONTENT)
    public void deleteMovieById(@PathVariable Long id) {
        movieService.deleteMovieById(id);
    }
}
