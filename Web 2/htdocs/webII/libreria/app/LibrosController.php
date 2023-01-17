<?php

require_once 'app/LibrosModel.php';
require_once 'app/LibrosView.php';

class LibrosController {

    private $model;
    private $view;

    public function __construct() {
        $this->model = new LibrosModel();
        $this->view = new LibrosView();
    }

    function showLibrosByGenre() {
        
        // verifica datos obligatorios
       if (!isset($_GET['action']) || empty($_GET['action'])) {
            $this->view->renderError();
            return;
        }

       
        // obtiene el genero enviado por GET 
        $genre = $_GET['action'];
        

        // obtengo las peliculas del modelo
        $libros = $this->model->getLibrosByGenero($genre);
                        
        // actualizo la vista
        $this->view->renderLibrosByGenre($genre, $libros);
    }

    function showLibros() {

        // llmar el modelo para obtener todas las peliculas
        $libros = $this->model->getLibros();

        // actualizo la vista
        $this->view->renderLibros($libros);
    }

    function showFormulario() {

        $this->view->formulario();        

    }

    function ingresarLibro() {

       $this->model->insertBook($_POST['genero'], $_POST['Editor'], $_POST['Lanzamiento']);
       $this->view->showHomeLocation();

    }

    function deleteBook($params) {

        $libro_ID = $params[':ID'];
        $this->model->deleteBook($libro_ID);
        $this->view->showHomeLocation();

    }

    function editBook($params){

        $libro_ID = $params[':ID'];
        $this->model->editBook($libro_ID);
        $this->view->showHomeLocation();

    }

    function home() {
        $generos = $this->model->getLibros();
        
        $this->view->showHome($generos);
    }

}