let ubicacionPrincipal  = window.pageYOffset;
window.onscroll = function() {
    let Desplazamiento_Actual = window.pageYOffset;
    if(ubicacionPrincipal >= Desplazamiento_Actual){
        document.querySelector('.contacts-section').style.top = '120px';
         document.querySelector('.containerPublicidades').style.top = '120px';
    }

    ubicacionPrincipal = Desplazamiento_Actual;
}