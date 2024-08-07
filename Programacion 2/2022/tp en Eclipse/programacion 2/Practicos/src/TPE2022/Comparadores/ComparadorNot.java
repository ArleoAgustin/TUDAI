package TPE2022.Comparadores;

import java.util.Comparator;

public class ComparadorNot<T> implements Comparator<T> {

    private Comparator<T> comp;
    
    public ComparadorNot(Comparator<T>c){
        this.comp=c;
    }

    @Override
    public int compare(T o1, T o2) {
     
        return comp.compare(o1,o2) * -1;
	}

}
