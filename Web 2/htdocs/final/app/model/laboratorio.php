<?php

class laboratorioModel{

    private $db;

    function __construct(){

        $this->db = new PDO('mysql:host=localhost;'.'dbname=covid;charset=utf8', 'root', '');
    }

    
}