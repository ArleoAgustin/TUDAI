<?php

require_once("./libs/smarty/Smarty.class.php");

class viandasView{

    private $smarty;

    function __construct(){
        $this->smarty = new Smarty();
        $this->smarty->assign('base_url',BASE_URL);
    }

    function showHome($datos){

        $this->smarty -> assign('$datos', $datos);
        $this->smarty->display('templates/home.tpl');
    }

}