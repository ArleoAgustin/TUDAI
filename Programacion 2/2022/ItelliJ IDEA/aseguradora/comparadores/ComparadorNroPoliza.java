package farmaciaIterableSimple.aseguradora.comparadores;

import farmaciaIterableSimple.aseguradora.SeguroSimple;

import java.util.Comparator;

public class ComparadorNroPoliza implements Comparator<SeguroSimple> {
    @Override
    public int compare(SeguroSimple o1, SeguroSimple o2) {
        return o1.getNroPoliza() - o2.getNroPoliza();
    }
}
