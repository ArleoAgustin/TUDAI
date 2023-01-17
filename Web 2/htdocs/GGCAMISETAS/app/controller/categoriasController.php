<?php

require_once "./app/model/categoriasModel.php";
require_once "./app/view/categoriasView.php";

class categoriasController{

    private $model;
    private $view;

    function __construct(){

        $this->model = new categoriasModel();
        $this->view = new categoriasView();

    }

    function showByCategory() {
        
        $categoria = $_GET['action'];
        $productos = $this->model->getArticleByCategory($categoria);
        if ($productos)
        $this->view->showProductByCategory($productos);

    }
}