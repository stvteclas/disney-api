package com.teclas.disney.controller;


import com.teclas.disney.model.dto.MovieDto;
import com.teclas.disney.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping( "/api/movies" )
public class MovieController {

    private final MovieRepository movieRepository;

    @GetMapping( "/{id}" )
    public MovieDto getMovieDetail( @PathVariable Long id ) {
        var movie = movieRepository.findById( id ).get();
        return new MovieDto( movie );
    }
}

