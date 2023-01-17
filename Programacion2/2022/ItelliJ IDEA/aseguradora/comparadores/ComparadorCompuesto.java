package farmaciaIterableSimple.aseguradora.comparadores;

import farmaciaIterableSimple.aseguradora.SeguroSimple;

import java.util.Comparator;

public class ComparadorCompuesto implements Comparator<SeguroSimple>{
    Comparator<SeguroSimple> c1, c2;

    public ComparadorCompuesto(Comparator<SeguroSimple> c1, Comparator<SeguroSimple> c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public int compare(SeguroSimple o1, SeguroSimple o2) {
        int res = c1.compare(o1,o2);
        if (res == 0)
            return c2.compare(o1,o2);
        return res;
    }
}
