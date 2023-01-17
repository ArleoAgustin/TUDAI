<?php

require_once();

class laboratorioController {

    private $modelLote;
    private $modelCiudad;
    private $laboratorioModel;

    function __construct(){

        $this->modelLote = new modelLote();
        $this->modelCiudad = new modelCiudad();
        $this->laboratorioModel = new laboratorioModel();
        
    }   

        [
            {
                "laboratorio": "Pfizer",
                "total": 50000,
            }..
        ]

    function tablaResumenDePagos(){

        $laboratorios = $this->laboratorioModel->getAllLaboratorios();
        $arrLaboratorios = [];

        if(!empty($laboratorios)) {

            foreach ($laboratorios as $laboratorio) { 

                $dataLaboratorio = new stdClass();
                $dataLaboratorio->nombre_laboratorio = $laboratorio->nombre;

                $lotes = $this->modelLote->getLoteByLaboratorio($laboratorio->id);
                $precio_lote = $laboratorio->costo_lote;
                $precio_total;
                if(!empty($lotes)){
                    
                    $cantLotes = count($lotes);
                    $precio_total = $precio_lote * $cantLotes;
                    $dataLaboratorio->precio_total = $precio_total;
                }
                $jsonDatos = json_encode($dataLaboratorio);
                array_push($arrLaboratorios, $dataLaboratorio);
            }

        }
        if (!empty($arrLaboratorios)) {
            $this->viewLaboratorios->showTabla($arrLaboratorios);
        }
        print_r($arrLaboratorios);

    }
}