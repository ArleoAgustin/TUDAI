document.addEventListener('DOMContentLoaded', cargarPagina);

"use strict"

function cargarPagina () {


    document.querySelector(".vermas_depo").addEventListener("click", function() {

        document.querySelector(".oculto").classList.toggle("mostrar");

    })

    document.querySelector(".vermas_eco").addEventListener("click", function() {

        document.querySelector(".ocultoE").classList.toggle("mostrar");

    })
 

}