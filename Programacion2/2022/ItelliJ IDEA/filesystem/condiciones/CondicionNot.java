package filesystem.condiciones;

import filesystem.Archivo;

public class CondicionNot extends Condicion{
    Condicion c1;

    public CondicionNot(Condicion c1) {
        this.c1 = c1;
    }

    @Override
    public boolean cumple(Archivo arch) {
        return !c1.cumple(arch);
    }
}
