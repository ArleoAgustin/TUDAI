<?php

class turnoModel{

    private $db;

    function __construct(){

        $this->db = new PDO('mysql:host=localhost;'.'dbname=careme;charset=utf8', 'root', '');
    }
//******************************************************
    function getTurnosByDia($dia,$mes){
        
        $query = $this->db->prepare('SELECT nombre_medico, nombre_paciente, hora, minuto FROM turno INNER JOIN medico ON turno.id_medico = medico.id INNER JOIN paciente ON turno.id_paciente = paciente.id  WHERE mes=? AND dia=? ORDER BY nombre_medico ');
        $query->execute([$mes,$dia]);
        $turno = $query->fetchAll(PDO::FETCH_OBJ);
        return $turno;
    }
//*******************************************************
    function getTurnoByHorarioMedico($mes,$dia,$hora,$minuto,$id_medico){

        $query = $this->db->prepare('SELECT * FROM turno WHERE mes=?,dia=?,hora=?,minuto=?,id_medico=?');
        $query->execute([$mes,$dia,$hora,$minuto,$id_medico]);
        $turno = $query->fetch(PDO::FETCH_OBJ);
        return $turno;
    }

    function insertTurno($mes,$dia,$hora,$minuto,$id_paciente,$id_medico,$urgencia){
        $query = $this->db->prepare('INSERT INTO turno(mes,dia,hora,minuto,id_paciente,id_medico,urgencia) VALUES(?,?,?,?,?,?,?)');
        $query->execute([$mes,$dia,$hora,$minuto,$id_paciente,$id_medico,$urgencia]);
    }

    function upgradeTurno($mes,$dia,$hora,$minuto,$id_medico){

        $query = $this->db->prepare('UPDATE turno SET mes=?, dia=?, hora=?, minuto=? WHERE id_medico=?');
        $query->execute([$mes,$dia,$hora,$minuto,$id]);
    }
}