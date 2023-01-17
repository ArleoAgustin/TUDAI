<?php

require_once 'app/LibrosController.php';

class LibrosModel {

    private $db;

    public function __construct() {
        $this->db = new PDO('mysql:host=localhost;'.'dbname=db;charset=utf8', 'root', '');
    }


     //  Obtiene la lista de peliculas de la DB según género

    function getLibrosByGenero($genre) {
        $query = $this->db->prepare('SELECT * FROM db_libros WHERE genero = ?');
        $query->execute([$genre]); // array($genre)
        $libros = $query->fetchAll(PDO::FETCH_OBJ);
        return $libros;

    }

     // Obtiene todas las peliculas

    function getLibros() {
        $query = $this->db->prepare('SELECT * FROM db_libros');
        $query->execute();
        $libros = $query->fetchAll(PDO::FETCH_OBJ);
        return $libros;
    }

    function insertBook($genero, $editor, $lanzamiento) {

        $query = $this->db->prepare('INSERT INTO db_libros(genero, Editor, Lanzamiento) VALUES(?,?,?) '); 
        $query->execute(array($genero, $editor, $lanzamiento));
    }

    function deleteBook($libro_ID) {

        $sentencia = $this->db->prepare('DELETE FROM db_libros WHERE id=?');
        $sentencia->execute(array($libro_ID));

    }
}