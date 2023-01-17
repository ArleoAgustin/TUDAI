package parcial2022;

import parcial2022.Filtros.Filtro;

import java.util.ArrayList;

public class NoticiaCompuesta extends ElementoNoticia {

    private int pos; //pos es el valor para retornar la categoria
    private ArrayList<ElementoNoticia> elementos;
    private static String sinderfinir="Sin definir";
    public NoticiaCompuesta(){

    }
    /*La categoría de cada sección /
    subsección se determina por la categoría del elemento en la posición 4, mientras
    que para los grupos y subgrupos es la posición 5 (estas posiciones no son fijas
    sino que pueden cambiar, y si no hay elementos suficientes siempre retornan “Sin
    definir”). */
    public String getCategoria(){
        if (pos<elementos.size()){
            return elementos.get(pos).getCategoria();
        }else return sinderfinir;
    }

    /*    Por otro lado, las palabras claves de una sección/subsección/grupo/subgrupo, se calculan como la
    unión de todas las palabras claves de los elementos que contiene, sin incluir palabras repetidas.
    */

    public ArrayList<String> getPalabrasClaves(){
        ArrayList<String> resultado=new ArrayList<>();
        for(ElementoNoticia e:elementos){
            ArrayList<String> auxiliar= e.getPalabrasClaves();
            for (String s:auxiliar){
                if (!resultado.contains(s))
                    resultado.add(s);
            }
        }
        return resultado;
    }

    public ArrayList<Noticia> buscar(Filtro filtro){
        ArrayList<Noticia> resultado = new ArrayList<>();
        for (ElementoNoticia e:elementos){
            resultado.addAll(e.buscar(filtro));
        }
    return resultado;
    }




}
