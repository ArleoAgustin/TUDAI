--Muestre los apellidos, nombres y mails de los empleados con cuentas de gmail y cuyo sueldo sea superior a $ 1000. (P)

SELECT apellido, nombre, e_mail
FROM unc_esq_peliculas.empleado
WHERE e_mail LIKE '%gmail____';

