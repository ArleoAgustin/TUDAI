package recuperatorio2023.ej4;

import tp4.Grafo;
import tp4.GrafoDirigido;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ej4 {

    private List<Integer> nodos;
    private Grafo grafo;

    public Ej4(GrafoDirigido g) {
        this.nodos = new ArrayList<>();
        this.grafo = g;

        Iterator<Integer> itGrafo = grafo.obtenerVertices();

        while (itGrafo.hasNext()){
            nodos.add(itGrafo.next());
        }
    }

    public boolean conectado(){
        List visitados = new ArrayList();
        for (int n: nodos){
            if (visitados.isEmpty())
                visitados.add(n);
            for (Iterator<Integer> it = grafo.obtenerAdyacentes(n); it.hasNext(); ) {
                int ady = it.next();

                if (!visitados.contains(ady))
                    visitados.add(ady);

            }
        }
        System.out.println(visitados);
        if (visitados.containsAll(nodos))
            return true;
        return false;
    }
}
