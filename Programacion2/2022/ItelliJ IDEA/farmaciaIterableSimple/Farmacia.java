package farmaciaIterableSimple;

import java.util.ArrayList;
import java.util.Iterator;

public class Farmacia implements Iterable<Medicamento>{
    private String nombre;
    private ArrayList<Medicamento> stock;

    public Farmacia(String nombre) {
        this.nombre = nombre;
        this.stock = new ArrayList<>();
    }

    public void addMedicamento(Medicamento m){
        if (m!=null)
            this.stock.add(m);
    }

    public boolean tieneMedicamento(Medicamento m){
        return this.stock.contains(m);
    }


    @Override
    public Iterator<Medicamento> iterator() {
        return stock.iterator();
    }
}


