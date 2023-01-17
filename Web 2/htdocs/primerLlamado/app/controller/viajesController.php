<?php

require_once("./app/model/viajesModel.php");
//require_once("userController.php");
require_once("./app/model/pasajeModel.php");
require_once("./app/model/ciudadModel.php");

class viajesController {

    private $viajesModel;
    private $pasajeModel;
    private $ciudadModel;
    private $userController;

    function __construct(){

        $this->viajesModel = new viajesModel();
        $this->ciudadModel = new ciudadModel();
        $this->pasajeModel = new pasajeModel();
   //     $this->userController = new userController();
    }

    function resumenViajesPorCiudad(){

        $ciudades = $this->ciudadModel->getAllCiudades();
        $arrCiudades = [];

        if(!empty($ciudades)){

            foreach ($ciudades as $ciudad) {
                
                $viajes = $this->viajesModel->getViajesByCity($ciudad->id);
                $dataCiudad = new stdClass();
                $dataCiudad->nombre_ciudad = $ciudad->nombre_ciudad;
                $cantidad_viajes = 0;
                $arrViajes = [];
                //print_r($viajes);
                if(!empty($viajes)){

                    foreach($viajes as $viaje){
                        $cantidad_viajes ++;
                        $ciudad_origen = $this->ciudadModel->getCiudad($viaje->id_ciudad_origen);
                        $ciudad_destino = $this->ciudadModel->getCiudad($viaje->id_ciudad_destino);
                        
                        $dataViaje = new stdClass();
                        $dataViaje->nro_viaje = $viaje->nro_viaje;
                        $dataViaje->origen = $ciudad_origen->nombre_ciudad;
                        $dataViaje->destino = $ciudad_destino->nombre_ciudad;
                        $dataViaje->dia = $viaje->dia;
                        $dataViaje->hora = $viaje->hora;

                        $jsonViaje = json_encode($dataViaje);
                        array_push($arrViajes,$jsonViaje);
                    }
                }

                $dataCiudad->total_viajes = $cantidad_viajes;
                $dataCiudad->detalle_viaje = $arrViajes;
                $jsonCiudad = json_encode($dataCiudad);
                array_push($arrCiudades,$jsonCiudad);
            }
        }
        if (!empty($arrCiudades)){
            //$this->viajesView->showViajes($arrCiudades);
        }

        print_r($arrCiudades);
    }



    function deleteViaje($params = null){

        if (isset($paramas[":ID"]) &&  !empty($params[":ID"])) {

            $id_viaje = $params[":ID"];
            
            $admin = $this->userController->esAdmin();
            if ($admin = true) {

                $viajes = $this->viajesModel->getViajeById($id_viaje);

                if(!empty($viajes)){

                    $this->viajesModel->deleteViaje($id_viaje);
                    $cancelado = 1;
                    $this->pasajeModel->cancelarPasaje($id_viaje, $cancelado);
                }
                else{
                    $this->viewPasaje->showMessage("El viaje seleccionado no existe");
                }
            }
            
        }

    }




    function addViaje(){

        if((isset($_POST["nro_viaje"])) && (!empty($_POST["nro_viaje"])) && //SE VERIFICA QUE INGRESE TODOS LOS DATOS
        (isset($_POST["dia"])) && (!empty($_POST["dia"])) && 
        (isset($_POST["hora"])) && (!empty($_POST["hora"])) && 
        (isset($_POST["empresa"])) && (!empty($_POST["empresa"])) && 
        (isset($_POST["id_ciudad_origen"])) && (!empty($_POST["id_ciudad_origen"])) && 
        (isset($_POST["id_ciudad_destino"])) && (!empty($_POST["id_ciudad_destino"]))) {

            $nro_viaje = $_POST["nro_viaje"];
            $dia = $_POST["dia"];
            $hora = $_POST["hora"];
            $empresa = $_POST["empresa"];
            $id_ciudad_origen = $_POST["id_ciudad_origen"];
            $id_ciudad_destino = $_POST["id_ciudad_destino"];

            $admin = $this->userController->esAdmin();  //SE OBTIENE SI EL USER ES ADMIN O NO

            if ($admin = true) {    //SI ES ADMIN

                $origen = $this->ciudadModel->getCiudad($id_ciudad_origen); //SE OBTIENE LA CIUDAD DE ORIGEN
                $destino = $this->ciudadModel->getCiudad($id_ciudad_destino);   //SE OBTIENE LA CIUDAD DE DESTINO
                
                if((!empty($origen)) && (!empty($destino))) {   //SI EXITEN AMBAS CIUDADES

                    if ($origen->aspo == 0 && $destino->aspo == 0) {    //SI NO ESTAN EN CUARENTENA

                        $existeViaje = $this->viajesModel->getViajes($dia,$hora,$empresa);  //SE VERIFICA QUE NO EXISTA OTRO VIAJE EL MISMO DIA, HORA Y DE LA MISMA EMPRESA

                        if(empty($existeViaje)){    //SI NO EXISTE OTRO VIAJE
                            
                            $this->viajesModel->insertViaje($nro_viaje,$dia,$hora,$empresa,$id_ciudad_origen,$id_ciudad_destino);   //SE AGREGA EL NUEVO VIAJE
                        }
                        else{
                            $this->viewViajes->showMessaje("Ya hay un viaje programado para ese horario, de la empresa $empresa");
                        }
                    }
                    else{
                        $this->viewViajes->showMessaje("Una de las ciudades esta en ASPO");
                    }
                }
                else{
                    $this->viewViajes->showMessaje("Una de las ciudades no existe");
                }
            }

        }
        else{
            $this->viewViajes->showMessaje("Por favor complete todos los datos");
        }
    }

