<?php

class loteModel{

    private $db;

    function __construct(){

        $this->db = new PDO('mysql:host=localhost;'.'dbname=covid;charset=utf8', 'root', '');
    }

    function addLoteDB($nro_lote, $anio_vencimiento, $id_ciudad, $id_laboratorio){
        $query = $this->db->prepare('INSERT INTO lote(nro_lote,anio_vencimiento,id_ciudad,id_laboratorio) VALUES(?,?,?,?)');
        $query->execute([$nro_lote, $anio_vencimiento, $id_ciudad, $id_laboratorio]);
    }

    function getLotes(){
        $query = $this->db->prepare('SELECT * FROM lote INNER JOIN ciudad');
        $query->execute();
        $lotes = $query->fetchAll(PDO::FETCH_OBJ);
        return $lotes;
    }
}