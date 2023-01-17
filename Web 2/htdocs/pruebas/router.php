<?php
   require_once(".php");
    require_once('routerClass.php');
    
 // CONSTANTES PARA RUTEO
    define("BASE_URL", 'http://'.$_SERVER["SERVER_NAME"].':'.$_SERVER["SERVER_PORT"].dirname($_SERVER["PHP_SELF"]).'/');
    $r = new Router();

 //Ruta por defecto.
    $r->setDefaultRoute("  ", "  ");
 //run
    $r->route($_GET['action'], $_SERVER['REQUEST_METHOD']); 
?>