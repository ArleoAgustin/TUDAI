package filesystem;

import filesystem.condiciones.Condicion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public abstract class ElementoSA implements Comparable<ElementoSA>{
    private String nombre;
    private LocalDate fechaCreac;
    private LocalDate fechaModif;

    public ElementoSA(String nombre) {
        this.nombre = nombre;
        this.fechaCreac = LocalDate.now();
        this.fechaModif = LocalDate.now();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        seModifico();
    }

    protected void seModifico(){
        this.fechaModif = LocalDate.now();
    }

    public LocalDate getFechaCreac() {
        return fechaCreac;
    }

    public LocalDate getFechaModif() {
        return fechaModif;
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public int compareTo(ElementoSA otro) {
        return this.getNombre().compareTo(otro.nombre);
    }

    public ArrayList<Archivo> buscarOrdenado(Condicion c){
        ArrayList<Archivo> resultado = this.buscar(c);
        Collections.sort(resultado);
        return resultado;
    }
    public ArrayList<Archivo> buscarOrdenado(Condicion c, Comparator<Archivo> orden){
        ArrayList<Archivo> resultado = this.buscar(c);
        Collections.sort(resultado, orden);
        return resultado;
    }
    public abstract double getTamanio();
    public abstract int cantElementos();
    public abstract ArrayList<Archivo> buscar(Condicion c);

    public abstract ElementoSA copiar();
    public abstract ElementoSA copiar(Condicion c);
}
