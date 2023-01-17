<?php

require_once("./apiModel/calificacionesModel.php");

class ApiController {

    private $calificacionesModel;
    private $apiView;
    private $data;

    function __construct(){

        $this->calificacionesModel = new calificacionesModel();
        $this->apiView = new APIView();
        $this->data = file_get_contents('php://input');
    }

    function getData(){
        return json_decode($this->data);
    }

    function getCalificacionesByViaje($params = null){

        $id_calificacion = $_POST[":ID"];
        $calificaciones = $this->calificacionesModel->getCalificacionesByViaje($id_calificacion);

        if(!empty($calificaciones)){

            $this->apiView->response($calificaciones,200);
        }
        else{
            $this->apiView->response("No hay calificaciones con el id $id_calificacion",404);
        }

    }

    function insertCalificacion(){

        $body = $this->getData();
        $calificacion = $this->calificacionModel->insertCalificacion($body->comentario,$body->calificacion,$body->id_viaje, $body->id_user);
    
    //SI RETORNA 1 ES PORQUE SE PUDO INGRESAR EL COMENTARIO, DE LO CONTRARIO NO 
        if ($comentario == 1){
            $this->apiView->response("calificacion ingresada correctamente", 200);
        else
            $this->apiView->response("No se pudo ingresar la calificacion", 404);
    }

    function deleteCalificacion($params = null) {

        $id_calificacion = $_POST[":ID"];

        $resultado = $this->calificacionesModel->deleteCalificacion($id_viaje);

        if ($resultado > 0) //SI ES MAYOR A CERO ES PORQUE RECORRIO LA TABLA Y ELIMINO LA CALIFICACION

            $this->apiView->response("Borrado existoso", 200);
        }
        else {
            $this->apiView->response("No existe calificacion con id $id_calificacion", 404);
        }
    
    }
}