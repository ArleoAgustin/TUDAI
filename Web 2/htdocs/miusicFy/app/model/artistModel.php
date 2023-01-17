<?php 

class viandasModel{
    private $db;

    function __construct(){
        $this->db = new PDO('mysql:host=localhost;'.'dbname=miusicFy;charset=utf8', 'root', '');
    }

    function insertArtist($nombre, $apellido, $alias){

        $query = $this->db->prepare('INSERT INTO artist(nombre, apellido, alias) VALUES(?,?,?)');
        $query->execute([$nombre, $apellido, $alias]);
    }

    function getAllArtist(){

        $query = $this->db->prepare('SELECT * FROM artist');
        $query->execute();
        $artist = $query->fetch(PDO::FETCH_OBJ);
        return $artist;
    }

    function getArtistgById($id){

        $query =  $this->db->prepare('SELECT * FROM artist WHERE id_artista = ?');
        $query->execute([$id]);
        $artist = $query->fetch(PDO::FETCH_OBJ);
        return $artist;
    }

}