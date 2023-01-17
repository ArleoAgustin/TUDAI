<?php

class loteModel {

    private $db;

    function __construct(){

        $this->db = new PDO('mysql:host=localhost;'.'dbname=db_salud;charset=utf8', 'root', '');
    }

    function addLote($nro_lote,$anio_vencimiento,$id_ciudad,$id_laboratorio) {

        $query = $this->db->prepare("INSERT INTO lote(nro_lote,anio_vencimiento,id_ciudad,id_laboratorio) VALUES(?,?,?,?)");
        $query->execute([$nro_lote,$anio_vencimiento,$id_ciudad,$id_laboratorio]);
    }

    function getLoteByLaboratorio($id){

        $query = $this->db->prepare('SELECT * FROM lote WHERE id_laboratorio=?');
        $query->execute([$id]);
        return $query->fetchAll(PDO::FETCH_OBJ);
    }

    function getLotesByCiudad($id_ciudad){

        $query = $this->db->prepare('SELECT * FROM lote INNER JOIN ciudad ON lote.id_ciudad = ciudad.id INNER JOIN laboratorio ON lote.id_laboratorio = laboratorio.id WHERE id_ciudad=?');
        $query->execute([$id_ciudad]);
        return $query->fetchAll(PDO::FETCH_OBJ);
    }
    
}