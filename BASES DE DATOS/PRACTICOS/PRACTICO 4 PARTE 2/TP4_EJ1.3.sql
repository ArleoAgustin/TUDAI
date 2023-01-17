-- 1.3. Indicar los departamentos que no posean empleados cuya diferencia de sueldo
-- máximo y mínimo (asociado a la tarea que realiza) no supere el 40% del sueldo máximo.

SELECT id_empleado, sueldo_maximo, sueldo_minimo, (sueldo_maximo - sueldo_minimo) AS diferencia
FROM unc_esq_peliculas.tarea t,  unc_esq_peliculas.empleado e
WHERE e.id_tarea = t.id_tarea
AND (sueldo_maximo - sueldo_minimo) <= sueldo_maximo * 0.4 LIMIT 40;
