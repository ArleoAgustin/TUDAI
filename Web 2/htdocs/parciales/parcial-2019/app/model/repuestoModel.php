<?php

class repuestoModel{

    private $db;

    function __construct(){

        $this->db =  'mysql:host=localhost;'.'dbname=repuestosdp;charset=utf8', 'root', '');

    }

    function repuestosEnPromo(){
        
        $query = $this->db->prepare('SELECT * FROM REPUESTO INNER JOIN CATEGORIA ON REPUESTO.id_categoria = CATEGORIA.id_categoria WHERE en_promocion = 1');
        $query->execute();
        $EnPromo = $query->fetchAll(PDO::FETCH_OBJ);
        return $EnPromo;
    }

    function repuesto($id){
        
        $query = $this->db->prepare('SELECT * FROM REPUESTO WHERE id_repuestos = ?');
        $query->execute([$id]);
        $stockDisponible = $query->fetchAll(PDO::FETCH_OBJ);
        foreach ($stockDisponible as $sto) {
            $stockDisponible = $sto->stock;
        }
        return $stockDisponible;
    }

    function insertRepuesto($nombre, $precio, $stock, $id_categoria, $promocion, $proveedor){
        echo $nombre;
        echo $precio;
        echo $stock;
        echo $id_categoria;
        echo $promocion;
        echo $proveedor;

        $query = $this->db->prepare('INSERT INTO repuesto(nombre_repuesto, precio, stock, id_categoria, en_promocion, proveedor) VALUE (?,?,?,?,?,?)');
        $query->execute([$nombre, $precio, $stock, $id_categoria, $promocion, $proveedor]);
    
    }

    function insertCategoria($nombre){

        $query = $this->db->prepare('INSERT INTO CATEGORIA(nombre_categoria) VALUE(?)');
        $query->execute([$nombre]);

    }


    function cantidadRepuestos($id_categoria){
        $query = $this->db->prepare('SELECT COUNT(*) FROM REPUESTO WHERE en_promocion = 1 AND id_categoria = ?');
        $query->execute([$id_categoria]);
        $cantidad = $query->fetchColumn();
        return $cantidad;

    }

    function venderRepuesto($id_repuesto){

        $query = $this->db->prepare("UPDATE REPUESTO SET stock = stock -1 WHERE stock > 0 AND id_repuestos = ?");
        $query -> execute([$id_repuesto]);
    }

}