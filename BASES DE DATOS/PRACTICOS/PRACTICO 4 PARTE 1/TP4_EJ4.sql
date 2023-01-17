--Muestre el apellido e identificador de todos los empleados que no cobran porcentaje de
--comisión.(P)

SELECT apellido, id_empleado, porc_comision
FROM unc_esq_peliculas.empleado
WHERE porc_comision IS NULL