package filesystem.condiciones;

import filesystem.Archivo;

public abstract class Condicion {
    public abstract boolean cumple(Archivo arch);
}
