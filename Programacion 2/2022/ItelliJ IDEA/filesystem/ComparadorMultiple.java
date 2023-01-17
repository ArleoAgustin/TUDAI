package filesystem;

import java.util.Comparator;

public class ComparadorMultiple implements Comparator<Archivo> {
    Comparator<Archivo> c1, c2;

    public ComparadorMultiple(Comparator<Archivo> c1, Comparator<Archivo> c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public int compare(Archivo a1, Archivo a2) {
        int resu = c1.compare(a1,a2);
        if (resu == 0)
            return c2.compare(a1,a2);
        return resu;
    }
}
