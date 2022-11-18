
public class Main {
	public static void main(String[] args) {
		EstacionMeteorologica e1 = new EstacionMeteorologicaPrecipitacionesTemperatura("Tandil", 8, 110, 12, 25);
		EstacionMeteorologica e2 = new EstacionMeteorologicaPorUltimoReegitroHumedad("María Ignacia Vela", 54);
		EstacionMeteorologica e3 = new EstacionMeteorologicaPrecipitacionesTemperatura("Balcarce", 16, 135, 12, 28);
		EstacionMeteorologica e4 = new EstacionMeteorologicaVientoLluviaTemperatura("Bahía Blanca", 35, 29, 9, (double)53);
		EstacionMeteorologica e5 = new EstacionMeteorologicaPorUltimoReegitroHumedad("Azul", 63);
		
		//EstacionMeteorologica e6 = new EstacionMeteorologica("Ejemplo");
		
		llenarArrays(e1);
		llenarArrays(e2);
		llenarArrays(e3);
		llenarArrays(e4);
		llenarArrays(e5);
		
		System.out.println(e1);
		System.out.println("Su prediccion es igual: "+e1.predecirPrecipitaciones());	
		System.out.println(e2);
		System.out.println("Su prediccion es igual: "+e2.predecirPrecipitaciones());	
		System.out.println(e3);
		System.out.println("Su prediccion es igual: "+e3.predecirPrecipitaciones());
		System.out.println(e4);
		System.out.println("Su prediccion es igual: "+e4.predecirPrecipitaciones());
		System.out.println(e5);
		System.out.println("Su prediccion es igual: "+e5.predecirPrecipitaciones());
	}
	
	public static void llenarArrays(EstacionMeteorologica e) {
		e.lluviaRegistradaPorHora.add(20.0);
		e.lluviaRegistradaPorHora.add(50.0);
		e.lluviaRegistradaPorHora.add(30.0);
		e.lluviaRegistradaPorHora.add(70.0);
		e.lluviaRegistradaPorHora.add(20.0);
		e.lluviaRegistradaPorHora.add(60.0);
		e.lluviaRegistradaPorHora.add(90.0);
		e.lluviaRegistradaPorHora.add(20.0);
		e.lluviaRegistradaPorHora.add(60.0);
		e.lluviaRegistradaPorHora.add(20.0);
		e.lluviaRegistradaPorHora.add(10.0);
		e.lluviaRegistradaPorHora.add(70.0);
		e.lluviaRegistradaPorHora.add(20.0);
		e.lluviaRegistradaPorHora.add(80.0);
		e.lluviaRegistradaPorHora.add(20.0);
		e.lluviaRegistradaPorHora.add(70.0);
		e.humedad.add(32.0);
		e.humedad.add(15.0);
		e.humedad.add(35.0);
		e.humedad.add(44.0);
		e.humedad.add(42.0);
		e.humedad.add(25.0);
		e.humedad.add(19.0);
		e.humedad.add(22.0);
		e.humedad.add(56.0);
		e.humedad.add(60.0);
		e.temperatura.add(24.0);
		e.temperatura.add(25.0);
		e.temperatura.add(22.0);
		e.temperatura.add(21.0);
		e.temperatura.add(20.0);
		e.temperatura.add(21.0);
		e.temperatura.add(22.0);
		e.temperatura.add(19.0);
		e.temperatura.add(12.0);
		e.temperatura.add(26.0);
		e.temperatura.add(17.0);
		e.temperatura.add(12.0);
		e.velocidadDelViento.add(32.0);
		e.velocidadDelViento.add(15.0);
		e.velocidadDelViento.add(35.0);
		e.velocidadDelViento.add(40.0);
		e.velocidadDelViento.add(12.0);
		e.velocidadDelViento.add(15.0);
		e.velocidadDelViento.add(19.0);
		e.velocidadDelViento.add(22.0);
		e.velocidadDelViento.add(66.0);
		e.velocidadDelViento.add(12.0);
	}
}
