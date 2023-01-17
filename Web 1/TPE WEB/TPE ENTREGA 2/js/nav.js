"use strict";

document.addEventListener('DOMContentLoaded', cargarNav);

function cargarNav () {

    let contador = 0;

    document.querySelector("#btn-menu").addEventListener("click", function () {

     
    
        // ESTE IF HACE QUE EL CONTADOR SE VUELVA 1 Y SE APLICA EL ESTILO DE CLASE QUE DESPLIEGA EL NAV

        if (contador == 0) {

            document.querySelector("nav").classList.add("desplegarNav");
            contador = 1;
            console.log("El nav esta mostrandose y el contador es: " + contador);

        }

        // CUANDO EL CONTADOR ES 1, AL HACER "CLICK" SE REMUEVE EL ESTILO DE CLASE Y EL NAV SE VUELVE A PLEGAR

        else if(contador == 1) {

            document.querySelector("nav").classList.remove("desplegarNav")
            contador = 0;
            console.log("El nav NO esta mostrandose y el contador es: " + contador);
            
        }
    })

    }
