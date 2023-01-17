
public class EstacionMeteorologicaVientoLluviaTemperatura extends EstacionMeteorologica{
	private int ultimoRegistroViento;
	private int ultimoRegistroLluvia;
	private int maxRegistroHumedad;
	private Double maxHumedadPromedio;
	
	public EstacionMeteorologicaVientoLluviaTemperatura(String nombre, int ultimoRegistroViento, int ultimoRegistroLluvia, int maxRegistroHumedad, Double maxHumedadPromedio) {
		super(nombre);
		this.ultimoRegistroViento = ultimoRegistroViento;
		this.ultimoRegistroLluvia = ultimoRegistroLluvia;
		this.maxRegistroHumedad = maxRegistroHumedad;
		this.maxHumedadPromedio = maxHumedadPromedio;
	}
	
	public boolean predecirPrecipitaciones() {
		return  super.calcularPromedio(humedad, maxRegistroHumedad, maxHumedadPromedio) && 
				super.foundMAxValor(velocidadDelViento, 1, ultimoRegistroViento) && 
				super.foundMAxValor(lluviaRegistradaPorHora, 1, ultimoRegistroLluvia);
	}

	public String toString() {
		return super.toString()
				+ " predice si lluve si:"
				+ " \n 	· promedio de los últimos "
				+ maxRegistroHumedad + " registros de humedad no supera "
				+ maxHumedadPromedio+"%"
				+ "\n	· El último registro de viento del último es mayor a "
				+ maxRegistroHumedad+"K/h"
				+ "\n	· El último registro de lluvia del último no es mayor a "
				+ ultimoRegistroLluvia + "mm";
	}
	
	public int getUltimoRegistroViento() {
		return ultimoRegistroViento;
	}

	public void setUltimoRegistroViento(int ultimoRegistroViento) {
		this.ultimoRegistroViento = ultimoRegistroViento;
	}

	public int getUltimoRegistroLluvia() {
		return ultimoRegistroLluvia;
	}

	public void setUltimoRegistroLluvia(int ultimoRegistroLluvia) {
		this.ultimoRegistroLluvia = ultimoRegistroLluvia;
	}

	public int getMaxRegistroHumedad() {
		return maxRegistroHumedad;
	}

	public void setMaxRegistroHumedad(int maxRegistroHumedad) {
		this.maxRegistroHumedad = maxRegistroHumedad;
	}

	public Double getMaxHumedadPromedio() {
		return maxHumedadPromedio;
	}

	public void setMaxHumedadPromedio(Double maxHumedadPromedio) {
		this.maxHumedadPromedio = maxHumedadPromedio;
	}
}
