
public class Electrodomestico {
	
	private String nombre;
	private double precio;
	private String color;
	private double consumoEnergetico;
	private double peso;
	
	public boolean nivelConsumo (){
		if (consumoEnergetico >= 45){
			return false;
		} else {
			return true;
		}
	}
	
	public double calcularBalance (){
		return (precio/peso);
	} 
	
	public boolean esAltaGama (){
		if (calcularBalance() <= 3){
			return false;
		} else {
			return true;
		}
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getConsumoRnergético() {
		return consumoEnergetico;
	}
	public void setConsumoRnergético(double consumoRnergético) {
		this.consumoEnergetico = consumoRnergético;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}

}
  
  
