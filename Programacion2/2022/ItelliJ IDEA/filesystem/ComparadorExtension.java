package filesystem;

import java.util.Comparator;

public class ComparadorExtension implements Comparator<Archivo> {
    @Override
    public int compare(Archivo o1, Archivo o2) {
        return o1.getExtension().compareTo(o2.getExtension());
    }
}
