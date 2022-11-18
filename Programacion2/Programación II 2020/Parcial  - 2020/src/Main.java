import java.time.LocalDate;


public class Main {

	public static void main(String[] args) {
		
		// no tengo tiempo a implemetar el filtro menor, el filtro menor es un filtro not y uno mayor, unidos con uno and
		
		LugarParaCochera lpc0 =  new LugarParaCochera();
		LugarParaCochera lpc1 =  new LugarParaCochera();
		LugarParaCochera lpc2 =  new LugarParaCochera();
		LugarParaCochera lpc3 =  new LugarParaCochera();
		LugarParaCochera lpc4 =  new LugarParaCochera();
		LugarParaCochera lpc5 =  new LugarParaCochera();
		
		Caracteristica c0 = new Caracteristica("Puertas", 3);
		Caracteristica c1 = new Caracteristica("Seguridad", "24 hs");
		Caracteristica c2 = new Caracteristica("Descapotable", true);
		Caracteristica c3 = new Caracteristica("Lindo", false);
		Caracteristica c4 = new Caracteristica("Llantas de aleacion", false);
		Caracteristica c5 = new Caracteristica("Zapato", LocalDate.now());
		
		Filtro f0 =  new FiltroPorModeloDeAutoMayor(2005);
		Filtro f1 =  new FiltroNot(f0);
		Filtro f2 =  new FiltroPorMarca("Ford");
		Filtro f3 =  new FiltroPorCaracteristica(c0);
		Filtro f4 =  new FiltroPorCaracteristica(c1);
		Filtro f5 =  new FiltroPorCaracteristica(c3);
		
		
		Cochera co0 = new Cochera(f0);
		Cochera co1 = new Cochera(f1);
		Cochera co2 = new Cochera(f2);
		Cochera co3 = new Cochera(f4);
		
		lpc0.addEstacionamiebnto(lpc1);
		lpc0.addEstacionamiebnto(lpc2);
		lpc1.addEstacionamiebnto(lpc3);
		lpc2.addEstacionamiebnto(lpc4);
		lpc4.addEstacionamiebnto(lpc5);
		

		lpc3.addEstacionamiebnto(co0);
		lpc4.addEstacionamiebnto(co1);
		lpc5.addEstacionamiebnto(co2);
		lpc5.addEstacionamiebnto(co3);
		
		Automovil a0 = new Automovil("auto 1", 2010);
		Automovil a1 = new Automovil("auto 2", 2005);
		Automovil a2 = new Automovil("auto 3", 2050);
		Automovil a3 = new Automovil("auto 4", 2000);
		Automovil a4 = new Automovil("auto 5", 2003);
		Automovil a5 = new Automovil("Ford", 1905);
		
		a0.addCaracteristica(c0);
		a1.addCaracteristica(c1);
		a2.addCaracteristica(c2);
		a3.addCaracteristica(c3);
		a4.addCaracteristica(c4);
		a5.addCaracteristica(c5);
		
		co3.addEstacionamiebnto(a1);
		
		System.out.println();
		System.out.println("Cantidad de cocheras: "+lpc0.cantidadDeCocheras());
		System.out.println("Coccheras filtradas para auto 1 - 2010: "+lpc0.buscarCocheras(a1));
		System.out.println("Coccheras filtradas para auto 1 - 2010: "+lpc0.copiarEstacionamiento(f4));
	}

}
