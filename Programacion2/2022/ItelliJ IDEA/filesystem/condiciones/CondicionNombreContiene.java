package filesystem.condiciones;

import filesystem.Archivo;

import java.util.Locale;

public class CondicionNombreContiene extends Condicion{
    private String subcadena;

    public CondicionNombreContiene(String subcadena) {
        this.subcadena = subcadena;
    }

    @Override
    public boolean cumple(Archivo arch) {
        return arch.getNombre().toLowerCase().contains(subcadena.toLowerCase());
    }
}