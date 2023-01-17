
document.addEventListener('DOMContentLoaded', cargarPagina);

"use strict"

function cargarPagina () {

    let objeto = {

        "cursos" : [
     
            {
     
                "sede": "Tandil",
     
                "aprobados": 88,
     
                "desaprobados": 64,
     
                "anio": 2019
     
            },
     
            {
     
                "sede": "Rauch",
     
                "aprobados": 19,
     
                "desaprobados": 6,
     
                "anio": 2019
     
            },
            
            {
     
                "sede": "Tres arroyos",
     
                "aprobados": 15,
     
                "desaprobados": 8,
     
                "anio": 2019
     
            },
            
            {
     
                "sede": "Rauch",
     
                "aprobados": 25,
     
                "desaprobados": 8,
     
                "anio": 2018
     
            },

            {
     
                "sede": "Tandil",
     
                "aprobados": 50,
     
                "desaprobados": 19,
     
                "anio": 2018
     
            },
     
        ]

     }

     for (let i = 0; i < objeto.cursos.length; i++) {

        let nodo = document.createElement("li");
        nodo.innerHTML = objeto.cursos[i].sede +" - "+ objeto.cursos[i].anio;
        document.getElementById("texto").appendChild(nodo);
        }
        
     

}