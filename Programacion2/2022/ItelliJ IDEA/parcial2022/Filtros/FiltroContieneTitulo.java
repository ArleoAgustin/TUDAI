package parcial2022.Filtros;

import parcial2022.ElementoNoticia;
import parcial2022.Noticia;

public class FiltroContieneTitulo extends Filtro{

    private String titulo;

    public FiltroContieneTitulo(String t){this.titulo = t;}

    public boolean cumple(Noticia n){return n.getTitulo().contains(titulo);}
}
