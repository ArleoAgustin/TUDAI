<?php

class ciudadModel {

    private $db;

    function __construct(){
        $this->db = new PDO('mysql:host=localhost;'.'dbname=covid;charset=utf8', 'root', '');
    }

    function getCiudades(){

        $query = $this->db->prepare('SELECT * FROM ciudad');
        $query->execute();
        $ciudad = $query->fetchAll(PDO::FETCH_OBJ);
        return $ciudad;
    }
}