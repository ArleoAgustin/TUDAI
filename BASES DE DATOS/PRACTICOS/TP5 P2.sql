-- Ejercicio 1
-- A.	No puede haber voluntarios de más de 70 años.

--1) ATRIBUTO
alter table unc_esq_voluntario.voluntario
add constraint ck_edad_voluntario
check ( age(fecha_nacimiento) < '70');

-- B.	Ningún voluntario puede aportar más horas que las de su coordinador.

--3) TABLA
alter table unc_esq_voluntario.voluntario
add constraint ck_horas_aportadas_volunt
check (not exists (select 1
                from unc_esq_voluntario.voluntario v1 join unc_esq_voluntario.voluntario v2 on (v1.id_coordinador = v2.nro_voluntario)
                where v1.horas_aportadas >  v2.horas_aportadas));


-- C.	Las horas aportadas por los voluntarios deben estar dentro de los valores máximos y mínimos consignados en la tarea.

--4) ASSERTION
create assertion horas_aportados
check (not exists (SELECT 1
                   FROM vol_voluntario v JOIN vol_tarea vt ON (v.id_tarea = vt.id_tarea)
                   WHERE v.horas_aportadas NOT BETWEEN (vt.min_horas AND vt.max_horas) ));

-- D.	Todos los voluntarios deben realizar la misma tarea que su coordinador.

--3) TABLA
alter table unc_esq_voluntario.voluntario
add constraint ck_tarea_realizada_por_voluntarios
check (not exists(
                    select 1
                    from unc_esq_voluntario.voluntario v JOIN unc_esq_voluntario.voluntario v2 on (v.nro_voluntario = voluntario.id_coordinador)
                    where v.id_tarea = v2.id_tarea
    ))

-- E.	Los voluntarios no pueden cambiar de institución más de tres veces en el año.
--3) TABLA
alter table unc_esq_voluntario.historico
add constraint ck_cambio_institucion
check (not exists(
                    SELECT nro_voluntario, count(id_institucion)
                    FROM unc_esq_voluntario.historico
                    WHERE (EXTRACT(YEAR FROM fecha_inicio) = EXTRACT( YEAR FROM fecha_fin))
                    GROUP BY nro_voluntario, id_institucion
                    HAVING COUNT(id_institucion) > 3
    ))

-- F.	En el histórico, la fecha de inicio debe ser siempre menor que la fecha de finalización.
-- 2) TUPLA

alter table unc_esq_voluntario.historico
add constraint ck_fecha
check (fecha_inicio < fecha_fin);

----------------------------- EJERCICIO 2 -------------------------------------------------------
--A.	Para cada tarea el sueldo máximo debe ser mayor que el sueldo mínimo.
-- Tarea | sueldo_max y sueldo_min | tupla

--- 2) REGISTRO/TUPLA (FILA)
ALTER TABLE unc_esq_peliculas.tarea
ADD ck_sueldo_max
CHECK (sueldo_maximo > sueldo_minimo) ;


--B.	No puede haber más de 70 empleados en cada departamento.
-- Empleado |	Id_departamento, id_distribuidor |	Tabla

ALTER TABLE unc_esq_peliculas.empleado
ADD CONSTRAINT ck_max_cant_empleados
CHECK ( NOT EXISTS(
        select 1 --id_departamento, id_distribuidor, count(*) as cant_empleados
        from unc_esq_peliculas.empleado
        group by id_departamento, id_distribuidor
        having count(*) > 70
        order by count(*) desc
    ));

--C.	Los empleados deben tener jefes que pertenezcan al mismo departamento.
-- Empleado Empleado (jefe) |	Id_empleado Id_jefe Id_departamento Id_distribuidor	| Tabla

ALTER TABLE unc_esq_peliculas.empleado
ADD CONSTRAINT ck_empleado_jefe
CHECK ( NOT EXISTS (
                    select 1 --e1.id_empleado, e1.id_jefe, e2.id_empleado, e1.id_departamento as depe1, e2.id_departamento as depe2
                    from unc_esq_peliculas.empleado e1 join unc_esq_peliculas.empleado e2 on (e1.id_jefe = e2.id_empleado)
                    where ((e1.id_distribuidor <> e2.id_distribuidor) and (e1.id_departamento <> e2.id_departamento))
    ));


