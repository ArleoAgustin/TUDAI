package filesystem.condiciones;

import filesystem.Archivo;

public class CondicionPesoMenor extends Condicion{
    private double peso;

    public CondicionPesoMenor(double peso) {
        this.peso = peso;
    }

    @Override
    public boolean cumple(Archivo arch) {
        return arch.getTamanio() < peso;
    }
}
