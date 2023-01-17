<?php

require_once("./app/model/loteModel.php");
require_once("./app/model/modelCiudad.php");
require_once("./app/model/laboratorioModel.php");
require_once("./app/view/loteView.php");

class loteController {

    private $model;
    private $viewLote;
    private $ciudadModel;
    private $laboratorioModel;
    private $userController;

    function __construct(){

        $this->viewLote = new loteView();
        $this->model = new loteModel();
        $this->ciudadModel = new modelCiudad();
        $this->laboratorioModel = new laboratorioModel();
        $this->userController = new userController();
    }

 //ALTERNATIVA A
    function addLote(){

        if (isset($_POST['nro_lote']) && (!empty($_POST['nro_lote'])) && isset($_POST['vencimiento']) && (!empty($_POST['vencimiento'])) && isset($_POST['id_ciudad']) && (!empty($_POST['id_ciudad'])) && isset($_POST['id_laboratorio']) && (!empty($_POST['id_laboratorio']))){
        
            $nro_lote = $_POST["nro_lote"];
            $anio_vencimiento = $_POST["vencimiento"];
            $id_ciudad = $_POST["id_ciudad"];
            $id_laboratorio = $_POST["id_laboratorio"];

            $admin = $this->userController->esAdmin();

            if ($admin == true) {

                $ciudad = $this->ciudadModel->getCiudad($id_ciudad);

                if (!empty($ciudad)) {

                    $laboratorio = $this->laboratorioModel->getLaboratorio($id_laboratorio);

                    if (!empty($laboratorio)){

                        $stock = $laboratorio->stock_lotes;
                        if ($laboratorio->stock_lotes > 0) {
                            $this->model->addLote($nro_lote,$anio_vencimiento,$id_ciudad,$id_laboratorio);
                            $stock = $stock -1;
                            $this->laboratorioModel->updateStock($id_laboratorio, $stock);    
                        }
                        else
                            $this->viewLote->showError("No hay stock disponible en el laboratorio indicado");
                    }
                    else
                        $this->viewLote->showError("El laboratorio indicado no existe");
                }
                else
                    $this->viewLote->showError("La ciudad ingresada no existe");
            }
        }
        else
        $this->viewLote->showError("Por favor complete todos los datos");
    }

 //ALTERNATIVA B
    function addLote(){

        if (isset($_POST['nro_lote']) && (!empty($_POST['nro_lote'])) &&
        isset($_POST['vencimiento']) && (!empty($_POST['vencimiento'])) &&
        isset($_POST['id_ciudad']) && (!empty($_POST['id_ciudad'])) &&
        isset($_POST['id_laboratorio']) && (!empty($_POST['id_laboratorio']))) {

            $nro_lote = $_POST['nro_lote'];
            $vencimiento = $_POST['vencimiento'];
            $id_ciudad = $_POST['id_ciudad'];
            $id_laboratorio = $_POST['id_laboratorio'];

            $admin = $this->userController->esAdmin();

            if ($admin = true) {

                $existe_ciudad = $this->ciudadModel->getCiudad($id_ciudad);
                $existe_laboratorio = $this->laboratorioModel->getLaboratorio($id_laboratorio)

                if (!empty($existe_ciudad)) {

                    if(!empty($existe_laboratorio)){

                        if($existe_ciudad->temperatura_conservacion <= $existe_laboratorio->temperatura_requerida){

                            $this->model->addLote($nro_lote,$vencimiento,$id_ciudad,$id_laboratorio);
                        }
                        else{
                            $this->viewLote->showMessage("La temperatura de conservacion en $existe_ciudad->nombre no es la adecuada");
                        }
                    }
                }
                else{
                    $this->viewLote->showMessage("La ciudad ingresada no existe");
                }
            }
        }
        else{
            $this->viewLote->showMessage("ingrese los datos correctamente");
        }
    }
}