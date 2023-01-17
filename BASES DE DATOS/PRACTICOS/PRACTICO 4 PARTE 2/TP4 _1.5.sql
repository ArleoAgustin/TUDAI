SELECT *
FROM unc_esq_peliculas.empleado j
WHERE EXISTS(

    SELECT e.id_jefe
    FROM unc_esq_peliculas.empleado e
    WHERE e.id_jefe = j.id_empleado)
    AND (j.id_departamento, j.id_distribuidor) IN (

    SELECT d.id_departamento, d.id_distribuidor
    FROM unc_esq_peliculas.departamento d
    WHERE d.id_ciudad IN (

        SELECT c.id_ciudad
        FROM unc_esq_peliculas.ciudad c
        WHERE c.id_pais IN (

            SELECT p.id_pais
            FROM unc_esq_peliculas.pais p
            WHERE nombre_pais = 'ARGENTINA'
        )
    )
)
ORDER BY j.id_jefe;