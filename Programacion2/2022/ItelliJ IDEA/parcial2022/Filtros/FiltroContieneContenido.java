package parcial2022.Filtros;

import parcial2022.Noticia;

public class FiltroContieneContenido extends Filtro{

    private String frase;

    public FiltroContieneContenido(String t){this.frase = t;}

    public boolean cumple(Noticia n){return n.getContenido().contains(frase);}
}
