INSERT INTO genre (genre_id, name)
VALUES (0, 'Infatil'),
       (1, 'Ficción');

INSERT INTO movie (genre_id, movie_id, title, release_date, rating)
VALUES (0, 0, 'Toy Story', '1994', 5),
       (0, 1, 'Toy Story 2', '2000', 3),
       (1, 2, 'Star Wars', '1977', 4);

INSERT INTO actor (actor_id, name, age, weight, story)
VALUES (0, 'Woody', '30', 0.25, 'Es un comisario'),
       (1, 'Buzz Lightyear', '30', 0.40, 'Es un guardian espacial'),
       (2, 'Anakin Skywalker', 'Fallecido', 0, 'Fue un antiguo guerrero Jedi');

INSERT INTO movie_actors (actor_id, movie_id)
VALUES (0, 0),
       (0, 1),
       (1, 0),
       (1, 1),
       (2, 2);
