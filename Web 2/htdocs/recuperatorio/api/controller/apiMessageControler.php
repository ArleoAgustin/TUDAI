<?php

class apiCommentsController extends apiController{

    function __construct(){

        parent::__construct();
        
        $this->model = new apiCommentsModel();
        $this->view = new apiView();

    }

    function showAllMessage(){

        $mensajes = $this->model->getAllMessage();

        if(!empty($mensajes)){
            $this->view->response($mensajes,202);
        }
        else{
            $this->view->response("No hay mensajes con el id $id",404);
        }
    }

    function showMensajesById($params = null){

        $id = $params[":ID"];

        $mensaje = $this->model->getMessageById($id);

        if(!empty($mensaje)){
            $this->view->response($mensaje,202);
        }
        else{
            $this->view->response("no hay mensaje",404)
        }
    }