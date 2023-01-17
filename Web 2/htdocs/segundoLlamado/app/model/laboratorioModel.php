<?php

class ciudadModel {

    private $db;

    function __construct(){

        $this->db = new PDO('mysql:host=localhost;'.'dbname=db_salud;charset=utf8;','root','');
    }
    
    function getLaboratorio($id_laboratorio){

        $query = $this->db->prepare("SELECT * FROM laboratorio WHERE id = ?");
        $query->execute([$id_laboratorio]);
        return $query->fetch(PDO::FETCH_OBJ);
    }

    function getAllLaboratorios(){

        $query = $this->db->prepare('SELECT * FROM laboratorio');
        $query->execute();
        return $query->fetchAll(PDO::FETCH_OBJ);
    }

    function updateStock($id_laboratorio, $stock){

        $query = $this->db->prepare("UPDATE laboratorio SET stock_lotes=? WHERE id=?");
        $query->execute([$stock,$id_laboratorio]);
    }
    
}