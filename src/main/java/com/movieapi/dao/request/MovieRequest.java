package com.movieapi.dao.request;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class MovieRequest {

    private String title;
    private String director;
    private Integer releaseYear;
    private String genre;
    @DecimalMin(value = "0.0", message = "Please enter correct value")
    @DecimalMax(value = "10.0", message = "Please enter correct value")
    private BigDecimal imdbRating;
}
