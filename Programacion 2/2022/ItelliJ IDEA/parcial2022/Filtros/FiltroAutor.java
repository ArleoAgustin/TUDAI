package parcial2022.Filtros;

import parcial2022.Noticia;

public class FiltroAutor extends Filtro{

    private String autor;

    public FiltroAutor(String t){this.autor = t;}

    public boolean cumple(Noticia n){return n.getAutor().equals(autor);}
}
