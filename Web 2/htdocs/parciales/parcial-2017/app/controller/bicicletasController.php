<?php

require_once './app/model/bicicletasModel.php';
require_once './app/view/bicicletasView.php';

class bicicletasController{

    private $model;
    private $view;

    function __construct(){

        $this->model = new bicicletasModel();
        $this->view = new bicicletasView();

    }

    function showBici($params = NULL){

        $id_bici = $params[':ID'];
        $bici = $this->model->getBici($id_bici);

    }

    function showAllBicis(){
        $categoria= "Retro";
        $bicis = $this->model->getAllBicis();
        $categoria = $this->model->allCategorys();
        $bicisFiltradas = $this->model->bicicletaByPrice();
        /*$cantBicis = $this->model->cantBicisByCategory($categoria);*/
        $this->model->MySQLCOUNT();
        $this->view->showIndex($bicis, $categoria, $bicisFiltradas);

    }



}