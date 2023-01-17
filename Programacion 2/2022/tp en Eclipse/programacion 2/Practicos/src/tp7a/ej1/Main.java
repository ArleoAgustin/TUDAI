package tp7a.ej1;

import tp7a.ej1.comportamiento.ComportamientoPermiteTodo;
import tp7a.ej1.condicion.Condicion;
import tp7a.ej1.condicion.CondicionAnd;
import tp7a.ej1.condicion.CondicionTrataCultivo;
import tp7a.ej1.condicion.CondicionTrataEnfermedad;

public class Main {

	public static void main(String[] args) {
		
		EmpresaAgricola arleoSA = new EmpresaAgricola();

		Producto p1 = new Producto("MataBicho");
		Producto p2 = new Producto("Insecticida");
		
		Enfermedad e1 = new Enfermedad("Chinchilla");
		
		Cultivo cultivo1 = new Cultivo("Maiz");
		Cultivo cultivo2 = new Cultivo("Girasol");
		Cultivo cultivo3 = new Cultivo("Alfalfa");
		Cultivo cultivo4 = new Cultivo("Soja");
		Cultivo cultivo5 = new Cultivo("Trigo");
		
		p1.addCultivosDondeNoUsar(cultivo1);
		p1.addCultivosDondeNoUsar(cultivo4);
		
		p2.addCultivosDondeNoUsar(cultivo5);
		p2.addCultivosDondeNoUsar(cultivo1);
		
		p2.addPatologias("Hojas amarillas");
		p2.addPatologias("Hojas blancas");
		p2.addPatologias("Hojas mordidas");
		
		p1.addPatologias("Hojas amarillas");
		p1.addPatologias("Hojas mordidas");
		p1.addPatologias("Caida de hojas");
		
		arleoSA.addAgroquimicos(p1);
		arleoSA.addAgroquimicos(p2);
		
		e1.addPatologias("Hojas mordidas");
		e1.addPatologias("Hojas amarillas");
		
		Condicion c1 = new CondicionTrataEnfermedad(e1);
		
		Condicion and = new CondicionAnd(c1,new CondicionTrataCultivo(cultivo5));
	/*	
		System.out.println(arleoSA.ProductosFiltrados(c1));
		System.out.println("");
		System.out.println("Trata con chinchilla y puede usarse en la soja");
		System.out.println("");
		System.out.println(arleoSA.ProductosFiltrados(and));
		*/
		
		System.out.println(cultivo1.esPermitido(p2));
		cultivo1.setComportamiento(new ComportamientoPermiteTodo());
		System.out.println(cultivo1.esPermitido(p2));
	}

}
