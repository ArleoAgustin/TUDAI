--Hacer un listado de los cumpleaños de todos los empleados donde se muestre el nombre y
--el apellido (concatenados y separados por una coma) y su fecha de cumpleaños (solo el
--día y el mes), ordenado de acuerdo al mes y día de cumpleaños en forma ascendente. (P)

SELECT nombre ||', '|| apellido AS "Nombre y Apellido",
    (EXTRACT('DAY' FROM fecha_nacimiento)||'/'|| EXTRACT('MONTH' FROM fecha_nacimiento))AS "Cumpleanios"
FROM unc_esq_peliculas.empleado
ORDER BY fecha_nacimiento;




