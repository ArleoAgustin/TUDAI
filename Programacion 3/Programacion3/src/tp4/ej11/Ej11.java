package tp4.ej11;

import java.lang.reflect.AnnotatedArrayType;
import java.util.ArrayList;
import java.util.List;

public class Ej11 {

    int fila = 4;
    int columna = 4;
    private Celda casa[][] = new Celda [fila][columna];
    private List camino;


    public Ej11(Celda[][] casa) {
        this.casa = casa;
        this.camino = new ArrayList(25);
    }

    public List resolver(Celda inicio, Celda destino){

        List caminoActual = new ArrayList();
        List visitados = new ArrayList();
        resolver(inicio, caminoActual,destino, visitados);
        return camino;
    }

    private void resolver(Celda cActual, List caminoActual, Celda cDestino, List visitados) {

        if(caminoActual.isEmpty()){
            caminoActual.add(cActual);
        }

        if (cActual == cDestino ){

            if (this.camino.isEmpty()) {
                this.camino = new ArrayList(caminoActual);
            }
            else if(caminoActual.size() < this.camino.size()){
                this.camino = new ArrayList(caminoActual);
            }
            return;
        }

        else{
            if (!visitados.contains(cActual)){

                visitados.add(cActual);
                int columnaActual = cActual.getColumna();
                int filaActual = cActual.getFila();

                //izquierda
                if (columnaActual > 0 && casa[filaActual][columnaActual - 1].getValor() == 0 &&
                        !visitados.contains(casa[filaActual][columnaActual - 1])) {

                    Celda sigCelda = casa[filaActual][columnaActual - 1];
                    caminoActual.add(sigCelda);
                    resolver(sigCelda,caminoActual,cDestino,visitados);
                    caminoActual.remove(caminoActual.size()-1);
                }
                //derecha
                if (columnaActual < columna-1 && casa[filaActual][columnaActual + 1].getValor() == 0 &&
                        !visitados.contains(casa[filaActual][columnaActual + 1])) {

                    Celda sigCelda = casa[filaActual][columnaActual + 1];
                    caminoActual.add(sigCelda);
                    resolver(sigCelda,caminoActual,cDestino,visitados);
                    caminoActual.remove(caminoActual.size()-1);
                }

                //abajo
                if (filaActual < fila-1 && casa[filaActual+1][columnaActual].getValor() == 0 &&
                        !visitados.contains(casa[filaActual+1][columnaActual])) {

                    Celda sigCelda = casa[filaActual+1][columnaActual];
                    caminoActual.add(sigCelda);
                    resolver(sigCelda,caminoActual,cDestino,visitados);
                    caminoActual.remove(caminoActual.size()-1);
                }

                //arriba
                if (filaActual > 0 && casa[filaActual-1][columnaActual].getValor() == 0 &&
                        !visitados.contains(casa[filaActual-1][columnaActual])) {

                    Celda sigCelda = casa[filaActual-1][columnaActual];
                    caminoActual.add(sigCelda);
                    resolver(sigCelda,caminoActual,cDestino,visitados);
                    caminoActual.remove(caminoActual.size()-1);
                }
                visitados.remove(visitados.size()-1);
            }
        }
    }
}
