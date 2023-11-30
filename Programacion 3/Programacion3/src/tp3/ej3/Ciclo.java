package tp3.ej3;

import TPE_Programacion3.Arco;
import TPE_Programacion3.Grafo;
import TPE_Programacion3.GrafoDirigido;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Ciclo {

    private HashMap<Integer, String> vertices;
    private Grafo grafo;
    private boolean ciclo;

    public Ciclo(GrafoDirigido g){
        this.grafo = g;
        vertices = new HashMap<>();
        Iterator<Integer> itVertices = grafo.obtenerVertices();
        while (itVertices.hasNext()){
            vertices.put(itVertices.next(), "Blanco");
        }
    }

    public boolean hayCiclo(){

        for (int v: vertices.keySet()){
            if (vertices.get(v).equals("Blanco"))
                buscarCiclo(v);
            if (ciclo)
                return true;
        }
        return false;
    }

    public void buscarCiclo(int v){
        System.out.println(v);
        vertices.put(v, "Amarillo");
        for (Iterator<Integer> it = grafo.obtenerAdyacentes(v); it.hasNext(); ) {
            int ady = it.next();
            if (vertices.get(ady).equals("Blanco"))
                buscarCiclo(ady);
            else if (vertices.get(ady).equals("Amarillo")) {
                this.ciclo = true;
            }
        }
    }

}
