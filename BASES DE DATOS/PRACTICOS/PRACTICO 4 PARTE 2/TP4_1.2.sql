SELECT count(*)
FROM unc_esq_peliculas.pelicula p
WHERE p.codigo_pelicula IN (

        SELECT r.codigo_pelicula
        FROM unc_esq_peliculas.renglon_entrega r
        WHERE r.nro_entrega IN (

            SELECT e.nro_entrega
            FROM unc_esq_peliculas.entrega e JOIN unc_esq_peliculas.distribuidor d ON (e.id_distribuidor = d.id_distribuidor)
            WHERE extract(YEAR FROM e.fecha_entrega) = '2006' AND  d.tipo = 'N'

            )
    );

