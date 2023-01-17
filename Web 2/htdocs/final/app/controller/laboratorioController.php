<?php

require_once("./app/model/laboratorioModel.php");

class laboratorioController{

    private $view;
    private $model;

    function __construct(){

        $this->model = new laboratorioModel();
    }

    function tabla(){

        $laboratorios = $this->model->laboratorios();

        if($laboratorios){

            echo"<th> lab </th>""<th> $ </th>";
            
        }

    }
}