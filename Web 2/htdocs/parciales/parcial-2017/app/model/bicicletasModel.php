<?php

class bicicletasModel{

    private $db;

    function __construct(){
        $this->db = new PDO('mysql:host=localhost;'.'dbname=bicicleteria;charset=utf8', 'root', '');
    }

    function getAllBicis(){
        $query = $this->db->prepare('SELECT * FROM bicicletas INNER JOIN categoriabici ON bicicletas.id_categoria = categoriabici.id_categoria');
        $query->execute();
        $bicis = $query->fetchAll(PDO::FETCH_OBJ);
        return $bicis;
    }

    function getBici($id){
        $query = $this->db-> prepare('SELECT * FROM bicicletas WHERE id_bici = ?');
        $query->execute([$id]); 
        $bici = $query->fetchAll(PDO::FETCH_OBJ);
        return $bici;
    }

    function cantBicisByCategory($categoria){
        
        $query = $this->db->prepare('SELECT * FROM bicicletas INNER JOIN categoriabici ON bicicletas.id_categoria = categoriabici.id_categoria WHERE categoriabici.categoria = ?');
        $query->execute([$categoria]);
        $CantBicis = $query->fetchAll(PDO::FETCH_OBJ);
        print_r($CantBicis);
        $total = 0;
        foreach($CantBicis as $cant) {
            $total++;
        }
        echo($total);
        return $total;

    }

    function MySQLCOUNT(){

        $stmt = $this->db->query("SELECT count(*) FROM bicicletas");
    
    $stmt->execute();
    $data = array();
    $total = $stmt->fetch(PDO::FETCH_ASSOC);
    print_r($total);
    }
 
    function bicicletaByPrice(){
        $query = $this->db->prepare('SELECT * FROM bicicletas WHERE precio < 10000');
        $query->execute();
        $bicicletas = $query->fetchAll(PDO::FETCH_OBJ);
        return $bicicletas;

    }

    function biciByRodado($rodado){
        $query = $this->db->prepare('SELECT * FROM bicicletas WHERE rodado = ?');
        $query->execute([$rodado]);
        $bicis->fetchAll(PDO::FETCH_OBJ);
        return $bicis;
    }

    function allCategorys(){
        $query = $this->db->prepare('SELECT * FROM categoriaBici');
        $query->execute();
        $categorias = $query->fetchAll(PDO::FETCH_OBJ);
        return $categorias;
    }

}