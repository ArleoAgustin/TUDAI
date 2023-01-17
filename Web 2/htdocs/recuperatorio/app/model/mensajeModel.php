<?php

class mensajeModel{

    private $db;

    function __construct(){

        $this->db = new PDO('mysql:host=localhost;'.'dbname=careme;charset=utf8', 'root', '');
    }

    function insertMensaje($id_medico,$mensaje){

        $query = $this->db->prepare('INSERT INTO mensaje(id_medico,mensaje) VALUES(?,?)');
        $query->execute([$id_medico,$mensaje]);
    }
}