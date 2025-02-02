package com.movieapi.dao.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
public class MovieResponse {

    private Long id;
    private String title;
    private String director;
    private Integer releaseYear;
    private String genre;
    private BigDecimal imdbRating;
}
