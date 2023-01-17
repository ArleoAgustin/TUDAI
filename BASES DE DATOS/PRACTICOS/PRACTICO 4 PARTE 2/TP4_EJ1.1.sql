SELECT DISTINCT  p.titulo, p.idioma
FROM unc_esq_peliculas.pelicula p
WHERE p.idioma = 'Inglés' AND p.codigo_pelicula IN (

    SELECT r.codigo_pelicula
    FROM unc_esq_peliculas.renglon_entrega r
    WHERE r.nro_entrega IN (

        SELECT e.nro_entrega
        FROM unc_esq_peliculas.entrega e
        WHERE extract (YEAR FROM e.fecha_entrega) = '2006'
        )
    );