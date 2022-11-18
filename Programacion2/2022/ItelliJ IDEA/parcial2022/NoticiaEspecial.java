package parcial2022;

import java.util.ArrayList;
import java.util.Collections;

public class NoticiaEspecial extends NoticiaCompuesta {


    private int cantidad;
    private String categoria;
    private int maxCantPalabras;

    public NoticiaEspecial(String categoria, int p) {
        this.categoria = categoria;
        this.maxCantPalabras = p;
    }

    public ArrayList<String> getPalabrasClave() {

        ArrayList<String> aux = super.getPalabrasClaves();
        Collections.sort(aux);
        ArrayList<String> resultado=new ArrayList<>();
        for (int i = 0; (i<aux.size() && (i<this.maxCantPalabras));i++){
            resultado.add(aux.get(i));
        }
        return resultado;
    }

    public String getCategoria(){return categoria;}
}