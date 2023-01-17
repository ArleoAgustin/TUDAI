<?php

    require_once("./app/model/camisetasModel.php");
    require_once("./app/view/camisetasView.php");

    class camisetasController {

        private $model;
        private $view;


        function __construct(){
            $this->model = new camisetasModel();
            $this->view = new camisetasView();
        }

        function showHome(){
            $this->view->showHome();
        }



    }