    /*EJEMPLO DE COMO QUEDARIA EL ARREGLO CON LOS JSON'S
                    [
                        "nro_viaje": "B145",
                        "origen": "Tandil",
                        "destino": "Mar del Plata",
                        "dia": "25/04/2021",
                        "hora": "15:00",
                        "cant_pasajes": 30,
                        "pasajes":
                        [{
                           "DNI": 41969678,
                           "cantidad": 1 
                        },
                         ...
                        ]
                
                    ]
    
    
    */

    function resumenDeViajes(){

        $viajes = $this->viajesModel->getAllViajes();   //OBTENGO LOS VIAJES
        $arrViajes = [];    //ARREGLO PARA CONTENER LOS JSON DE LOS VIAJES
        
        if(!empty($viajes)){    //SI HAY VIAJES

            foreach ($viajes as $viaje){    //RECORRO EL ARREGLO DE VIAJES
                
                $ciudad_origen = $this->ciudadModel->getCiudad($viaje->id_ciudad_origen);   //TRAIGO LA CIUDAD DE ORIGEN
                $ciudad_destino = $this->ciudadModel->getCiudad($viaje->id_ciudad_destino); //TRAIGO LA CIUDAD DE DESTINO

                $datosViaje = new stdClass();   //CREO UN OBJETO PARA CONTENER LOS DETALLES DE LOS VIAJES
                $datosViaje -> nro_viaje = $viaje->nro_viaje;   //CARGO EL NRO DE VIAJE
                $datosViaje -> origen = $ciudad_origen->nombre_ciudad;  //LA CIUDAD DE ORIGEN
                $datosViaje -> destino = $ciudad_destino->nombre_ciudad;    //LA CIUDAD DE DESTINO
                $datosViaje -> dia = $viaje->dia;   //EL DIA DEL VIAJE
                $datosViaje -> hora = $viaje->hora; //LA HORA DE SALIDA

                $cantidad_Total_Pasajes = 0;    //LA CANTIDAD DE PASAJES POR VIAJES (POR ESO SE REINICIA, PQ ES POR VIAJE)
                $pasajes = $this->pasajeModel->getPasajeByViaje($viaje->id);    //TRAIGO LOS PASAJES DE ESE VIAJE
                $arrPasajes = [];   //ARREGLO PARA CONTENER LOS JSON DE LOS VIAJES

                foreach ($pasajes as $pasaje) { //RECORRO EL ARREGLO DE PASAJES

                    $datosPasaje = new stdClass();  //CREO UN JSON PARA LOS DETALLES DE CADA PASAJE
                    $datosPasaje -> DNI = $pasaje-> dni;    //DNI DEL PASAJERO
                    $datosPasaje -> cantidad = $pasaje -> cantidad; //LA CANTIDAD DE PASAJES Q COMPRO
                                      
                    $cantidad_Total_Pasajes += $pasaje->cantidad;   //SE SUMAN LOS PASAJES
                    $jsonPasaje = json_encode($datosPasaje);    //SE CONVIERTE EN UN JSON
                    array_push($arrPasajes, $jsonPasaje);   //SE PUSHEA EL ARREGLO PARA AGREGAR EL JSON DE PASAJE
                
                }

                $datosViaje -> cantidad = $cantidad_Total_Pasajes;  //CANTIDAD TOTAL DE PASAJES DEL VIAJE
                $datosViaje -> pasajes = $arrPasajes;   //ARREGLO DE PASAJES 
                $jsonViaje = json_encode($datosViaje);  //SE CONVIERTE EN JSON
                array_push($arrViajes,$jsonViaje);  //SE PUSHEA EL JSON DE VIAJES
                
            }
        }
        print_r($arrViajes);
    }
}