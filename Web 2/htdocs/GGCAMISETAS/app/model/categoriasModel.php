<?php
    
    class categoriasModel {

        private $db;

        function __construct(){

            $this->db = new PDO('mysql:host=localhost;'.'dbname=ggcamisetas;charset=utf8', 'root', '');
        }

        function getArticleByCategory($categoria){

            $query = $this->db->prepare('SELECT * FROM categoria INNER JOIN productos ON categoria.id_categoria = productos.id_categoria WHERE tipo_categoria = ?');
            $query->execute([$categoria]);
            $articulos = $query->fetchAll(PDO::FETCH_OBJ);
            return $articulos;
        }

        function getViandasByDirigidoA($dirigidoA) {
            $query = $this->db->prepare('SELECT * FROM viandas INNER JOIN dirigido_table ON viandas.id_dirigidoA=dirigido_table.id_dirigidoA WHERE tipo_vianda = ?');
            $query->execute([$dirigidoA]); 
            $viandaDirigidas = $query->fetchAll(PDO::FETCH_OBJ);
            return $viandaDirigidas;
        }
    }