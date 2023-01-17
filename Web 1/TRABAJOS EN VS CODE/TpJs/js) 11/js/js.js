"use strict"

let valor = Math.floor(Math.random() * (37 - 0)) + 0;
console.log(valor)

document.querySelector ('#intentar').classList.add ('ocultar');

let botonn = document.querySelector("#boton").addEventListener('click', ruleta)

function ruleta() {

    let inputIngresado = document.querySelector("#apostar").value;
    let ingreso = document.querySelector('#ingresado').innerHTML = 'Numero apostado: ' + inputIngresado;
    let result = document.querySelector('#resultado');
    
    if (inputIngresado == valor) {
        result.innerHTML = 'Salio el ' + valor + ' FELICITACIONES!!!'
    } else {
        result.innerHTML = 'salio el ' + valor + ' Usted perdio :('
        mostrarintentar();
    }
}

function mostrarintentar () {
     document.querySelector('#intentar').classList.remove ("ocultar");
}


// boton "intentar", vuelve a recargar la pagina
let intentarr = document.querySelector("#intentar").addEventListener('click', recarga)

function recarga (){
    location.reload()
}