--D.	Todas las entregas, tienen que ser de películas de un mismo idioma.
-- Entrega -- Renglon_entrega | -- Pelicula	Nro_entrega x2 -- idioma	| General o BD

CREATE ASSERTION entrega_mismo_idioma
CHECK ( NOT EXISTS (
                    select 1
                    from unc_esq_peliculas.entrega e join unc_esq_peliculas.renglon_entrega r on (e.nro_entrega = r.nro_entrega)
                                                     join unc_esq_peliculas.pelicula p on (r.codigo_pelicula = p.codigo_pelicula)
                    group by r.nro_entrega
                    having count (p.idioma) > 1
    );

--E.	No pueden haber más de 10 empresas productoras por ciudad.
-- Empresa_productora	| Id_ciudad, codigo_productora	| Tabla

--- 3) TABLA
ALTER TABLE unc_esq_peliculas.empresa_productora
ADD CONSTRAINT ck_cant_empresas_por_ciudad
CHECK ( NOT EXISTS (
                    select 1
                    from unc_esq_peliculas.empresa_productora
                    group by id_ciudad
                    having count(id_ciudad) > 10
                    order by id_ciudad
    ));

--F.	Para cada película, si el formato es 8mm, el idioma tiene que ser francés.
-- Pelicula	| Formato, idioma	| Tupla
ALTER TABLE unc_esq_peliculas.pelicula
ADD CONSTRAINT ck_formato_idioma
CHECK ((formato like '8' and idioma = 'Francés') or (formato not like '8'));

--G.	El teléfono de los distribuidores Nacionales debe tener la misma característica que la de su distribuidor mayorista.
-- Nacional
-- Distribuidor	| Telefono TipoId_distribuidor x2 (o más?)  Id_distribuidor_mayorista	| General o BD

CREATE ASSERTION telefono_distribuidor
CHECK ( NOT EXISTS (
                select 1 --n1.id_distribuidor, d1.telefono
                from unc_esq_peliculas.distribuidor d1 join unc_esq_peliculas.nacional n1 on (d1.id_distribuidor = n1.id_distribuidor)
                where substring(d1.telefono, 1, 3) not in (
                                                            select substring(d2.telefono, 1, 3)
                                                            from unc_esq_peliculas.distribuidor d2 join unc_esq_peliculas.nacional n2 on (d2.id_distribuidor = n2.id_distrib_mayorista)
                                                            where n2.id_distrib_mayorista is not null))
    );

---- Viviana lo corrigó en el foro:

CREATE ASSERTION telefono_distribuidor
CHECK ( NOT EXISTS (
                    select 1
                    from distribuidor d1 join nacional n1
                    on (d1.id_distribuidor = n1.id_distribuidor)
                    where id_distrib_mayorista is not null AND substring(d1.telefono, 1, 3) != (
                                                                                                select substring(d2.telefono, 1, 3)
                                                                                                from distribuidor d2
                                                                                                where d2.id_distribuidor = n1.id_distrib_mayorista)));


--H.	Las fechaS de entrega de las películas no debe ser menor a “hoy”.
-- Entrega |	Fecha_entrega |	Atributo

ALTER TABLE unc_esq_peliculas.entrega
ADD CONSTRAINT ck_tabla_fecha_entrega
CHECK (entrega.fecha_entrega  > (current_timestamp)); -- now() no funciona

----------------------------- EJERCICIO 3 -------------------------------------------------------
-- A.	Controlar que las nacionalidades sean 'Argentina' 'Español' 'Inglés' 'Alemán' o 'Chilena'.
--Imagen_medica |	Modalidad	| Atributo

alter table articulo -- importar tabla
add constraint ck_articulo_nacionalidad
check ( articulo.nacionalidad in ('Argentina','Español','Inglés','Alemán','Chilena') );

-- B.	Para las fechas de publicaciones se debe considerar que sean fechas posteriores o iguales al 2010.
-- Articulo	| Fecha	| Atributo

ALTER TABLE articulo -- importar tabla
ADD CONSTRAINT ck_tabla_fecha_publicaciones
CHECK ( extract(year from fecha_publicacion) >= 2010);

-- C	Cada palabra clave puede aparecer como máximo en 5 artículos.
-- Contiene | 	Id_articulo Cod_palabra |	Tabla

