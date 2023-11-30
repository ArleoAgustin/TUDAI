import TPE_Parte1.Arco;
import TPE_Parte1.GrafoNoDirigido;
import java.util.*;

public class Greedy {

    private GrafoNoDirigido grafo;
    int iteraciones;

    public Greedy(GrafoNoDirigido grafo) {
        this.grafo = grafo;
        iteraciones = 0;
    }

    public int getIteraciones() {
        return iteraciones;
    }

    //Algoritmo de Prim utilizado

    public List<Arco> prim(int verticeInicial) {
        List<Arco> arbolCostoMinimo = new ArrayList<>();
        Set<Integer> visitados = new HashSet<>();
        PriorityQueue<Arco> colaPrioridad = new PriorityQueue<>(Comparator.comparingInt(arco -> (int) arco.getEtiqueta())); //van a ingresar ordenados de manera ascendente

        visitados.add(verticeInicial);

        while (visitados.size() < grafo.cantidadVertices()) { //control para ver si quedan vertices por visitar y seguir con el algoritmo de Prim
            iteraciones++;

            Iterator<Arco> arcos = grafo.obtenerArcos(); //traigo el iterador de arcos de los grafos
            while (arcos.hasNext()) {//mientras haya arcos
                Arco arco = arcos.next(); //agarra un arco
                if (visitados.contains(arco.getVerticeOrigen()) && !visitados.contains(arco.getVerticeDestino())) { //si el origen esta visitado y el destino no lo está
                    colaPrioridad.add(arco);//agrego a la cola de prioridad
                }
            }

            Arco arcoMinimo = colaPrioridad.poll();
            int verticeDestino = arcoMinimo.getVerticeDestino();

            if (!visitados.contains(verticeDestino)) {
                arbolCostoMinimo.add(arcoMinimo);
                visitados.add(verticeDestino);
            }
        }
        return arbolCostoMinimo;
    }
}


