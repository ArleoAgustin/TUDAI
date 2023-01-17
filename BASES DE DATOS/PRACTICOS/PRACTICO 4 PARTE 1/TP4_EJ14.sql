--14. Mostrar los códigos de películas que han recibido entre 3 y 5 entregas. (cantidad de
-- entregas NO cantidad de películas entregadas).

SELECT codigo_pelicula, COUNT(*) AS "cantidad_de_entregas"
FROM unc_esq_peliculas.renglon_entrega
GROUP BY codigo_pelicula HAVING ((COUNT(*) >= 3) AND  (COUNT(*) <=5))