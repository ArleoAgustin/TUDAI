<?php

require_once("./app/model/turnoModel.php");
require_once("./app/model/mensajeModel.php");


class turnoController{

    private $model;
    private $modelMensaje;
    private $view;

    function __construct(){

        $this->model = new turnoModel();
        $this->modelMensaje = new mensajeModel();
        $this->checkLoggedIn();
    }

    function turnosDia(){

        $dia = 10;
        $mes = 2;
        $turnos = $this->model->getTurnosByDia($dia,$mes);
        $cantTurnos_medico;

        print_r($turnos);
        echo("<br>");
        echo("<br>");
        echo"Lista de turnos";
        echo("<br>");
        echo("<br>");
        foreach($turnos as $turno){
            
            echo ("Dr ").$turno->nombre_medico;
            echo "<li> Paciente: $turno->nombre_paciente ($turno->hora:$turno->minuto) </li> ";
        }
    }

    function insertTurno(){

        $mes = $_POST["mes"];
        $dia = $_POST["dia"];
        $hora = $_POST["hora"];
        $minuto = $_POST["minuto"];
        $id_medico = $_POST["id_medico"];
        $id_paciente = $_POST["id_paciente"];
        $urgencia = $_POST["urgencia"];

        if (isset($_SESSION["user"])) {

            if ( (isset($mes)) && (isset($dia)) && (isset($hora)) && (isset($minuto)) && (isset($id_medico)) && (isset($id_paciente)) && (isset($urgencia)) ){

                $hay_turno = $this->model->getTurnoByHorarioMedico($mes,$dia,$hora,$minuto,$id_medico);
                if ( (15 % $minuto == 0) && (empty($hay_turno)) ) {

                    $this->model->insertTurno($mes,$dia,$hora,$minuto,$id_paciente,$id_medico,$urgencia);
                    $this->modelMensaje->insertMensaje($id_medico,$mensaje);

                }
            }
        }
    }

    private function checkLoggedIn(){
        
        session_start();                    
 
    }
}