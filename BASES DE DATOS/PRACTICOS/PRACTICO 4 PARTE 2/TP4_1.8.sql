SELECT v.id_video, e.fecha_entrega, r.cantidad
FROM unc_esq_peliculas.renglon_entrega r JOIN unc_esq_peliculas.entrega e ON (r.nro_entrega = e.nro_entrega)
    JOIN unc_esq_peliculas.video v ON (e.id_video = v.id_video)
GROUP BY v.id_video, e.fecha_entrega, r.cantidad
ORDER BY e.fecha_entrega