package filesystem;

import filesystem.condiciones.Condicion;

import java.util.ArrayList;

public class Comprimido extends Carpeta{
    private double tasa;
    public Comprimido(String nombre, double t) {
        super(nombre);
        this.tasa = t;
    }

    @Override
    public double getTamanio(){
        return super.getTamanio()*tasa;
    }

    @Override
    public ArrayList<Archivo> buscar(Condicion c) {
        return new ArrayList<>();
    }
}
