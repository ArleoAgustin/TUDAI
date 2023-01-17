<?php
    
    class camisetasModel {

        private $db;

        function __construct(){

            $this->db = new PDO('mysql:host=localhost;'.'dbname=ggcamisetas;charset=utf8', 'root', '');
        }

        function showAllRemeras($producto){
            $query = $this->dbprepare('SELECT * FROM productos WHERE producto');
            $query->execute([$producto]);
            $remeras = $query->fetchAll(PDO::FETCH_OBJ);
            return $remeras;
        }
    }