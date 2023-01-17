package filesystem;

import filesystem.condiciones.Condicion;

import java.util.ArrayList;

public class CarpetaOculta extends Carpeta{

    public CarpetaOculta(String nombre) {
        super(nombre);
    }

    @Override
    public ArrayList<Archivo> buscar(Condicion c) {
        return new ArrayList<>();
    }
}
