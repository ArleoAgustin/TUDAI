package parcial2022.Filtros;

import parcial2022.Noticia;

public class FiltroCategoria extends Filtro{

    private String categoria;

    public FiltroCategoria(String t){this.categoria = t;}

    public boolean cumple(Noticia n){return n.getCategoria().equals(categoria);}
}
