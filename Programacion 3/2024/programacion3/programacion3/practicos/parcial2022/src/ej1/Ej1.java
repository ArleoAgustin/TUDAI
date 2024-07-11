package ej1;

import ej1.grafos.Arco;
import ej1.grafos.GrafoDirigido;

import java.util.ArrayList;
import java.util.Iterator;

public class Ej1 {

    private GrafoDirigido grafo;
    private boolean seEncontroCicloIgual;
    private ArrayList visitados;


    public Ej1(GrafoDirigido grafo) {
        this.grafo = grafo;
        this.visitados = new ArrayList();
        this.seEncontroCicloIgual = false;
    }

    public boolean buscar(int x){

        Iterator<Integer> vertices = grafo.obtenerVertices();
        while(vertices.hasNext() && !seEncontroCicloIgual){
            int v = vertices.next();
            this.buscarCiclo(v, x);
        }

        return seEncontroCicloIgual;
    }

    private void buscarCiclo(int v, int x) {

        this.visitados.add(v);
        Iterator<Integer> adys = grafo.obtenerAdyacentes(v);
        while(adys.hasNext()){
            int a = adys.next();
            if(this.visitados.contains(a)){
                this.cicloIgual_X(a,a,x,0);
                return;
            }
            else buscarCiclo(a, x);
        }
    }

    private void cicloIgual_X(int v, int actual, int x, int suma) {

        if(suma == x && actual == v) {
            this.seEncontroCicloIgual = true;
            return;
        }
        Iterator<Integer> adys = grafo.obtenerAdyacentes(actual);
        while(adys.hasNext() && !this.seEncontroCicloIgual){
            int a = adys.next();
            if(this.visitados.contains(a)){
                Arco arco = grafo.obtenerArco(actual,a);
                suma += (int) arco.getEtiqueta();
                cicloIgual_X(v,a,x,suma);
            }
        }
    }
}
