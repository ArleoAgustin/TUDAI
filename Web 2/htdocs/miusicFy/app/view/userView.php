<?php

require_once("./libs/smarty/Smarty.class.php");

class userView {

    private $smarty;

    function __construct(){
        $this->smarty = new Smarty();
        $this->smarty->assign('base_url',BASE_URL);
    }

    function showFormRegister($message = ""){
        $this->smarty->assign('message',$message);
        $this->smarty->display('../templates/register.tpl');
    }

    function showFormLogin(){
        $this->smarty->display('../templates/login.tpl');
    }
}