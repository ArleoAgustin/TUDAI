SELECT p.genero, count(*) AS "Cantidad_por_genero"
FROM unc_esq_peliculas.pelicula p JOIN unc_esq_peliculas.renglon_entrega r ON (p.codigo_pelicula = r.codigo_pelicula)
    JOIN unc_esq_peliculas.entrega e ON (r.nro_entrega = e.nro_entrega)
    WHERE extract(YEAR FROM e.fecha_entrega) >='2010'
    GROUP BY p.genero;