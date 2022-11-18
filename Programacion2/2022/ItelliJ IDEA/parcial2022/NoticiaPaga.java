package parcial2022;

import parcial2022.Filtros.Filtro;

import java.util.ArrayList;

public class NoticiaPaga extends Noticia{

    public NoticiaPaga(String contenido, String titulo, String autor, String categoria) {
        super(contenido, titulo, autor, categoria);
    }

    public ArrayList<Noticia> buscar(Filtro filtro){
        ArrayList<Noticia> resultado=new ArrayList<>();
        resultado.add(this);
        return resultado;
    }
}
