package Filtros;

import ElementosDeJuego.Atributo;

public class FiltroAnd extends Filtro{
    private Filtro f1;
    private Filtro f2;

    public FiltroAnd(Filtro f1, Filtro f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

 //en este caso se niegan los filtros para que devuelva si es igual   
    
    @Override
    public boolean cumple(Atributo a) {
        return !f1.cumple(a) && !f2.cumple(a);
    }

	@Override
	public boolean cumpleCompuesto(Atributo a, Atributo b) {
		// TODO Auto-generated method stub
		return false;
	}
}
