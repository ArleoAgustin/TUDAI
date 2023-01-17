--13. Calcular la cantidad de empleados por departamento. (P)

SELECT id_departamento, count(*) as "cant_empleados"
FROM unc_esq_peliculas.empleado
GROUP BY  id_departamento;