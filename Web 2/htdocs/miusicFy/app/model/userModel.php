<?php

class userModel {

    private $db;

    function __construct(){
        $this->db = new PDO('mysql:host=localhost;'.'dbname=miusicFy;charset=utf8', 'root', '');
    }

    function insertUser($alias, $password, $email, $sexo, $admin){

        $query = $this->db->prepare('INSERT INTO users(email,alias,password,sexo,admin) VALUES(?,?,?,?,?)');
        $query->execute([$email, $alias, $password, $sexo, $admin]);
    }

    function getAllUsers(){
        $query = $this->db->prepare('SELECT * FROM users');
        $query->execute();
        $users = $query->fetch(PDO::FETCH_OBJ);
        return $users;
    }

    function getUser($alias){
        $sentencia = $this->db->prepare("SELECT * FROM users WHERE alias=?");
        $sentencia->execute([$alias]);
        $usuario = $sentencia->fetch(PDO::FETCH_OBJ);
        return $usuario;
    }

}