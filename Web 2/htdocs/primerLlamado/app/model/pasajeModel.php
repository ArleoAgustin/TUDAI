<?php

class pasajeModel {

    private $db;

    function __construct(){

        $this->db = new PDO('mysql:host=localhost;'.'dbname=db_turismo;charset=utf8;','root','');
    }

    function getPasajeByViaje($id_viaje){

        $query = $this->db->prepare('SELECT * FROM pasaje INNER JOIN viaje ON pasaje.id_viaje = viaje.id WHERE id_viaje =?');
        $query-> execute([$id_viaje]);
        return $query->fetchAll(PDO::FETCH_OBJ);
        
    }

    function cancelarPasaje($id_viaje,$cancelado) {

        $query = $this->db->prepare('UPDATE pasaje SET cancelado=? WHERE id_viaje=?');
        $query->execute([$id_viaje]);
    }
}