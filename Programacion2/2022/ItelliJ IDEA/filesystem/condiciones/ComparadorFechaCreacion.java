package filesystem.condiciones;

import filesystem.Archivo;

import java.util.Comparator;

public class ComparadorFechaCreacion implements Comparator<Archivo> {
    @Override
    public int compare(Archivo o1, Archivo o2) {
        return o1.getFechaCreac().compareTo(o2.getFechaCreac());
    }
}
