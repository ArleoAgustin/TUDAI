-- Muestre el apellido, nombre y mail de todos los voluntarios cuyo teléfono comienza con
-- +51. Coloque el encabezado de las columnas de los títulos 'Apellido y Nombre' y 'Dirección
-- de mail' (V)

SELECT apellido ||','|| nombre AS "Apellido y Nombre", e_mail AS "Direccion de mail"
FROM unc_esq_voluntario.voluntario
WHERE telefono LIKE '+51%';


