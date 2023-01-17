package parcial2022.Filtros;

import parcial2022.Noticia;

public class FiltroNot extends Filtro{

    private Filtro f;

    public FiltroNot(Filtro f){
        this.f = f;
    }

    public boolean cumple(Noticia n){return !f.cumple(n);}
}
