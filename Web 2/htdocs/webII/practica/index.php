<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>INDEX</title>
</head>
<body> 

    <h1>Calculadora</h1>

    <?php include 'nav.php' ?>
    
    <form action="index.php" method="get">

        <input type="number" name="valor1">
        <input type="number" name="valor2">
        <select name="operacion">
            <option value="sumar">Sumar</option>
            <option value="restar">Restar</option>
            <option value="multiplicar">Multiplicar</option>
            <option value="dividir">Dividir</option>
        </select>
        <input type="submit" value="CALCULAR">

    </form>
</body>
</html>

<?php

    require_once "operaciones.php";

    if(isset($_GET["valor1"]) && isset($_GET["valor2"])){

        $valor1 = $_GET["valor1"];
        $valor2 = $_GET["valor2"];
    
        $operacion = $_GET["operacion"];

        switch ($operacion) {   
            case 'sumar':
                $resultado = sumar($valor1, $valor2);
                break;

            case 'restar':
                $resultado = restar($valor1, $valor2);
                break;

            case 'dividir':
                $resultado = dividir($valor1, $valor2);
                break;

            case 'multiplicar':
                $resultado = multiplicar($valor1, $valor2);
                break;
        }
    
    
        echo "Resultado de " . $operacion . " " . $valor1 . " y " . $valor2 . " es " .$resultado;
    }
?>

<script src="main.js"></script>

