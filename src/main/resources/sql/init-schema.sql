CREATE TABLE genre
(
    genre_id BIGINT AUTO_INCREMENT NOT NULL,
    name     VARCHAR(255)          NULL,
    CONSTRAINT pk_genre PRIMARY KEY (genre_id)
);

CREATE TABLE movie
(
    movie_id     BIGINT AUTO_INCREMENT NOT NULL,
    title        VARCHAR(50)           NULL,
    release_date VARCHAR(255)          NULL,
    rating       INT                   NULL,
    genre_id     BIGINT                NOT NULL,
    CONSTRAINT pk_movie PRIMARY KEY (movie_id)
);

ALTER TABLE movie
    ADD CONSTRAINT FK_MOVIE_ON_GENRE FOREIGN KEY (genre_id) REFERENCES genre (genre_id);

CREATE TABLE actor
(
    actor_id BIGINT AUTO_INCREMENT NOT NULL,
    name     VARCHAR(255)          NULL,
    age      VARCHAR(255)          NULL,
    weight   DOUBLE                NULL,
    story    VARCHAR(255)          NULL,
    CONSTRAINT pk_actor PRIMARY KEY (actor_id)
);

CREATE TABLE movie_actors
(
    actor_id BIGINT NOT NULL,
    movie_id BIGINT NOT NULL,
    CONSTRAINT pk_movie_actors PRIMARY KEY (actor_id, movie_id)
);

ALTER TABLE movie_actors
    ADD CONSTRAINT fk_on_actor FOREIGN KEY (actor_id) REFERENCES actor (actor_id);

ALTER TABLE movie_actors
    ADD CONSTRAINT fk_on_movie FOREIGN KEY (movie_id) REFERENCES movie (movie_id);