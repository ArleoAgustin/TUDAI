package tp6.ej2;


import java.util.ArrayList;

public class ColaOrdenada {
	
    private ArrayList<ElementoOrdenable> elementos;

    public ColaOrdenada(){
        this.elementos = new ArrayList<>();
    }

    public void addElemento(ElementoOrdenable elemento){
        
        boolean encontrado = false;
        int i = 0;
        while (!encontrado && i<elementos.size()) {
            if (elementos.get(i).esMayor(elemento))
                i++;
            else
                encontrado = true;
        }
        if (encontrado)
            elementos.add(i, elemento);
        else
            elementos.add(elemento);
    }

    public boolean tieneElementos(){
        return elementos.size()>0;
    }

    public ElementoOrdenable siguiente(){
        ElementoOrdenable sig = elementos.get(0);
        elementos.remove(0);
        return sig;
    }

    public String toString(){
        return elementos.toString();
    }
}

