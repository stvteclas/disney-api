package com.teclas.disney.model.dto;

import com.teclas.disney.model.entity.Actor;
import com.teclas.disney.model.entity.Movie;
import lombok.Data;

import java.util.Collection;
import java.util.stream.Collectors;

@Data
public class MovieDto {
    private Long movieId;
    private String title;
    private String relaseDate;
    private Integer rating;
    private Collection<ActorDto> actors;


    public MovieDto(Movie movie){
        setMovieId(movie.getMovieId());
        setTitle(movie.getTitle());
        setRelaseDate(movie.getReleaseDate());
        setRating(movie.getRating());
        setActors(movie.getActors()
                .stream()
                .map(ActorDto::new)
                .collect(Collectors.toList()));

    }
    @Data
    private static class ActorDto{
        private Long actorId;
        private String name;
        private String age;
        private Double weight;
        private String story;

        public ActorDto(Actor actor){
            setActorId(actor.getId());
            setName(actor.getName());
            setAge(actor.getAge());
            setWeight(actor.getWeight());
            setStory(actor.getStory());
        }
    }
}
