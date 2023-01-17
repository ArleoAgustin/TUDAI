package ElementosDeJuego;

import java.util.ArrayList;

import Filtros.Filtro;

public class Carta{
	
	private String nombre;
	private ArrayList<Atributo> atributos = new ArrayList<Atributo>();
	private int maxCantAtributos;
	private int minCantAtributos;
	
//en caso de que el usuario no quiera cargar la cantidad de atributos por carta, estos se setean automaticamente
	
	public Carta(String nombre, ArrayList<Atributo> listaAtributos) {
		
		this.minCantAtributos = 3;
		this.maxCantAtributos = 5;
		this.nombre = nombre;
		if(this.maxCantAtributos <= listaAtributos.size() && listaAtributos.size() >= this.minCantAtributos) 
			cargarAtributos(listaAtributos);
		else
			System.out.println("No se pudieron agregar los atributos");
	}
	
	
//constructor para cuando se setean la cantidad de atributos
	
	public Carta(String nombre, ArrayList<Atributo> listaAtributos, int cantAtributos) {
		
		this.minCantAtributos = 1;
		this.maxCantAtributos = cantAtributos;
		this.nombre = nombre;
		if(this.maxCantAtributos <= listaAtributos.size() && listaAtributos.size() >= this.minCantAtributos) {
			cargarAtributos(listaAtributos);
		}
		else
			System.out.println("La cantidad de atributos ingresada supero el maximo del sistema");
	}

//procedimiento que agrega los atributos
	
	public void cargarAtributos(ArrayList<Atributo> listaAtributos) {
		
		if(this.maxCantAtributos <= listaAtributos.size() && listaAtributos.size() >= this.minCantAtributos) {
			
			for(int i=0; i<this.maxCantAtributos;i++) {
				aniadirAtributos(listaAtributos.get(i));
			}
		}
		else
			System.out.println("No se pudieron agregar los atributos a la carta");
	}

	public String getNombre() {
		return nombre;
	}

	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public ArrayList<Atributo> getAtributos() {
		
		ArrayList<Atributo> at = this.atributos;
		return at;
	}


//se aniaden los atributos
	
	public void aniadirAtributos(Atributo a1) {
		
		if(!esta(a1))
			this.atributos.add(a1);
		else
			System.out.println("El atributo "+a1.getNombreAtributo()+" ya existe");
	}
	
//verifica si ese atributo ya existe en la carta
	
	public boolean esta(Atributo a) {
		
		ArrayList<Atributo> a2 = this.getAtributos();
			for(int i=0; i<a2.size();i++) {
				if(a2.get(i).getNombreAtributo().equals(a.getNombreAtributo())) {
					return true;
				}
			}
		
		return false;
	}
	
//determina la cantidad de atributos en la carta
	
	public int cantidadAtributos() {
		
		if(atributos.size() > 0) {
			return atributos.size();
		}
		else
			return 0;
	}
	
//Encuentra un determinado atributo

	public Atributo encontrarAtributo(String nombre) {
		for (Atributo atributo : atributos) {
			if(atributo.getNombreAtributo().equals(nombre)) {
				return atributo;
			}
		}
		return null;
	}
	
	
//se enfrentan las cartas
	
	public int enfrentarCartas(Carta c, String nombre) {

		Atributo a1 = this.encontrarAtributo(nombre);
		Atributo a2 = c.encontrarAtributo(nombre);
		
		return a1.enfrentarAtributo(a2);
	}
	
//filtro de busqueda simple
	
    public ArrayList<Carta> cumpleBusqueda(Filtro f, String nombreAtributo) {
    	
    	ArrayList<Carta> carta = new ArrayList<>();
        for(Atributo a: this.getAtributos()) {
        	if(a.getNombreAtributo().equals(nombreAtributo)) {
        		if(f.cumple(a))
        			carta.add(this);
        	}  
        }
        return carta;
        
    }
  
//filtro de busqueda con dos atributos
    
    public ArrayList<Carta> cumpleBusquedaCompuesta(Filtro f, String nombreAtributo1, String nombreAtributo2){
    	
    	ArrayList<Carta> carta = new ArrayList<>();
    	Atributo a1 = new Atributo();
    	Atributo a2 = new Atributo();
    	
    	for(Atributo a: this.getAtributos()) {
    		if(a.getNombreAtributo().equals(nombreAtributo1)) 
    			a1 = a;
    		
    		if(a.getNombreAtributo().equals(nombreAtributo2)) 
    			a2 = a;
    		
    	}
    	
    	if(f.cumpleCompuesto(a1, a2) && a1.getNombreAtributo()!=null && a2.getNombreAtributo()!=null)
			carta.add(this);
    	
    	return carta;
    }

}