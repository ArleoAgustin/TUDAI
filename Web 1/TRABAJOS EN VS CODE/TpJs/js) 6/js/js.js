"use strict";

function agregar() {
    document.querySelector(".div1").classList.add("agregarborde")
}

let botonn = document.querySelector("#boton").addEventListener("click", agregar)