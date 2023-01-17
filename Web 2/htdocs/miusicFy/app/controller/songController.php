<?php

require_once ("./app/model/songModel.php");
//require_once ("./app/model/artistModel.php");
//require_once ("./app/model/categoryModel.php");
require_once ("./app/view/songView.php");

class songController{

    private $view;
    private $model;
   // private $viewCategorias;
    //private $modelCategorias;

    function __construct(){

        $this->view = new songView();
        $this->model = new songModel();
       // $this->viewCategorias = new categoryView();
       // $this->modelCategorias = new categoryModel();
         
    }

    function home(){
        $this->view->ShowHome();
    }

}