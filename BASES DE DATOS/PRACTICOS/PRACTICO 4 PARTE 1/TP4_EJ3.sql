--Muestre el nombre, apellido y el teléfono de todos los empleados cuyo id_tarea sea 7231,
--ordenados por apellido y nombre.(P)

SELECT apellido, nombre, telefono, id_tarea
FROM unc_esq_peliculas.empleado
WHERE id_tarea = '7231';