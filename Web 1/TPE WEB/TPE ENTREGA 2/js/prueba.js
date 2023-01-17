"use strict"

document.addEventListener('DOMContentLoaded', cargarPagina);

function cargarPagina () {

    let compra = []
    let total = []

    function datosPrecargados () {

        let max = 1;
        let producto = "Milanesa";
        let precio = 150;
        total[0] = 0;
        for (let i = 0; i <= max; i ++) {

            let articulo = {
                "producto" : producto,
                "precio" : precio
            }
            compra.push(articulo);
            crear_fila(articulo, i);
            total[i] = total[i] + precio;
            producto = "Fideos con salsa";
            precio = 120;
            
        }console.log(total)
    }

        function crear_fila (articulo, i) {

        let filaTabla = document.getElementById("carrito");
        filaTabla.innerHTML += '<td>' + articulo.producto +'</td><td>' + "$ " + articulo.precio +'</td><td>' + "$ "+ total[i] + '</td>';

        }

        datosPrecargados();


}