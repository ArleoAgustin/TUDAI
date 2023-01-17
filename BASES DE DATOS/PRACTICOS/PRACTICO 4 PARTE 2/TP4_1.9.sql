SELECT c.nombre_ciudad, count(e.id_empleado) AS "total"
FROM unc_esq_peliculas.ciudad c JOIN unc_esq_peliculas.departamento d ON (c.id_ciudad = d.id_ciudad)
    JOIN unc_esq_peliculas.empleado e ON (d.id_departamento = e.id_departamento AND d.id_distribuidor = e.id_distribuidor)
    WHERE AGE(e.fecha_nacimiento) >= '18 years'
    GROUP BY c.nombre_ciudad
    HAVING count(e.id_empleado) > 30;