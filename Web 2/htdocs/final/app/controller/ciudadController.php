<?php

require_once("./app/model/ciudadModel.php");

class ciudadController{

    private $model;

    function __construct(){

        $this->model = new ciudadModel();
    }

    function lotesXciudad(){
        $contador;
        $ciudades = $this->model->getCiudades();
        foreach($ciudades as $ciudad){
            
            echo"<li>$ciudad->nombre</li>";
            
        }

    }
       
    
}