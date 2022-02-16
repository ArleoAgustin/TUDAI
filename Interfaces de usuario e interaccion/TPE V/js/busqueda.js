let ubicacionPrincipal  = window.pageYOffset;
window.onscroll = function() {
    let Desplazamiento_Actual = window.pageYOffset;
    if(ubicacionPrincipal >= Desplazamiento_Actual){
        document.querySelector('.containerFiltro').style.top = '95px';
        document.querySelector('.containerFiltro').style.top = '95px';
    }

    ubicacionPrincipal = Desplazamiento_Actual;
}