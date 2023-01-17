--Muestre el apellido y el identificador de la tarea de todos los voluntarios que no tienen
--coordinador.(V)

SELECT apellido, id_tarea
FROM unc_esq_voluntario.voluntario
WHERE id_coordinador IS NULL