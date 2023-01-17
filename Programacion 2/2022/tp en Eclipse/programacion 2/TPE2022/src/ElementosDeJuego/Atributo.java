package ElementosDeJuego;

import java.util.Random;

public class Atributo implements Comparable<Atributo>{
	
	private String nombreAtributo;
	private int poderAtributo;
	private final int valorMaxAtributo = 99;
	private final int valorMinAtributo = 1;
	
	public Atributo() {}

	public Atributo(String nombreAtributo) {
	
		this.nombreAtributo = nombreAtributo;
		this.setPoderAtributo();
		
	}
	
//enfrenta los atributos	
	
	public int enfrentarAtributo(Atributo a2) {
		
		Atributo a1 = this;
		return a1.compareTo(a2);
	}
	

	public String getNombreAtributo() {
		return nombreAtributo;
	}

	public void setNombreAtributo(String nombreAtributo) {
		this.nombreAtributo = nombreAtributo;
	}

	public int getPoderAtributo() {
		return poderAtributo;
	}

	public void setPoderAtributo() {
		this.poderAtributo = generarValor();
	}
	
//se genera un valor random asi luego se le asigna a el atributo	
	
	public int generarValor() {
		
		Random r = new Random();
		int valor = this.valorMinAtributo + r.nextInt(this.valorMaxAtributo);
		return valor;
	}

	@Override
	public int compareTo(Atributo a2) {
		return (int) (this.getPoderAtributo() - a2.getPoderAtributo() );
	}
	
}
