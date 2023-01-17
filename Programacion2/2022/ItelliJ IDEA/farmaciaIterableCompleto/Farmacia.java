package farmaciaIterableCompleto;

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

    public ArrayList<Medicamento> buscar(Condicion cond){
        ArrayList<Medicamento> filtrados = new ArrayList<>();
        for (int i = 0; i < this.stock.size(); i++) {
            if (cond.cumple(stock.get(i)))
                filtrados.add(stock.get(i));
        }
        return filtrados;
    }

    @Override
    public Iterator<Medicamento> iterator() {
        return new IteradorMedicamentos();
    }

    private class IteradorMedicamentos implements Iterator<Medicamento>{
        private int pos;

        public IteradorMedicamentos(){
            pos = 0;
        }

        @Override
        public boolean hasNext() {
            return pos < stock.size();
        }

        @Override
        public Medicamento next() {
            pos++;
            return stock.get(pos-1);
        }
    }
}


