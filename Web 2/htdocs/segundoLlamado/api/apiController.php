<?php

require_once "Model/ModelCentroSalud.php";
require_once "Model/ModelLote.php";
require_once "api/ApiView.php";

class ApiController
{
    private $view;
    private $modelCentroSalud;
    private $modelLote;

    function __construct(){
        $this->modelCentroSalud= new ModelCentroSalud();
        $this->modelLote=new ModelLote();
        $this->view= new APIView();
        $this->data= file_get_contents('php://input');
    }

    function getData(){
        return json_decode($this->data);
    }

    function getCentrosDeSalud($params = null){

        $id_municipio = $params[":ID"];

        $centros = $this->modelCentroSalud->getCentrosBymunicipio();
        if(!empty($centros)){
            $this->view->response($centros, 200);
        }
        else {
            $this->view->response("No hay centros de salud en el municipio" 404);
        }

    }

    function lotesDisponiblesPorCentro($params = null){

        $id_centro = $params[":ID"];
        $lotes = $this->modelLote->getLotesByCentro($id_centro);
        if(!empty($lotes)){
            $this->view->response($lotes,200);
        }
        else{
            $this->view->response("No hay lotes disponibles en el centro de salud nro $id_centro" ,404);
        }
    }
}