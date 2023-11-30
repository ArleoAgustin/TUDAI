package tp1.ej6;

import java.util.Comparator;

public class ComparadorInteger<Integer> implements Comparator<Integer> {

    public ComparadorInteger(){

    }

    @Override
    public int compare(Integer o1, Integer o2) {
        return ((int)o1 - (int)o2);
    }
}
