document.addEventListener('DOMContentLoaded', cargarPagina);
"use strict"
function cargarPagina () {

       document.querySelector(".borrar_parrafo").addEventListener("click", function () {

                let parrafos = document.querySelectorAll(".parrafo");
                let ultimoParrafo = parrafos[parrafos.length-1];
                ultimoParrafo.parentNode.removeChild(ultimoParrafo)

       })

}