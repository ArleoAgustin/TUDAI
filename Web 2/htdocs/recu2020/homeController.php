<?php

require_once("centroModel.php");
//require_once("homeView.php");

class homeController{


   // private $view;
    private $model;

    function __construct(){

        $this->model = new centroModel();
        //$this->view = new homeView();
       
    }

    

    function allCentrosDeSalud(){

        $centros = $this->model->allCentros();
        
        if($centros)
        print_r($centros);
            //$this->view->showHome($centros);
        else
        echo("no hay centros de salud");
            //$this->view->showHome("No hay centros de salud");

    }
        

    function centrosDeSaludEnRiesgo(){

        $centros = $this->model->centrosDeSaludEnRiesgo();
        if($centros)
            print_r($centros);
            //$this->view->showHome($centros);
        else
            echo("No hay centros de salud en zona de riesgo con mas de 50 camas ocupadas");
            //$this->view->showHome("No hay centros de salud en riesgo con mas de 50 camas ocupadas");

    }

    function centrosDeSaludByCiudad($params = null){

        //$ciudad = $params[":CIUDAD"];
        $ciudad = "";
        if($ciudad){
            $centros = $this->model->centroByCiudad($ciudad);
            if($centros)
                print_r($centros);
                //$this->view->showHome($centros);
            else
                echo("No hay centros salud en: " .$ciudad);
                //$this->view->showHome("No hay centros salud en "$ciudad"");
        }
        else
            echo("Ciudad inexistente");
    }

    function capacidadSanitaria(){

        $centros = $this->model->allCentros();
        $camas_libres = 0;
        $camas_ocupadas = 0;
        if($centros){
            foreach ($centros as $camas) {
                
                $camas_libres += $camas->cant_camas;
                $camas_ocupadas += $camas->cant_camas_ocupadas;
            }
        }
        else
            print_r("No hay centros salud");
            //$this->view->showHome("No hay centros salud");

        $capacidad = $camas_libres + $camas_ocupadas;
        echo("La capacidad es: ". $capacidad);
        //$this->view->showHome($capacidad);





    }

}