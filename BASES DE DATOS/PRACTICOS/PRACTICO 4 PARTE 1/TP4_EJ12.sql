--12. Listar la cantidad de películas que hay por cada idioma. (P)

SELECT idioma, count(*) as "cantidad_peliculas"
FROM unc_esq_peliculas.pelicula
GROUP BY  idioma;