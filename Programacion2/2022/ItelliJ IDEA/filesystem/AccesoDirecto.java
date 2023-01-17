package filesystem;

import filesystem.condiciones.Condicion;

import java.util.ArrayList;

public class AccesoDirecto extends ElementoSA{
    private static final String PREFIJO = "Acceso directo a ";
    private static final double TAMANIO = 1;
    private ElementoSA referencia;

    public AccesoDirecto(ElementoSA alQueApunta) {
        super(PREFIJO+alQueApunta.getNombre());
    }

    @Override
    public double getTamanio() {
        return TAMANIO;
        //return referencia.getTamanio()
    }

    @Override
    public int cantElementos() {
        return 1;
    }

    @Override
    public ArrayList<Archivo> buscar(Condicion c) {
        return new ArrayList<>();
    }
}
