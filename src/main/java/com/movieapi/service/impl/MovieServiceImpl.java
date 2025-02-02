package com.movieapi.service.impl;

import com.movieapi.dao.request.MovieRequest;
import com.movieapi.dao.response.MovieResponse;
import com.movieapi.entity.MovieEntity;
import com.movieapi.exception.NotFoundException;
import com.movieapi.repository.MovieRepository;
import com.movieapi.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.movieapi.enums.ErrorMessage.MOVIE_NOT_FOUND;
import static com.movieapi.mapper.MovieMapper.MOVIE_MAPPER;
import static java.lang.String.format;

@Service
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<MovieResponse> getAllMovies() {
        return movieRepository.findAll().stream().map(MOVIE_MAPPER::mapToResponse).toList();
    }

    @Override
    public MovieResponse getMovieById(Long movieId) {
        return movieRepository.findById(movieId)
                .map(MOVIE_MAPPER::mapToResponse)
                .orElseThrow(() -> new NotFoundException(
                        format(
                                MOVIE_NOT_FOUND.getMessage(),
                                movieId
                        )
                ));
    }

    @Override
    public MovieResponse createMovie(MovieRequest movieRequest) {
        MovieEntity movieEntity = movieRepository.save(MOVIE_MAPPER.mapToEntity(movieRequest));
        return MOVIE_MAPPER.mapToResponse(movieEntity);
    }

    @Override
    public MovieResponse updateMovie(MovieRequest movieRequest, Long movieId) {
        MovieEntity movieEntity = movieRepository.findById(movieId)
                .orElseThrow(() -> new NotFoundException(
                        format(
                                MOVIE_NOT_FOUND.getMessage(),
                                movieId
                        )
                ));
        movieEntity.setTitle(movieRequest.getTitle());
        movieEntity.setDirector(movieRequest.getDirector());
        movieEntity.setGenre(movieRequest.getGenre());
        movieEntity.setImdbRating(movieRequest.getImdbRating());
        movieEntity.setReleaseYear(movieRequest.getReleaseYear());

        MovieEntity updatedMovie = movieRepository.save(movieEntity);
        return MOVIE_MAPPER.mapToResponse(updatedMovie);
    }

    @Override
    public void deleteMovieById(Long id) {
        movieRepository.deleteById(id);
    }
}
