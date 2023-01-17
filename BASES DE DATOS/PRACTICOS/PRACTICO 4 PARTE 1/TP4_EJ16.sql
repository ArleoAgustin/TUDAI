--16. ¿Cuáles son las 2 instituciones que más voluntarios tienen?

SELECT  id_institucion, COUNT(*) AS "CANT_VOLUNTARIOS"
FROM unc_esq_voluntario.voluntario
GROUP BY id_institucion
ORDER BY  COUNT(id_institucion) DESC
LIMIT '2'

