<?php

require_once('./model/loteModel.php');

class loteController {

    private $model;

    function __construct(){

        $this->model = new loteModel();
    }

    function addLote(){

        $admin = $this->verificarSiESAdmin();

        if($admin = True){    
            if ((isset($_POST("nro_lote")) && !empty($_POST("nro_lote"))) && (isset($_POST("anio_vencimiento")) && !empty($_POST("anio_vencimiento"))) && (isset($_POST("ciudad")) && !empty($_POST("ciudad"))) && (isset($_POST("laboratorio")) && !empty($_POST("laboratorio")))) {

                $existe_ciudad = False;
                $exite_laboratorio = False;
                $temp_adecuada = False;
                $lotes = $this->model->getLotes();

                foreach($lotes as $lote){
                    if ($lote->id_ciudad == $_POST("ciudad"))
                        $existe_ciudad = True;
                    
                    if($lote->id_laboratorio == $_POST("laboratorio"))
                        $exite_laboratorio = True;
                    
                    if($_POST("temp_requerida") <= $lote->temp_conservacion)
                        $temp_adecuada = True;
                }

                if(($existe_ciudad = True) && ($exite_laboratorio = True)) {

                    if($temp_adecuada = True)
                        $this->model->addLoteDB($_POST("nro_lote"), $_POST("anio_vencimiento"), $_POST("ciudad"), $_POST("laboratorio"));
                    else
                    $this->view->showFormLote("La temperatura de conservacion no es la adecuada")
                }
                else
                    $this->view->showFormLote("La ciudad o laboratorio no existe");
                
            }
        }
    }

    private function verificarSiESAdmin(){
        
        if((isset($_SESSION["ROL"])) && ($_SESSION["ROL"] != "admin")){
            $admin = False;
        }
        else{
            $admin = True;
        }
        return $admin;
    }

}