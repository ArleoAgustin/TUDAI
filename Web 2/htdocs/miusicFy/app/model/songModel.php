<?php 

class songModel{
    private $db;

    function __construct(){
        $this->db = new PDO('mysql:host=localhost;'.'dbname=miusicFy;charset=utf8', 'root', '');
    }

    function insertSong($song, $artista, $reproducciones, $duracion){

        $query = $this->db->prepare('INSERT INTO songs(song, artista, reproducciones, duracion) VALUES(?,?,?,?)');
        $query->execute([$song, $artista, $reproducciones, $duracion]);
    }

    function getAllsongs(){

        $query = $this->db->prepare('SELECT * FROM songs');
        $query->execute();
        $songs = $query->fetch(PDO::FETCH_OBJ);
        return $songs;
    }

    function getSongById($id){

        $query =  $this->db->prepare('SELECT * FROM songs WHERE id_song = ?');
        $query->execute([$id]);
        $song = $query->fetch(PDO::FETCH_OBJ);
        return $song;
    }

}