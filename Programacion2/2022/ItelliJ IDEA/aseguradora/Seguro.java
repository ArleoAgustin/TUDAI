package farmaciaIterableSimple.aseguradora;

import farmaciaIterableSimple.aseguradora.filtros.Filtro;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class Seguro {
    private int dniCliente;

    public Seguro(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    public int getDniCliente() {
        return dniCliente;
    }

    public abstract int getNroPoliza();

    /**
     * Costo es el valor que pagan mensual por el seguro
     */
    public abstract double getCosto();

    /**
     * Monto Asegurado es el valor del bien sobre el que
     * aplica el seguro
     */
    public abstract double getMontoAsegurado();

    public abstract ArrayList<SeguroSimple> segurosQueCumplen(Filtro condicion, Comparator<SeguroSimple> orden) ;

}
