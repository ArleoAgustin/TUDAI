package ej7;

import java.util.Comparator;

public class ComparadorInteger<T> implements Comparator<T> {

    public ComparadorInteger() {}

    @Override
    public int compare(T o1, T o2) {
        return ((int) o1 - (int) o2);
    }

}
