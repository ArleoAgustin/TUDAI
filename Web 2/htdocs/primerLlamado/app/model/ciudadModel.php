<?php

class ciudadModel {

    private $db;

    function __construct(){

        $this->db = new PDO('mysql:host=localhost;'.'dbname=db_turismo;charset=utf8;','root','');
    }

    function getCiudad($id_ciudad) {

        $query = $this->db->prepare('SELECT * FROM ciudad WHERE id = ?');
        $query->execute([$id_ciudad]);
        return $query->fetch(PDO::FETCH_OBJ);
    }

    function getAllCiudades(){

        $query = $this->db->prepare('SELECT * FROM ciudad');
        $query->execute();
        return $query->fetchAll(PDO::FETCH_OBJ);
    }


}