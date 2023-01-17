<?php
    require_once("app/LibrosController.php");
    require_once("RouterClass.php");

    // CONSTANTES PARA RUTEO
    define("BASE_URL", 'http://'.$_SERVER["SERVER_NAME"].':'.$_SERVER["SERVER_PORT"].dirname($_SERVER["PHP_SELF"]).'/');
    // M_PI = 3.1415...

    $r = new Router();

    
    // rutas
    $r->addRoute("Home", "GET", "LibrosController", "home");
    $r->addRoute("Libros", "GET", "LibrosController", "showLibros");
    $r->addRoute("libro/:ID", "GET", "LibrosController", "showLibrosByGenre");
    $r->addRoute("Aventura", "GET", "LibrosController", "showLibrosByGenre");
    $r->addRoute("Magia", "GET", "LibrosController", "showLibrosByGenre");
    $r->addRoute("ingresarLibro", "GET", "LibrosController", "showFormulario");
    $r->addRoute("insert", "POST", "LibrosController", "ingresarLibro");
    $r->addRoute("borrar/:ID", "GET", "LibrosController", "deleteBook");
    $r->addRoute("editar/:ID", "GET", "LibrosController", "editBook");


    //Ruta por defecto.
    $r->setDefaultRoute("LibrosController", "home");

    //run
    $r->route($_GET['action'], $_SERVER['REQUEST_METHOD']);

?>