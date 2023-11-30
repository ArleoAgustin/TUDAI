package tp4.ej6;

import java.util.ArrayList;
import java.util.List;

public class Ej6 {

    int fila = 4;
    int columna = 4;
    private Celda jardin[][] = new Celda[fila][columna];
    private List camino;
    private int cantPisadas;

    public Ej6(Celda[][] jardin) {
        this.jardin = jardin;
        this.camino = new ArrayList();
        this.cantPisadas = 8;
    }


    public List buscarCamino(Celda inicio){

        List caminoActual = new ArrayList();
        List celdasVisitadas = new ArrayList();
        buscar(inicio, inicio, caminoActual, celdasVisitadas, 1);
        return camino;
    }

    private void buscar(Celda inicio, Celda celdaActual, List<Celda> caminoActual, List<Celda> celdasVisitadas, int nroPisadas) {
   //    System.out.println(celdaActual);
   //     System.out.println("cant pisadas "+ nroPisadas);
        if (nroPisadas == cantPisadas && celdaActual.isVecinoInicio()) {
            caminoActual.add(inicio);
            camino = new ArrayList<>(caminoActual);
            return;
        }
        else{

        if (caminoActual.isEmpty()) {
            caminoActual.add(inicio);
        }

        if (!celdasVisitadas.contains(celdaActual)) {

            celdasVisitadas.add(celdaActual);

            int filaActual = celdaActual.getFila();
            int columnaActual = celdaActual.getColumna();

            // Movimiento hacia la izquierda
            if (columnaActual > 0 && jardin[filaActual][columnaActual - 1].isPisada() &&
                    !celdasVisitadas.contains(jardin[filaActual][columnaActual - 1])) {

                Celda sigCelda = jardin[filaActual][columnaActual - 1];
                caminoActual.add(sigCelda);
                buscar(inicio, sigCelda, caminoActual, celdasVisitadas, nroPisadas+1);
                caminoActual.remove(caminoActual.size() - 1);
            }

            // Movimiento hacia la derecha
            if (columnaActual < columna - 1 && jardin[filaActual][columnaActual + 1].isPisada() &&
                    !celdasVisitadas.contains(jardin[filaActual][columnaActual + 1])) {

                Celda sigCelda = jardin[filaActual][columnaActual + 1];
                caminoActual.add(sigCelda);
                buscar(inicio, sigCelda, caminoActual, celdasVisitadas,nroPisadas+1);
                caminoActual.remove(caminoActual.size() - 1);
            }

            // Movimiento hacia abajo
            if (filaActual < fila - 1 && jardin[filaActual + 1][columnaActual].isPisada() &&
                    !celdasVisitadas.contains(jardin[filaActual + 1][columnaActual])) {

                Celda sigCelda = jardin[filaActual + 1][columnaActual];
                caminoActual.add(sigCelda);
                buscar(inicio, sigCelda, caminoActual, celdasVisitadas,nroPisadas+1);
                caminoActual.remove(caminoActual.size() - 1);
            }

            // Movimiento hacia arriba
            if (filaActual > 0 && jardin[filaActual - 1][columnaActual].isPisada() &&
                    !celdasVisitadas.contains(jardin[filaActual - 1][columnaActual])) {

                Celda sigCelda = jardin[filaActual - 1][columnaActual];
                caminoActual.add(sigCelda);
                buscar(inicio, sigCelda, caminoActual, celdasVisitadas,nroPisadas+1);
                caminoActual.remove(caminoActual.size() - 1);
            }
        }
            celdasVisitadas.remove(celdasVisitadas.size()-1);
        }
    }
}
