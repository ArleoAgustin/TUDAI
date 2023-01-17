
function nose() {
    botonenvio = document.querySelector("#boton");
    input = document.querySelector("#anadir");
    listatareas = document.querySelector("#listatareas")
    botonenvio = document.addEventListener("click", fanadir);
}

function fanadir() {
    if (input.value !== "") {
        let crearlista = document.createElement("li");
        crearlista.innerHTML = input.value;
        listatareas.appendChild(crearlista);
        input.value = "";
    }
}