package com.teclas.disney.model.dto;

import com.teclas.disney.model.entity.Actor;
import com.teclas.disney.model.entity.Movie;
import lombok.Data;

import java.util.Collection;
import java.util.stream.Collectors;

@Data
public class ActorDto {
    private Long id;
    private String name;
    private String age;
    private Double weight;
    private String story;
    private Collection<MovieDto> movies;

    public ActorDto(Actor actor){
        setId(actor.getId());
        setName(actor.getName());
        setAge(actor.getAge());
        setWeight(actor.getWeight());
        setStory(actor.getStory());
        setMovies(actor.getMovies()
                .stream()
                .map(MovieDto::new)
                .collect(Collectors.toList()));
    }

    @Data
    private static class MovieDto{
        private Long movieId;
        private String title;
        private String releaseDate;
        private Integer rating;

        public MovieDto(Movie movie){
            setMovieId(movie.getMovieId());
            setTitle(movie.getTitle());
            setReleaseDate(movie.getReleaseDate());
            setRating(movie.getRating());
        }
    }
}
