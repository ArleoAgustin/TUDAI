"use strict";

    let botonn = document.querySelector("#boton").addEventListener("click", anadir)


function anadir() {
    let texto = document.querySelector("#nombreyapellido")
    let titulo = document.querySelector("#titulo");
    titulo.innerHTML = texto.value
    texto.innerHTML = "";
}