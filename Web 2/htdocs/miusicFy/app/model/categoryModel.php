<?php 

class viandasModel{
    private $db;

    function __construct(){
        $this->db = new PDO('mysql:host=localhost;'.'dbname=miusicFy;charset=utf8', 'root', '');
    }

    function insertCategory($category){

        $query = $this->db->prepare('INSERT INTO category(category) VALUES(?)');
        $query->execute([$category]);
    }

    function getAllCategory(){

        $query = $this->db->prepare('SELECT * FROM category');
        $query->execute();
        $category = $query->fetch(PDO::FETCH_OBJ);
        return $category;
    }

    function getCategoryById($id){

        $query =  $this->db->prepare('SELECT * FROM category WHERE id_category = ?');
        $query->execute([$id]);
        $category = $query->fetch(PDO::FETCH_OBJ);
        return $category;
    }

}