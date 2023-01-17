<?php 

class cancionModel {

    private $db;

    function __construct(){
        $this->db->new PDO(/*conecta con la base de datos*/);
    }

    function getAllCanciones(){

        $query = $this->db->prepare('SELECT * FROM canciones');
        $query->execute(); 
        $canciones = $query->fetchAll(PDO::FETCH_OBJ);
        return $canciones;
    }

    function insertCancion($nombre, $duracion, $valoracion, $reproducciones, $album) {
        $query = $this->db->prepare('INSERT INTO cancion(nombre, duracion, valoracion, reproducciones, id_album) VALUES (?,?,?,?,?)');
        $query->execute([$nombre, $duracion, $valoracion, $reproducciones, $album]);
    }

}