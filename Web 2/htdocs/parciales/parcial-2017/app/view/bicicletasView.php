<?php

require_once("./libs/smarty/Smarty.class.php");

class bicicletasView{
    private $smarty;

    function __construct(){
        $this->smarty = new Smarty();
        $this->smarty->assign('base_url',BASE_URL);
    }

    function showIndex($bicicletas, $categoria, $biciFiltrada){

        $this->smarty->assign('bicis', $bicicletas);
        $this->smarty->assign('biciFiltrada', $biciFiltrada);
        $this->smarty->assign('categoria', $categoria);
        $this->smarty->display('../templates/index.tpl');

    }
}