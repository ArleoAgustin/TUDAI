<?php

class viajesModel {

    private $db;

    function __construct(){

        $this->db = new PDO('mysql:host=localhost;'.'dbname=db_turismo;charset=utf8;','root','');
    }

    function getViajes($dia,$hora,$empresa){

        $query = $this->db->prepare('SELECT * FROM viaje WHERE dia=? AND hora=? AND empresa=?');
        $query->execute([$dia,$hora,$empresa]);
        return $query->fetchAll(PDO::FETCH_OBJ);
    }

    function insertViaje($nro_viaje,$dia,$hora,$empresa,$id_ciudad_origen,$id_ciudad_destino) {

        $query = $this->db->prepare('INSERT INTO viaje(nro_viaje,dia,hora,empresa,id_ciudad_origen,id_ciudad_destino) VALUES(?,?,?,?,?,?)');
        $query->execute([$nro_viaje,$dia,$hora,$empresa,$id_ciudad_origen,$id_ciudad_destino]);
    }

    function deleteViaje($id_viaje) {

        $query = $this->db->prepare('DELETE FROM viaje WHERE id=?');
        $query->execute([$id_viaje]);
    }

    function getViajeById($id_viaje){

        $query = $this->db->prepare('SELECT * FROM viaje WHERE id=?');
        $query->execute([$id_viaje]);
        return $query->fetch(PDO::FETCH_OBJ);

    }

    function getAllViajes() {
        $query = $this->db->prepare('SELECT * FROM viaje');
        $query->execute();
        return $query->fetchAll(PDO::FETCH_OBJ);
    }

    function getViajesByCity($id_ciudad){

        $query = $this->db->prepare('SELECT * FROM viaje WHERE id_ciudad_origen=? OR id_ciudad_destino=?');
        $query->execute([$id_ciudad, $id_ciudad]);
        return $query->fetchAll(PDO::FETCH_OBJ);
    }
}