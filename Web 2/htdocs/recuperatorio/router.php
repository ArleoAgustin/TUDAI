<?php

    require_once('app/Controller/turnoController.php');
    require_once('routerClass.php');
    
 // CONSTANTES PARA RUTEO
    define("BASE_URL", 'http://'.$_SERVER["SERVER_NAME"].':'.$_SERVER["SERVER_PORT"].dirname($_SERVER["PHP_SELF"]).'/');
    //define("LOGIN", 'http://'.$_SERVER["SERVER_NAME"].':'.$_SERVER["SERVER_PORT"].dirname($_SERVER["PHP_SELF"]).'/login');
    //define("LOGOUT", 'http://'.$_SERVER["SERVER_NAME"].':'.$_SERVER["SERVER_PORT"].dirname($_SERVER["PHP_SELF"]).'/logout');

    $r = new Router();

 //NAVEGACION EN LA PAGINA
    $r->addRoute("ver", "GET", "turnoController", "turnosDia");
    
 //Ruta por defecto.
    $r->setDefaultRoute("turnoController", "turnosDia");
 //run
    $r->route($_GET['action'], $_SERVER['REQUEST_METHOD']); 
?>