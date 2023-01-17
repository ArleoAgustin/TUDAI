SELECT p.titulo
FROM unc_esq_peliculas.pelicula p
WHERE p.codigo_pelicula IN (

    SELECT r.codigo_pelicula
    FROM unc_esq_peliculas.renglon_entrega r
    WHERE r.nro_entrega NOT IN(

        SELECT e.nro_entrega
        FROM unc_esq_peliculas.entrega e JOIN unc_esq_peliculas.distribuidor d ON (e.id_distribuidor = d.id_distribuidor)
        WHERE d.tipo = 'N'
        )
    )
