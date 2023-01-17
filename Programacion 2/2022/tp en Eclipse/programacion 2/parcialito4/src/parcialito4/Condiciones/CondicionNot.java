package parcialito4.Condiciones;

import parcialito4.Producto;

public class CondicionNot extends Condicion {
	Condicion c1;

    public CondicionNot(Condicion c1) {
        this.c1 = c1;
    }

    @Override
    public boolean cumple(Producto p) {
        return !c1.cumple(p);
    }

}
