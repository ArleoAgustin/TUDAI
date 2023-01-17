package parcial2022;

import parcial2022.Filtros.Filtro;

import java.util.ArrayList;

public class Clasificador {

    ArrayList<String> palabrasClaves;
    Filtro filtro;

    public void clasificar(Noticia noticia){
        if (filtro.cumple(noticia)){
            for(String e:palabrasClaves)
            noticia.addPalabrasClave(e);
        }
    }

}
