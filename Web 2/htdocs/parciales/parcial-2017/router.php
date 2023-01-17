<?php
   require_once('routerClass.php');
   require_once('app/controller/bicicletasController.php');
    
 // CONSTANTES PARA RUTEO
    define("BASE_URL", 'http://'.$_SERVER["SERVER_NAME"].':'.$_SERVER["SERVER_PORT"].dirname($_SERVER["PHP_SELF"]).'/');

    $r = new Router();

 //NAVEGACION EN LA PAGINA
    $r->addRoute("home", "GET", "camisetasController", "showAllBicis");


 

 //Ruta por defecto.
    $r->setDefaultRoute("bicicletasController", "showAllBicis");
 //run
    $r->route($_GET['action'], $_SERVER['REQUEST_METHOD']); 
?>