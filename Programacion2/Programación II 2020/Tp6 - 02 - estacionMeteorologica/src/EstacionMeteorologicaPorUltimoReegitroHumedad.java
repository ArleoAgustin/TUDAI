
public class EstacionMeteorologicaPorUltimoReegitroHumedad extends EstacionMeteorologica{
	private int ultimoRegistroHumedad;;
	
	public EstacionMeteorologicaPorUltimoReegitroHumedad(String nombre, int ultimoRegistroHumedad) {
		super(nombre);
		this.ultimoRegistroHumedad = ultimoRegistroHumedad;
	}
	
	
	public String toString() {
		return super.toString()
				+ " predice si lluve si:"
				+ "\n	· El último registro de humedad no es mayor al "
				+ ultimoRegistroHumedad + "%";
	}
	public boolean predecirPrecipitaciones() {
		return super.calcularPromedio(humedad, 1, ultimoRegistroHumedad);
	}

	public int getMaxRegistroPrecipitaciones() {
		return ultimoRegistroHumedad;
	}

	public void setMaxRegistroPrecipitaciones(int maxRegistroPrecipitaciones) {
		this.ultimoRegistroHumedad = maxRegistroPrecipitaciones;
	}
}

