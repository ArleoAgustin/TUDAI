"use strict"

function cuenta() {
    let operacion = document.querySelector("#operaciones").value
    let primerValor = document.querySelector("#valor1").value;
    let segundoValor = document.querySelector("#valor2").value;
    console.log(primerValor);
    console.log(segundoValor);
    let resultado = document.querySelector("#resultado");

    switch (operacion) {
        case 'suma':
            let suma = parseInt(primerValor) + parseInt(segundoValor);
            resultado.innerHTML = suma;
        break;

        case 'resta':
            let resta = parseInt(primerValor) - parseInt(segundoValor);
            resultado.innerHTML = resta;
        break;

        case 'multi':
            let multiplicacion = parseInt(primerValor) * parseInt(segundoValor);
            resultado.innerHTML = multiplicacion;
        break;

        case 'division':
            let div = parseInt(primerValor) / parseInt(segundoValor);
            resultado.innerHTML = div;
        break;
    }
}

let boton = document.querySelector("#calcular").addEventListener("click", cuenta);