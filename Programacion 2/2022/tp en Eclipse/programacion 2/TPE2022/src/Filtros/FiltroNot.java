package Filtros;

import ElementosDeJuego.Atributo;

public class FiltroNot extends Filtro{
    private Filtro f1;

    public FiltroNot(Filtro positivo) {
        this.f1 = positivo;
    }

    @Override
    public boolean cumple(Atributo a) {
        return !f1.cumple(a);
    }

	@Override
	public boolean cumpleCompuesto(Atributo a, Atributo b) {
		// TODO Auto-generated method stub
		return false;
	}
}
