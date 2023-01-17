<?php

require_once './app/model/repuestoModel.php';
require_once './app/view/repuestoView.php';

class repuestosController{

    private $model;
    private $view;

    function __construct(){

        $this->model = new repuestoModel();
        /*$this->view = new repuestoView();*/

    }

    function showRepuestos(){

    //punto 1
          /*$enPromo = $this->model->repuestosEnPromo();
            foreach ($enPromo as $promo) {
                echo $promo->nombre_repuesto;
            }*/
    
    //punto 2
            /*
            $id = '3';
            $repuesto = $this->model->repuesto($id); 
                    echo $repuesto;*/

    //punto 3
          /*  $nombre = 'espejo fiat';
            $precio = '2000';
            $stock = '40';
            $id_categoria = '4';
            $promocion = '0';
            $proveedor = 'fiat';    
            $this->model->insertRepuesto($nombre, $precio, $stock, $id_categoria, $promocion, $proveedor);*/
        
    //punto 4
            /*
            $nombre = 'pedales';
            $this->model->insertCategoria($nombre);*/

    //punto 5
            $id_repuesto = '1';
            $this->model->venderRepuesto($id_repuesto);

    //punto 6
            /*$id_categoria = '3';
            $enPromXCategoria = $this->model->cantidadRepuestos($id_categoria);
            echo $enPromXCategoria;*/
    }
    


}