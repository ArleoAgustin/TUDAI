document.addEventListener('DOMContentLoaded', cargarPagina);

"use strict"

function cargarPagina () {

    let compra = [];
    let id = [];
    let  baseURL = 'http://web-unicen.herokuapp.com/api/groups/'
    let groupID = 'arleo';
    let collectionID = 'viandas';
    let total = 0;

    cargarTabla_desde_api();
    
//AGREGAR X1

    document.getElementById("cargar").addEventListener("click", function() {
            
        let vianda = document.getElementById("vianda").value;
        let precio = parseInt(document.getElementById("precio").value); 
        let carrito = cargar_json(vianda, precio);
        
    //http://web-unicen.herokuapp.com/api/groups/arleo/viandas

        if (vianda != "") {

            total += precio;
            cargar_datos_a_la_API (carrito)
            
        }

        console.log(compra);
    
    })

//ELIMINAR TODOS LOS JSON DE LA API Y BORRAR TABLA

    document.getElementById("eliminar").addEventListener("click", function() {

            eliminar_toda_la_API ()
            compra.splice(2, compra.length);
            id.splice(0, id.length);
            document.getElementById("tb").innerHTML = compra;
            total = 0;
            console.log("Arreglo de compra:");
            console.log(compra);
            console.log();
            console.log("Arreglo de ID's:");
            console.log(id);
    }) 

//CARGAR JSON

    function cargar_json (vianda, precio) {

        let carrito = {
    
            "thing": {

                "vianda": vianda,
                "precio": precio
        
            }
        }
        

        return(carrito);
    }

//CREAR FILA EN EL HTML

    function crear_tabla (carrito, total, nro_id, json) {

        let nuevoID = nro_id;
        let filaTabla = document.getElementById("tb");
        filaTabla.innerHTML +=  '<td>' + carrito.thing.vianda +'</td><td>' + "$ " + carrito.thing.precio + '</td><td>' + "$ " + total + '</td><td class="botonBorrar"> <button class="botonBorrarTD" id="' + nuevoID+ '"> <i class="fa fa-trash-o"></i>Borrar</button></td>'
        boton_borrar_fila ()
    }

//CARGAR DATOS DESDE LA API
    
    function cargarTabla_desde_api () {

        fetch(baseURL + groupID + "/" + collectionID, {  //http://web-unicen.herokuapp.com/api/groups/arleo/viandas
            
            "method": "GET",
            "mode": "cors"
        
        })
        .then (function(r){
                
            if (!r.ok) {
                console.log("error")
            }
            return r.json()
        
        })

        .then (function(json) {
            
            for (let i = 0; i < json.viandas.length; i++) {
                
                let carrito = json.viandas[i];
                total += json.viandas[i].thing.precio;
                id.push(json.viandas[i]._id)
                let nro_id = id[i];
                crear_tabla (carrito, total, nro_id, json);
                compra.push(carrito);
            
            }
        })

        .catch (function(e) {

            console.log(e)

        })
        console.log("Arreglo Compra:")
        console.log(compra)
        console.log("Arreglo de id's:")
        console.log(id)
    }

//CARGAR X3

    document.getElementById("cargarx3").addEventListener("click", function() {

        let cont = compra.length       //CONT SE VUELVE LA LONGUITUD DEL ARREGLO
        let max = cont +3;            // MAX SE VUELVE CONT + 3 PORQUE DESDE LA ULTIMA POSICION DEL ARREGLO SE CREAN 3 NUEVAS CELDAS
        let producto = document.getElementById('vianda').value;
        let precio = parseInt (document.getElementById('precio').value);
        let carrito;

        while ((cont < max) && ((producto != '') && (precio != ''))) { // EL WHILE FUNCIONA COMO EL FOR, CICLA 3 VECES
            
            total+= precio
            carrito = cargar_json(producto, precio);               // LA VARIABLE CARRITO SE VUELVE LO QUE RETORNA "cargarObjeto()"
            cargar_datos_a_la_API(carrito);
            cont = cont +1;
            
        }

        console.log(compra)


    })

//CARGAR DATOS A LA API
    function cargar_datos_a_la_API (carrito) {

        fetch(baseURL + groupID + "/" + collectionID, { 
            
            "method": "POST",
            "mode": "cors",
            "headers": { "Content-Type": "application/json" },
            "body": JSON.stringify(carrito)
        
        })
        
        .then (function(r){
            
            if (!r.ok) {
                console.log("error")
            }
            return r.json()
        
        })

        .then (function(json) {

            console.log("Carga exitosa!")
            compra.push(json.information);
            id.push(json.information._id);
    
            let i = 0;
            let nro_id;

            for (i = 0 ; i < id.length; i++) {
                nro_id = id[i];
                
            }     
            crear_tabla (carrito, total, nro_id, json)       

        })

        .catch (function(e) {

            console.log(e)

        })


    }

//ELIMINAR DATOS DE LA API

    function eliminar_toda_la_API () {

        fetch(baseURL + groupID + "/" + collectionID, {

        })

        .then (function(r){
                
            if (!r.ok) {
                console.log("error")
            }
            return r.json()
        
        })

        .then(function (json) {

            let nuevoID;

            for (let i = 2; i < (json.viandas.length); i++) {  
                
                nuevoID = json.viandas[i]._id;                 

                fetch(baseURL + groupID + "/" + collectionID + "/" + nuevoID, {
                
                    'method': 'DELETE',
                    'mode': "cors"

                })
                
                .then(function(r){

                    return r.json()

                })
                
                .then(function(json){
                    
                    console.log("Borrado exitoso!");
                    
                })
                
                .catch(function(e){

                    console.log(e)

                })
            }


        })
        

        .catch (function(e) {

            console.log(e)

        })

    }


//ElIMINAR UN DETERMINADO OBJETO

function boton_borrar_fila () {   //FALTA TERMINAR

    let buttons = document.querySelectorAll('.botonBorrarTD'); 

    for (let i = 0; i < buttons.length; i++) {

        buttons[i].addEventListener('click', function() {  

            console.log("nro de boton: " + i);

            document.getElementById('tb').deleteRow(i);
            location.reload();           

       })
                                                                
          
    }
        
}

}