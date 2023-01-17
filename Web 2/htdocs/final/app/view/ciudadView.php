<?php

require_once("./libs/smarty/Smarty.class.php");

class songView{

    private $smarty;

    function __construct(){
        $this->smarty = new Smarty();
        $this->smarty->assign('base_url',BASE_URL);
    }


    function showCiudades($ciudades){
        $this->smarty->assign('ciudades', $ciudades);
        $this->smarty->display('../templates/index.tpl');
    }
}