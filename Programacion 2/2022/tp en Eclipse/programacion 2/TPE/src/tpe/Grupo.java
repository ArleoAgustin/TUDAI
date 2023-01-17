package tpe;

import java.util.ArrayList;

public class Grupo extends Elemento {

	private ArrayList<Elemento> elementos;

    public Grupo(String nombre){
        super(nombre);
        elementos=new ArrayList<>();
    }

    public int getCantAlumnos(){
        int cant=0;
        for (Elemento e:elementos){
            cant += e.getCantAlumnos();
        }
        return cant;
    }

    public void addElemento(Elemento nuevo){
        this.elementos.add(nuevo);

    }


}
