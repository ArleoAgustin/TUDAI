<?php

require_once "db_pagos.php";


function showDB () {

    $pagos = getPagos();
    
    echo "<table border=2>";
    echo"<tr>";
    echo "<td>DEUDOR</td>";
    echo "<td>CUOTA</td>";
    echo "<td>MONTO</td>";
    echo "<td>FECHA DE PAGO</td>";
    echo"<tr>";
    foreach($pagos as $pago) {

        echo"<tr>";
        $cont = 1;
        while ($cont <= 1) {

                echo "<td>".$pago->deudor."</td>";
                echo "<td>$pago->cuota</td>";
                echo "<td>$$pago->cuota_capital</td>";
                echo "<td>$pago->fecha_pago</td>";
        
            $cont++;
        }
        echo"</tr>";
    }
    echo"</table>";
    
    
}

showDB();