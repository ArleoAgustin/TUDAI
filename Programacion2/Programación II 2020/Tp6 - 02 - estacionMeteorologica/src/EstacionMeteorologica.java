import java.util.ArrayList;

public abstract class EstacionMeteorologica {
	
	protected String nombre;
	protected ArrayList<Double> temperatura; 
	protected ArrayList<Double> humedad;
	protected ArrayList<Double> velocidadDelViento;
	protected ArrayList<Double> lluviaRegistradaPorHora;
	
	public EstacionMeteorologica(String nombre) {
		this.nombre = nombre;
		temperatura = new  ArrayList<Double>();
		humedad = new  ArrayList<Double>();
		velocidadDelViento = new  ArrayList<Double>();
		lluviaRegistradaPorHora = new  ArrayList<Double>();
	}
	
	public abstract boolean predecirPrecipitaciones();
	
	protected boolean calcularPromedio(ArrayList<Double> array,int cantResgistro,double maxValor) {
		double aux = 0;
		for (int i = array.size()-1; i > (array.size()-cantResgistro); i--) {
			aux += array.get(i); 
		}
		return ((aux/cantResgistro) < maxValor);
	}
	
	protected boolean foundMAxValor(ArrayList<Double> array,int cantResgistro,int maxValor) { 
		for (int i = array.size()-1; i >= array.size()-cantResgistro; i--) {
			if (array.get(i) >= maxValor) {
				return true;  
			} 
		}
		return false;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString() {
		return "estación meteorológica de la ciudad de  "+nombre+" ";
	}
	
	
}
