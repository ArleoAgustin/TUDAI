function cambiarEstilo() {
    let contenido = document.getElementById('contenedor');
    contenido.classList.toggle('informacion');
}

let bntCambiador = document.getElementById('cambiador');
bntCambiador.addEventListener('click', cambiarEstilo);
