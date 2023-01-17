package filesystem;

import filesystem.condiciones.Condicion;

import java.util.ArrayList;

public class Carpeta extends ElementoSA{
    private ArrayList<ElementoSA> elementos;

    public Carpeta(String nombre) {
        super(nombre);
        elementos = new ArrayList<>();
    }

    @Override
    public double getTamanio() {
        double total = 0.0;
        for(ElementoSA hijo:elementos)
            total += hijo.getTamanio();
        return total;
    }

    public void agregarElemento(ElementoSA elem){
        this.elementos.add(elem);
    }

    public int cantElementos(){
        int cant = 1;
        for(ElementoSA hijo:elementos)
            cant += hijo.cantElementos();
        return cant;
    }

    @Override
    public ArrayList<Archivo> buscar(Condicion c){
        ArrayList<Archivo> resultado = new ArrayList<>();
        for(int i = 0 ; i<elementos.size() ; i++){
            ElementoSA hijo = elementos.get(i);
            resultado.addAll(hijo.buscar(c));
        }
        return resultado;
    }

    @Override
    public ElementoSA copiar() {
        Carpeta aux = new Carpeta(this.getNombre());
        for (ElementoSA s: this.elementos){
            aux.agregarElemento(s.copiar());
        }
        return aux;
    }

    @Override
    public ElementoSA copiar(Condicion c) {

        Carpeta aux = new Carpeta(this.getNombre());

        for (ElementoSA s : this.elementos) {
            if (s.copiar(c) != null)
                aux.agregarElemento(s.copiar(c));
        }
        if (aux.elementos.isEmpty())
            return null;
        else
            return aux;
    }
}
