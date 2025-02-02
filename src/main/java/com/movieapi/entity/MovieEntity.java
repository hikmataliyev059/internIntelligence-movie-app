package com.movieapi.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "movies")
@Builder
public class MovieEntity {

    @Id
    @SequenceGenerator(sequenceName = "movie_id", name = "movie_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "movie_id")
    private Long id;

    private String title;
    private String director;
    private Integer releaseYear;
    private String genre;
    private BigDecimal imdbRating;
}
