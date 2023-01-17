package parcial2022;

import parcial2022.Filtros.Filtro;

import java.util.ArrayList;

public abstract class ElementoNoticia {

    ArrayList<Clasificador> clasificadores;

    public abstract String getCategoria();

    /*Por otro lado, las palabras claves de una sección/subsección/grupo/subgrupo, se calculan como la
    unión de todas las palabras claves de los elementos que contiene, sin incluir palabras repetidas.
    */

    public abstract ArrayList<String> getPalabrasClaves();

    public abstract ArrayList<Noticia> buscar(Filtro filtro);

    public void clasificar(Noticia noticia){
        for (int i =0;i<clasificadores.size();i++){
            clasificadores.get(i).clasificar(noticia);
        }

    }

}
