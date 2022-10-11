package com.teclas.disney.controller;

import com.teclas.disney.model.entity.Genre;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping( "/api/genres" )
public class GenreController {

    @PostMapping
    public void createGenres( @RequestBody Genre genre ) {
        log.info( "Post genres: " + genre );
    }
}
