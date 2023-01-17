<?php

function getPagos () {
    
    // 1. SE ESTABLECE LA CONEXION CON LA BASE DE DATOS
    $db = new PDO ('mysql:host=localhost;'. 'dbname=db_deudas;charset=utf8', 'root', '');

    // 2. EJECUTA LA CONSULTA SQL
    $sentencia = $db->prepare('SELECT * FROM pagos');   #SE PREPARA LO QUE SE VA A CONSULTAR, SI SE PUSIERA "WHERE cuota=1" ESTAMOS PIDIENDO SOLO LAS CUOTAS 1 
    $sentencia->execute();      #SE EJECUTA LA CONSULTA SQL

    // 3. SE OBTIENEN LOS DATOS DE LA CONSULTA
    //FETCH DEVUELVE UN SOLO REGISTRO Y FETCHALL DEVUELVE UN ARREGLO CON TODOS LOS REGISTROS
    $pagos = $sentencia->fetchAll(PDO::FETCH_OBJ); #DEVUELVE UN ARREGLO CON TODOS LOS PAGOS EN ESTE CASO

    return $pagos;
}

function deletePagos () {

    $db = new PDO ('mysql:host=localhost;'. 'dbname=db_deudas;charset=utf8', 'root', '');
    $sentencia = $db->prepare("DELETE FROM pagos WHERE id=?");

}

$pagos = getPagos();

