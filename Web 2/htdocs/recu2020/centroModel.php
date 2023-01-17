<?php

class centroModel{

    private $db;

    function __construct(){

        $this->db = new PDO('mysql:host=localhost;'.'dbname=covid;charset=utf8', 'root', '');
    }

    function allCentros(){

        $query = $this->db->prepare('SELECT * FROM centro INNER JOIN ciudad ON centro.id_ciudad_fk = ciudad.id_ciudad');
        $query->execute();
        $centros = $query->fetchAll(PDO::FETCH_OBJ);
        return $centros;
    }

    function centrosDeSaludEnRiesgo(){

        $query = $this->db->prepare('SELECT * FROM centro INNER JOIN ciudad ON centro.id_ciudad_fk = ciudad.id_ciudad WHERE  zona_riesgo = 1 AND cant_camas_ocupadas > 50 ');
        $query->execute();
        $centros = $query->fetchAll(PDO::FETCH_OBJ);
        return $centros;
    }

    function centroByCiudad($ciudad){

        $query = $this->db->prepare('SELECT * FROM centro INNER JOIN ciudad ON centro.id_ciudad_fk = ciudad.id_ciudad WHERE ciudad.nombre_ciudad = ? ');
        $query->execute([$ciudad]);
        $centros = $query->fetchAll(PDO::FETCH_OBJ);
        return $centros;
    }

}