ALTER TABLE contiene
ADD CONSTRAINT ck_max_articulos_por_palabra_clave
CHECK ( NOT EXISTS (
                    select  1-- cod_palabra
                    from contiene
                    group by cod_palabra, idioma
                    having count(*) > 5
    ));
-- D.	Sólo los autores argentinos pueden publicar artículos que contengan más de 10 palabras claves, pero con un tope de 15 palabras,
-- el resto de los autores sólo pueden publicar artículos que contengan hasta 10 palabras claves

-- Articulo  Contiene	| Id_articulo -- Nacionalidad -- Autor -- Id_articulo -- Cod_palabra	| BDD

create assertion cant_palabras_por_nacionalidad
check ( not exists (
                    (select 1 -- Verifico que no exista autores argentinos que tengan menos de 10 o más de 15 palabras claves
                    from articulo a join contiene c on (a.id_articulo = c.id_articulo)
                    where ((a.nacionalidad like 'Argentino') and a.id_articulo in (
                                                                                    select c.id_articulo
                                                                                    from contiene c
                                                                                    group by c.cod_palabra,c.idioma
                                                                                    having count(*) > 15
                                                                                    ))
    )
    or (
        select 1 -- Verifico que no exista autores de otra nacionalidad que tengan más de 10 palabras claves
        from articulo a join contiene c on (a.id_articulo = c.id_articulo)
        where (a.nacionalidad not like 'Argentino') and a.id_articulo in (
                                                                        select c.id_articulo
                                                                        from contiene c
                                                                        group by c.cod_palabra,c.idioma
                                                                        having count(*) > 10
                                                                        ))
    )
    ));

----------------------------- EJERCICIO 4 -------------------------------------------------------
A-- .	La modalidad de la imagen médica puede tomar los siguientes valores RADIOLOGIA CONVENCIONAL, FLUOROSCOPIA,
-- ESTUDIOS RADIOGRAFICOS CON FLUOROSCOPIA, MAMOGRAFIA, SONOGRAFIA,
-- Imagen_medica |	Modalidad	| Atributo

ALTER TABLE imagen_medica
ADD CONSTRAINT ck_imagen_medica_modalidad
CHECK (modalidad in ('RADIOLOGIA CONVENCIONAL', 'FLUOROSCOPIA','ESTUDIOS RADIOGRAFICOS CON FLUOROSCOPIA', 'MAMOGRAFIA', 'SONOGRAFIA'));

--B.	Cada imagen no debe tener más de 5 procesamientos.
-- Procesamiento	| Id_imagen, id_paciente |	Tabla

ALTER TABLE p5p2e4_procesamiento
   ADD CONSTRAINT CK_CANTIDAD_PROCESAMIENTOS
   CHECK ( NOT EXISTS (
            SELECT 1
            FROM p5p2e4_procesamiento
            GROUP BY id_paciente, id_imagen
            HAVING COUNT(*) > 5
       ))
;

-- C.	Agregue dos atributos de tipo fecha a las tablas Imagen_medica y Procesamiento, una indica la fecha de la imagen y
-- la otra la fecha de procesamiento de la imagen y controle que la segunda no sea menor que la primera.

-- Imagen_medica Procesaiento |	Fecha_proc Fecha_imagen	| General o BDD

ALTER TABLE p5p2e4_imagen_medica
ADD COLUMN fecha_img date;

ALTER TABLE p5p2e4_procesamiento
ADD COLUMN fecha_proc date;


CREATE ASSERTION
CHECK ( NOT EXISTS (
            select 1
            FROM p5p2e4_imagen_medica i JOIN p5p2e4_procesamiento p ON (i.id_paciente = p.id_paciente and i.id_imagen = p.id_imagen)
            WHERE fecha_proc < fecha_img ));



--D.	Cada paciente sólo puede realizar dos FLUOROSCOPIA anuales.
-- Imagen	| Id_paciente  modalidad	| Tabla

ALTER TABLE p5p2e4_imagen_medica
   ADD CONSTRAINT CK_CANTIDAD_PROCESAMIENTOS
   CHECK ( NOT EXISTS (
                SELECT 1
                FROM p5p2e4_imagen_medica
                WHERE modalidad = 'FLUOROSCOPIA'
                GROUP BY id_paciente, extract(year from fecha_img)
                HAVING COUNT(*) > 2 ))
