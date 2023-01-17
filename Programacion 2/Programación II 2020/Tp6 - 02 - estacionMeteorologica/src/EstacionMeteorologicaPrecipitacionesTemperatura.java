
public class EstacionMeteorologicaPrecipitacionesTemperatura extends EstacionMeteorologica{
	private int maxRegistroPrecipitaciones;
	private double promedioPrecipitaciones;
	private int maxRegistroTemperatura;
	private int maxTemperatura;
	
	public EstacionMeteorologicaPrecipitacionesTemperatura(String nombre, int maxRegistroPrecipitaciones, int maxPrecipitaciones, int maxRegistroTemperatura, int maxTemperatura) {
		super(nombre);
		this.maxRegistroPrecipitaciones = maxRegistroPrecipitaciones;
		this.promedioPrecipitaciones = maxPrecipitaciones;
		this.maxRegistroTemperatura = maxRegistroTemperatura;
		this.maxTemperatura = maxTemperatura;
	}
	
	public boolean predecirPrecipitaciones() {
		return (super.calcularPromedio(lluviaRegistradaPorHora, maxRegistroPrecipitaciones, promedioPrecipitaciones)) &&
				super.foundMAxValor(temperatura, maxRegistroTemperatura, maxTemperatura);
	}

	public String toString() {
		return super.toString()
				+ " predice si lluve si:"
				+ " \n 	· premdio de los últimos "
				+ maxRegistroPrecipitaciones + " registros de precipitaciones no supera "
				+ promedioPrecipitaciones+"mm"
				+ "\n	· La temperatura máxima de los últimos "
				+ maxRegistroTemperatura + " registros no supera los "
				+ maxTemperatura + " Cº";
	}
	
	public int getMaxRegistroPrecipitaciones() {
		return maxRegistroPrecipitaciones;
	}

	public void setMaxRegistroPrecipitaciones(int maxRegistroPrecipitaciones) {
		this.maxRegistroPrecipitaciones = maxRegistroPrecipitaciones;
	}

	public double getPromedioPrecipitaciones() {
		return promedioPrecipitaciones;
	}

	public void setPromedioPrecipitaciones(double promedioPrecipitaciones) {
		this.promedioPrecipitaciones = promedioPrecipitaciones;
	}

	public int getMaxRegistroTemperatura() {
		return maxRegistroTemperatura;
	}

	public void setMaxRegistroTemperatura(int maxRegistroTemperatura) {
		this.maxRegistroTemperatura = maxRegistroTemperatura;
	}

	public int getMaxTemperatura() {
		return maxTemperatura;
	}

	public void setMaxTemperatura(int maxTemperatura) {
		this.maxTemperatura = maxTemperatura;
	}
}
