package filesystem.condiciones;

import filesystem.Archivo;

public class CondicionOr extends Condicion{
    Condicion c1,c2;

    public CondicionOr(Condicion c1, Condicion c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Archivo arch) {
        return c1.cumple(arch) || c2.cumple(arch);
    }
}
