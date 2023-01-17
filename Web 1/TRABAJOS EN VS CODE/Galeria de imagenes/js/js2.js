document.addEventListener('DOMContentLoaded', cargarPagina);
"use strict"
function cargarPagina () {

       

                
        let imagenes = document.querySelectorAll('.img');

        for(var i = 0; i < imagenes.length; i++) {
                imagenes[i].addEventListener('click', function(){
                this.classList.toggle("aumentar");
        });
        }  

}