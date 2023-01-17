package farmaciaIterableSimple.aseguradora;

import farmaciaIterableSimple.aseguradora.calculadores.CalculadorCosto;
import farmaciaIterableSimple.aseguradora.filtros.Filtro;

import java.util.ArrayList;
import java.util.Comparator;

public class SeguroSimple extends Seguro{

    private String descripcion;
    private int nroPoliza;
    private double montoAsegurado;
    private CalculadorCosto calculador;

    public SeguroSimple(int dniCliente, String descripcion, int nroPoliza, double monto, CalculadorCosto calculador) {
        super(dniCliente);
        this.descripcion = descripcion;
        this.nroPoliza = nroPoliza;
        this.montoAsegurado = monto;
        this.calculador = calculador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public int getNroPoliza() {
        return nroPoliza;
    }

    @Override
    public double getCosto() {
        return calculador.cuantoCuesta(this);
    }

    @Override
    public double getMontoAsegurado() {
        return montoAsegurado;
    }

    @Override
    public ArrayList<SeguroSimple> segurosQueCumplen(Filtro condicion, Comparator<SeguroSimple> orden) {
        ArrayList<SeguroSimple> retorno = new ArrayList<>();
        if (condicion.cumple(this))
            retorno.add(this);
        return retorno;
    }

    public void cambiarCalculador(CalculadorCosto nuevo){
        this.calculador = nuevo;
    }

}
