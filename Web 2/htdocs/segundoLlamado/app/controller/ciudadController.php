<?php

require_once("./app/model/ciudadModel.php");
require_once("./app/model/loteModel.php");

class ciudadController {

    private $modelCiudad;
    private $modelLote;
    private $ciudadView;

    function __construct(){

        $this->modelCiudad = new ciudadModel();
        $this->modelLote = new loteModel();
       // $this->ciudadView = new ciudadView();
    }
     /*                           [
                                    {
                                        "ciudad": "Tandil",
                                        "cantidad": "3",
                                        "lotes": [
                                        {
                                            "nro_lote": "A20",
                                            "vencimiento": "2021",
                                            "laboratorio": "Pfizer"  
                                        }
                                        ]
                                    }
                                ]*/

    function prueba(){
        
        $ciudades = $this->modelCiudad->getAllCiudades();   //SE OBTIENEN TODAS LAS CIUDADES
        $ciudadesConLotes = []; //SE CREA UN ARREGLO QUE VA A CONTENER TODAS LAS CIUDADES

        foreach ($ciudades as $ciudad) {
            
            $lotes = $this->modelLote->getLotesByCiudad($ciudad->id);   //SE OBTIENEN LOS LOTES POR CIUDAD
            
            if(!empty($lotes)){
                $cantidad = count($lotes);  //SE OBTIENE LA CANTIDAD DE LOTES POR CIUDAD

                $jsonCiudad = new stdClass();   //SE CREA UN JSON QUE VA A CONTENER LOS DATOS DE CADA CIUDAD
                $jsonCiudad->ciudad = $ciudad->nombre_ciudad;
                $jsonCiudad->cantidad = $cantidad;
                
                $arrLotes = [];     //SE CREA UN ARREGLO PARA LOS DETALLES DE CADA LOTE
                foreach ($lotes as $lote) {
                    
                    $data = new stdClass(); //SE CREA EL JSON DE LOTE
                    $data->nro_Lote = $lote->nro_lote;
                    $data->laboratorio = $lote->nombre_laboratorio;
                    $data->anio_vencimiento = $lote->anio_vencimiento;

                    $jsonLote = json_encode($data); //SE GUARDA EL LOTE EN FORMATO JSON
                    array_push($arrLotes, $jsonLote);   //SE PUSHEA EL JSON AL ARREGLO DE LOTES
                    $jsonCiudad->lotes = $arrLotes; //EL JSON EN "LOTES" SE VUELVE EL ARREGLO DE LOTES
                }
                
                $json = json_encode($jsonCiudad);
                array_push($ciudadesConLotes, $json);
            }
            
        }
        print_r($ciudadesConLotes);
        //$this->ciudadesView->showLotesByCiudad($ciudadesConLotes); //SE ENVIA EL ARREGLO QUE CONTIENE TODAS LAS CIUDADES CON SUS LOTES
    }

    function generarTabla(){

        $lista = [];
        $ciudades = $this->modelCiudad->getAllCiudades();

        if(!empty($ciudades)) {

            foreach ($ciudades as $ciudad) {
                
                $listaLote = [];
                $lotes = $this->modelLote->getLoteByCiudad($ciudad->id);

                foreach ($lotes as $lote) {
                    
                    $data = new stdClass();
                    $data->nro_Lote = $lote->nro_lote;
                    $data->laboratorio = $lote->nombre_laboratorio;
                    $data->ciudad = $lote->nombre_ciudad;
                    $data->anio_vencimiento = $lote->anio_vencimiento;
                    
                    $json = json_encode($data);
                    array_push($listaLote, $json);
                }
            }
        }
    }
}