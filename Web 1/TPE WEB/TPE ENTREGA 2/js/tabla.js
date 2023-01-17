"use strict"
document.addEventListener('DOMContentLoaded', cargarPagina);

function cargarPagina () {
   
    let compra = []
    let total = 0;
   
    // DATOS PRECARGADOS EN LA TABLA

    function datosPrecargados () {
      
        let max = 1;        // MAX ES = 1 PORQUE AGEGREGA SOLO DOS PRODUCTOS PRECARGADOS AL CARRITO
        let producto = "milanesa";
        let precio = 150;

        for (let i = 0; i <= max; i++) { // CON ESTE FOR SE AHORRA REPETIR CODIGO PARA CARGAR EL OBJETO Y AGREGAR CELDAS AL ARREGLO

            total += precio;
            let carrito = {             // OBJETO QUE CONTIENE EL ARTICULO CON SU PRECIO Y EL PRECIO TOTAL HASTA EL MOMENTO
                "articulo" : {   
                    "producto": producto,
                    "precio" : precio
                },
                "total": total
            }   
            compra.push(carrito);
            crear_fila(carrito);
            producto = "Fideos con salsa";
            precio = 120;
        }
    }

    datosPrecargados();         // AL CARGAR LA PAGINA APARECEN LOS ELEMENTOS PRECARGADOS


    //BOTON AGREGAR 1
    
    document.getElementById("agregar").addEventListener("click", function() {
        
        let producto = document.getElementById('producto').value;
        let precio = parseInt (document.getElementById('precio').value);
        let carrito;
        
        if ((producto != '') && (precio != '')) {
                
                carrito = cargarObjeto (producto, precio)       // LA VARIABLE CARRITO SE VUELVE LO QUE RETORNA "cargarObjeto()"
                compra.push(carrito);                   //SE CREA UNA CELDA EN EL ARREGLO Y SE AGREGA EL OBJETO
                crear_fila(carrito);                        // SE CREA LA FILA EN LA TABLA
        }
        console.log (compra)
    })
    
    
    // BOTON AGREGAR X3
    
    document.getElementById("agregar3").addEventListener("click", function() {

        let cont = compra.length       //CONT SE VUELVE LA LONGUITUD DEL ARREGLO
        let max = cont +3;           // MAX SE VUELVE CONT + 3 PORQUE DESDE LA ULTIMA POSICION DEL ARREGLO SE CREAN 3 NUEVAS CELDAS
        let producto = document.getElementById('producto').value;
        let precio = parseInt (document.getElementById('precio').value);
        let carrito;

        while ((cont < max) && ((producto != '') && (precio != ''))) { // EL WHILE FUNCIONA COMO EL FOR, CICLA 3 VECES
            
            carrito = cargarObjeto(producto, precio);       // LA VARIABLE CARRITO SE VUELVE LO QUE RETORNA "cargarObjeto()"
            compra.push(carrito);
            crear_fila(carrito);                //SE CREA LA FILA EN LA TABLA
            cont = cont +1;
            
        }
        console.log(compra)
        
    })
    
 /* FUNCION PARA CARGAR EL PRODUCTO, SU PRECIO Y EL PRECIO TOTAL DE LOS PRODUCTOS A UN OBJETO,
    RETORNA EL JSON "CARRITO" */

    function cargarObjeto(producto, precio) {
          
        total += precio;        // SE VA A ACUMULAR EL PRECIO TOTAL
               
        let carrito = {         //OBJETO QUE CONTIENE EL ARTICULO CON SU PRECIO Y EL PRECIO TOTAL HASTA EL MOMENTO
   
            "articulo" : {   
                "producto": producto,
                "precio" : precio
            },
            "total": total
   
               }    
           return(carrito);
       }


 //FUNCION QUE CREA UNA NUEVA FILA EN LA TABLA

    function crear_fila (carrito) {
        let filaTabla = document.getElementById("carrito");
        filaTabla.innerHTML += '<td>' + carrito.articulo.producto +'</td><td>' + "$ " + carrito.articulo.precio +'</td><td>' + "$ "+ carrito.total + '</td>';
    }

    
 //BORRAR TODOS LOS ELEMEMTOS DE LA TABLA 
    
    document.getElementById("vaciarTabla").addEventListener('click', function(){
        
        compra.splice(0, compra.length);
        document.getElementById("carrito").innerHTML = compra;
        total = 0;      // EL PRECIO TOTAL VUELVE A SER 0
        console.log(compra)
        
    })
    
 // BORRAR ULTIMO ELEMENTO DE LA TABLA (FALTA TERMINAR)
    
 /*   document.getElementById("borrar1").addEventListener("click", function() {
    
    }) */
    
}