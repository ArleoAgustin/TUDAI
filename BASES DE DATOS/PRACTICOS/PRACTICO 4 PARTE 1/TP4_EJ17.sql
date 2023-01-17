--17. ¿Cuáles son los id de ciudades que tienen más de un departamento?

SELECT id_ciudad, COUNT(*) AS "CANT_DEPTO"
FROM unc_esq_peliculas.departamento
GROUP BY id_ciudad
HAVING COUNT(*) > '1'