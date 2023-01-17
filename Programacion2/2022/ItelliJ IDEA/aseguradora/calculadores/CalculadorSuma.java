package farmaciaIterableSimple.aseguradora.calculadores;

import farmaciaIterableSimple.aseguradora.SeguroSimple;

public class CalculadorSuma extends CalculadorCosto{
    private CalculadorCosto calc1, calc2;

    public CalculadorSuma(CalculadorCosto calc1, CalculadorCosto calc2) {
        this.calc1 = calc1;
        this.calc2 = calc2;
    }

    @Override
    public double cuantoCuesta(SeguroSimple seguroSimple) {
        return calc1.cuantoCuesta(seguroSimple) +
               calc2.cuantoCuesta(seguroSimple);
    }
}
