
document.addEventListener('DOMContentLoaded', cargarPagina);

    "use strict"

    function cargarPagina () {

        let array = [];


        document.getElementById("cargar").addEventListener("click", function () {

            let obtener_notas = parseInt (document.getElementById("notas").value);

            if (obtener_notas != "") {
                array.push (obtener_notas); 
            }

            console.log (array)

        })

        document.getElementById("obtener_promedio").addEventListener("click", function() {

            let suma = 0;
            let resultado = 0;

            for (let i = 0; i < array.length; i++) {

                suma += array[i];
            }

            resultado = suma / array.length

            document.querySelector(".mostrar_promedio").innerHTML = "El promedio del alumno es " + resultado;
        })

    }