package centroAnimales.criterios;

import centroAnimales.Caracteristica;
import centroAnimales.Jaula;

public class CriterioCaracteristicaIgualValor extends Criterio{
    private Object valorBuscado;
    private String nombreCaracteristica;

    public CriterioCaracteristicaIgualValor(String nombreCaracteristica, Object valor){
        this.valorBuscado = valor;
        this.nombreCaracteristica = nombreCaracteristica;
    }

    @Override
    public boolean cumple(Jaula j) {
        Caracteristica c = j.getCaracteristica(nombreCaracteristica);
        if (c == null) return false;
        else return c.getValor().equals(valorBuscado);
    }
}
