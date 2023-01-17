<?php

require_once('./app/model/albumModel');

class cancionController {
   
    private $cancionModel;
    private $cacionView;
    function __construct(){

        $this->$cancionModel = new cancionModel();
        $this->$cancionView = new cancionView();  //no lo cree la vista porque la consigna no lo pedia.
    }

    function agregarCancion(){

        $this->checheckLoggedIn(); //se verifica que el usuario este logueado
        //con esto controlo que se ingresen todos los datos en el formuario
        if((!empty($_POST['nombre'])) && (!empty($_POST['duracion'])) && (!empty($_POST['valoracion'])) && (!empty($_POST['reproducciones']) && (!empty($_POST['album']))) {
            
            $nombre = $_POST['nombre'];
            $existe = verificarCancion($nombre); //retorna un boolean

            if ($existe == False) { //si la cancion no existe la agrega

                $_POST['repoducciones'] = 0; //controlo que las reproducciones inicien en cero
                $this->cancionModel->insertCancion($_POST['nombre'],$_POST['duracion'], $_POST['valoracion'], $_POST['repoducciones'], $_POST['album']);

            }
            
        }
    }

    function verificarCancion($nombre){
        
        $existe = False;
        $canciones = $this->cancionModel->getAllCanciones(); //traigo todas las canciones de la db
        foreach ($canciones as $cancion) { 
            if ($cancion->nombre == $nombre) {
                $existe = True; //si la cancion existe se vuelve true.
            }
        }
        return $existe;
    }

    private function checkLoggedIn(){
        session_start();                  
        if(!isset($_SESSION['EMAIL'])){
            header("Location:" . login);
            die();
        }
            
            
    }  
    

}