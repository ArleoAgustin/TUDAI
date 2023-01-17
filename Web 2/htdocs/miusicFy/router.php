<?php
    require_once('app/controller/songController.php');
    //require_once('app/Controller/artistController.php');
   // require_once('app/Controller/categoryController.php');
   require_once('app/controller/userController.php');
   require_once('routerClass.php');
    
 // CONSTANTES PARA RUTEO
    define("BASE_URL", 'http://'.$_SERVER["SERVER_NAME"].':'.$_SERVER["SERVER_PORT"].dirname($_SERVER["PHP_SELF"]).'/');
    //define("LOGIN", 'http://'.$_SERVER["SERVER_NAME"].':'.$_SERVER["SERVER_PORT"].dirname($_SERVER["PHP_SELF"]).'/login');
    //define("LOGOUT", 'http://'.$_SERVER["SERVER_NAME"].':'.$_SERVER["SERVER_PORT"].dirname($_SERVER["PHP_SELF"]).'/logout');

    $r = new Router();

 //NAVEGACION EN LA PAGINA
    $r->addRoute("miusicfy", "GET", "songController", "home");
    $r->addRoute("register", "GET", "userController", "register");
    $r->addRoute("login", "GET", "userController", "login");
    $r->addRoute("agregarUser", "POST", "userController", "addUser");
    
 //Ruta por defecto.
    $r->setDefaultRoute("songController", "home");
 //run
    $r->route($_GET['action'], $_SERVER['REQUEST_METHOD']); 
?>