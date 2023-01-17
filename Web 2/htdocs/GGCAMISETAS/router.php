<?php
   require_once('routerClass.php');
   require_once('app/controller/camisetasController.php');
  /*  require_once('app/Controller/userController.php');*/
   require_once('app/controller/categoriasController.php');
    
    
 // CONSTANTES PARA RUTEO
    define("BASE_URL", 'http://'.$_SERVER["SERVER_NAME"].':'.$_SERVER["SERVER_PORT"].dirname($_SERVER["PHP_SELF"]).'/');

    $r = new Router();

 //NAVEGACION EN LA PAGINA
    $r->addRoute("home", "GET", "camisetasController", "showHome");
    $r->addRoute("camisetas", "GET", "categoriasController", "showByCategory");
 

 //Ruta por defecto.
    $r->setDefaultRoute("camisetasController", "showHome");
 //run
    $r->route($_GET['action'], $_SERVER['REQUEST_METHOD']); 
?>