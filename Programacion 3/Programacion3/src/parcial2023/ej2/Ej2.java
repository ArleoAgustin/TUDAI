package parcial2023.ej2;

import java.util.ArrayList;
import java.util.List;

public class Ej2 {

    private Celda[][] matriz;
    private  int fila = 4;
    private  int columna = 4;

    public Ej2(Celda[][] matriz) {
        this.matriz = matriz;
    }

    public List Greedy(Celda actual, Celda destino, List camActual){

            while(destino != actual){
                List mays = this.getMovs(actual);
                System.out.println(mays);
                Celda may = this.getMayor(mays);
                System.out.println("mayor " +may);
                camActual.add(may);
                matriz[may.getFila()][may.getColumna()].setPisada(true);
                actual = may;

            }

        return camActual;
    }

    private List getMovs(Celda actual){
        List movs = new ArrayList();

        if (actual.getFila()+1 < fila && (actual.getValor() < matriz[actual.getFila()+1][actual.getColumna()].getValor())){
                Celda sig = matriz[actual.getFila()+1][actual.getColumna()];
            System.out.println("Abajo");
                if (!sig.isPisada()){
                    movs.add(sig);
                }
        }

        if (actual.getFila()-1 > 0 && (actual.getValor() < matriz[actual.getFila()-1][actual.getColumna()].getValor())){
            Celda sig = matriz[actual.getFila()-1][actual.getColumna()];
            System.out.println("arriba");
            if (!sig.isPisada()){
                movs.add(sig);
            }
        }

        if (actual.getColumna()+1 < columna && (actual.getValor() < matriz[actual.getFila()][actual.getColumna()+1].getValor())){
            System.out.println("derecha");
            Celda sig = matriz[actual.getFila()][actual.getColumna()+1];
            if (!sig.isPisada()){
                movs.add(sig);
            }
        }

        if (actual.getColumna()-1 > 0 && (actual.getValor() < matriz[actual.getFila()][actual.getColumna()-1].getValor())){
            System.out.println("izquierda");
            Celda sig = matriz[actual.getFila()][actual.getColumna()-1];
            if (!sig.isPisada()){
                movs.add(sig);
            }
        }

        return movs;
    }

    private Celda getMayor(List<Celda> celdas){

        int v = -1;
        Celda retorno = null;
        for (Celda c: celdas){

            if (c.getValor() > v)
                retorno = c;
        }
        return retorno;
    }
}
