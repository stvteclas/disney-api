package com.teclas.disney.model.entity;


import lombok.Getter;
import lombok.Setter;


import javax.persistence.*;
import java.util.ArrayList;

import java.util.List;

import static javax.persistence.CascadeType.PERSIST;
import static javax.persistence.FetchType.LAZY;

@Getter
@Setter
@Entity
@Table(name = "actor")
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="actor_id")
    private Long id;

    private String image;

    private String name;

    private String age;

    private Double weight;

    private String story;
    @ManyToMany(mappedBy = "actors" , fetch = LAZY, cascade=PERSIST)
    private List<Movie> movies = new ArrayList<>();



}
