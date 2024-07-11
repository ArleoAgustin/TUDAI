package ej9;

import java.util.ArrayList;

public class Ej9 {

    private Celda[][] matriz;

    public Ej9(Celda[][] matriz) {
        this.matriz = matriz;
    }

    /*La estrategia es agarrar de los adyacentes el que mayor valor tenga, asi hasta llegar al destino
    * */

    public ArrayList buscarSolucion(Celda actual, Celda destino){

        ArrayList<Celda> camino = new ArrayList<>();
        int sumaCosto = actual.getValue();
        camino.add(actual);

        while (actual != destino){

            //seleccion de candidatos
            ArrayList<Celda> candidatos = this.obtenerCandidatos(actual);

            if (candidatos.isEmpty()) {
                System.out.println("vacio");
                break;
            }
            Celda mejorCandidato = null;

            for (Celda candidato : candidatos){

                if (mejorCandidato == null)
                    mejorCandidato = candidato;

                else if (candidato.getValue() > mejorCandidato.getValue() && !camino.contains(candidato))
                    mejorCandidato = candidato;
            }
            if (mejorCandidato == null)
                break;

            sumaCosto += mejorCandidato.getValue();
            camino.add(mejorCandidato);
            actual = mejorCandidato;
        }
        return camino;
    }

    private ArrayList<Celda> obtenerCandidatos(Celda c) {

        ArrayList<Celda> candidatos = new ArrayList<>();

        if (c.isArriba())
            candidatos.add(matriz[c.getFila()-1][c.getColumna()]);

        if (c.isAbajo())
            candidatos.add(matriz[c.getFila()+1][c.getColumna()]);

        if (c.isDerecha())
            candidatos.add(matriz[c.getFila()][c.getColumna()+1]);

        if (c.isIzquierda())
            candidatos.add(matriz[c.getFila()][c.getColumna()-1]);

        return candidatos;
    }
}
