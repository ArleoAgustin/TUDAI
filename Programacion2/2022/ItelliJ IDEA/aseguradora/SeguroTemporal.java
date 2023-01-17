package farmaciaIterableSimple.aseguradora;

import farmaciaIterableSimple.aseguradora.filtros.Filtro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class SeguroTemporal extends Seguro{
    private LocalDate fIncial, fFinal;
    private Seguro contenido;

    public SeguroTemporal(int dni, LocalDate fIncial, LocalDate fFinal, Seguro contenido) {
        super(dni);
        this.fIncial = fIncial;
        this.fFinal = fFinal;
        this.contenido = contenido;
    }

    public boolean estaVigente(){
        LocalDate hoy = LocalDate.now();
        return hoy.compareTo(fIncial) > 0 &&
                hoy.compareTo(fFinal) < 0;
    }

    @Override
    public int getNroPoliza() {
        return contenido.getNroPoliza();
    }

    @Override
    public double getCosto() {
        if (estaVigente())
            return contenido.getCosto();
        return 0.0;
    }

    @Override
    public double getMontoAsegurado() {
        if (estaVigente())
            return contenido.getMontoAsegurado();
        return 0.0;
    }

    @Override
    public ArrayList<SeguroSimple> segurosQueCumplen(Filtro condicion, Comparator<SeguroSimple> orden) {
        if (estaVigente())
            return contenido.segurosQueCumplen(condicion, orden);
        return new ArrayList<>();
    }
}
