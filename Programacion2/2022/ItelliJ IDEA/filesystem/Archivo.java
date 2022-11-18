package filesystem;

import filesystem.condiciones.Condicion;

import java.time.LocalDate;
import java.util.ArrayList;

public class Archivo extends ElementoSA {
    private String extension;
    private double tamanio;

    public Archivo(String nombre, String extension, double tamanio) {
        super(nombre);
        this.extension = extension;
        this.tamanio = tamanio;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
        this.seModifico();
    }

    @Override
    public double getTamanio() {
        return tamanio;
    }

    @Override
    public int cantElementos() {
        return 1;
    }

    @Override
    public ArrayList<Archivo> buscar(Condicion c) {
        ArrayList<Archivo> res = new ArrayList<>();
        if (c.cumple(this))
            res.add(this);
        return res;
    }

    @Override
    public ElementoSA copiar() {
        return new Archivo(this.getNombre(), this.getExtension(), this.getTamanio());

    }

    public ElementoSA copiar(Condicion c){

        if (c.cumple(this))
            return this.copiar();
        return null;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
        this.seModifico();
    }


}