;

-- E.	No se pueden aplicar algoritmos de costo computacional “O(n)” a imágenes de FLUOROSCOPIA
-- Algoritmo  Procesamiento-- Imagen_medica	| Id_algoritmo Id_paciente Id_imagen Costo_computacional |	General o BDD

CREATE ASSERTION
   CHECK ( NOT EXISTS (
                SELECT 1
                FROM p5p2e4_imagen_medica i JOIN p5p2e4_procesamiento p ON
                    (i.id_paciente = p.id_paciente AND i.id_imagen = p.id_imagen)
                    JOIN p5p2e4_algoritmo a ON ( p.id_algoritmo = a.id_algoritmo )
                WHERE modalidad = 'FLUOROSCOPIA' AND
                    costo_computacional = 'O(n)'
));

---------------------- EJERCICIO 5 ---------------------
CREATE TABLE P5P2E5_FECHA_LIQ (
    dia_liq int  NOT NULL,
    mes_liq int  NOT NULL,
    cant_dias int  NOT NULL,
    CONSTRAINT PK_P5P2E5_FECHA_LIQ PRIMARY KEY (dia_liq,mes_liq)
);

-- Table: P5P2E5_PRENDA
CREATE TABLE P5P2E5_PRENDA (
    id_prenda int  NOT NULL,
    precio decimal(10,2)  NOT NULL,
    descripcion varchar(120)  NOT NULL,
    tipo varchar(40)  NOT NULL,
    categoria varchar(80)  NOT NULL,
    CONSTRAINT PK_P5P2E5_PRENDA PRIMARY KEY (id_prenda)
);

-- Table: P5P2E5_VENTA
CREATE TABLE P5P2E5_VENTA (
    id_venta int  NOT NULL,
    descuento decimal(10,2)  NOT NULL,
    fecha timestamp  NOT NULL,
    id_prenda int  NOT NULL,
    id_cliente int  NOT NULL,
    CONSTRAINT PK_P5P2E5_VENTA PRIMARY KEY (id_venta)
);

-- foreign keys


-- Reference: FK_P5P2E5_VENTA_PRENDA (table: P5P2E5_VENTA)
ALTER TABLE P5P2E5_VENTA ADD CONSTRAINT FK_P5P2E5_VENTA_PRENDA
    FOREIGN KEY (id_prenda)
    REFERENCES P5P2E5_PRENDA (id_prenda)
    NOT DEFERRABLE
    INITIALLY IMMEDIATE
;

-- End of file.

--A.	Los descuentos en las ventas son porcentajes y deben estar entre  0 y 100.
-- Venta	| descuento	| Atributo
ALTER TABLE p5p2e5_venta
ADD CONSTRAINT ck_vnenta_descuento
CHECK (descuento between 0 and 1;

--B.	Los descuentos realizados en fechas de liquidación deben superar el 30%.
-- Venta-- Fecha_liq	 | Descuento-- Fecha-- Dia_liq-- Mes_liq |	General o BDD


CREATE ASSERTION descuentos_fecha_liq
CHECK ( NOT EXISTS (
                    select
                    from p5p2e5_venta v, p5p2e5_fecha_liq fl
                    where (extract(month from v.fecha) = fl.mes_liq) and (extract(day from v.fecha) = fl.dia_liq) and v.descuento > 0.3)
 );



--C.	Las liquidaciones de Julio y Diciembre no deben superar los 5 días.
-- Fecha_liq	| Dia_liq Mes_liq | Cant_dias	| Tabla
ALTER TABLE p5p2e5_fecha_liq
ADD CONSTRAINT ck_liquidaciones_dias
CHECK ( NOT EXISTS (
                    select 1 --cant_dias
                    from p5p2e5_fecha_liq
                     where (mes_liq = 7 or mes_liq = 12)
                    group by cant_dias

                    having count (cant_dias) > 5
    ));

--D.	Las prendas de categoría ‘oferta’ no tienen descuentos.
-- Prenda -- Venta |	Id_prenda -- Categoria -- descuento	| General o BDD

CREATE ASSERTION oferta_prenda
CHECK ( NOT EXISTS (
                    select
                    from p5p2e5_prenda p join p5p2e5_venta v on (p.id_prenda)
                    where p.categoria like 'oferta' and v.descuento > 0)

 );



