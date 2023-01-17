--15. ¿Cuántos cumpleaños de voluntarios hay cada mes?

SELECT  extract('month' FROM fecha_nacimiento) AS "MES", COUNT(*) AS "CANTIDAD_DE_CUMPLEANIOS"
FROM unc_esq_voluntario.voluntario
GROUP BY extract('month' FROM fecha_nacimiento)
ORDER BY extract('month' FROM fecha_nacimiento)