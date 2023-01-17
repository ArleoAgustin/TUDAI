package TPE2022;


import TPE2022.Comparadores.ComparadorApellido;
import TPE2022.Comparadores.ComparadorCantAlumnos;
import TPE2022.Comparadores.ComparadorDNI;
import TPE2022.Comparadores.ComparadorInteger;
import TPE2022.Comparadores.ComparadorNombre;
import TPE2022.Comparadores.ComparadorNot;
import TPE2022.Comparadores.ComparadorString;
import TPE2022.ej2.Alumno;
import TPE2022.ej3.Elemento;
import TPE2022.ej3.Grupo;

public class Main {

	public static void main(String[] args) {
		

		
		//------------------------ comparadores simples y compuesto ------------------------------//
		
		ComparadorString ordenarString = new ComparadorString();
		ComparadorInteger ordenarInteger = new ComparadorInteger();
		
		ComparadorDNI ordenarDni = new ComparadorDNI();
		ComparadorNombre ordenarNombre = new ComparadorNombre(ordenarDni);
		ComparadorApellido ordenarCompuesto = new ComparadorApellido(ordenarNombre);
		
		ComparadorCantAlumnos ordenarCantAlumnos = new ComparadorCantAlumnos();
		
		//---------------------- comparadores not ------------------------------------------------//
		
		ComparadorNot<Alumno> compNotAlumno = new ComparadorNot<>(ordenarCompuesto);
		ComparadorNot<Integer> ordenarDescendeteInteger = new ComparadorNot<>(ordenarInteger);
		ComparadorNot<String> ordenarDescendenteString = new ComparadorNot<>(ordenarString);

		ComparadorNot<Elemento> ordenarDescendenteCantAlumnos = new ComparadorNot<>(ordenarCantAlumnos);
		
		//----------------------------- punto 2 --------------------------------------------------//
		
		Alumno a1 = new Alumno("Gonzalo","Gaete",22,41969678);
		Alumno a2 = new Alumno("Lucas","Duana",22,42630319);
		Alumno a3 = new Alumno("Leandro","Pagano",23,41325874);
		Alumno a4 = new Alumno("Gonzalo","Gaete",23,42784650);
		
		a1.addInteres("Animales");			
		a1.addInteres("Programar");			
		a1.addInteres("Carreras");			
		a1.addInteres("Futbol");	
		
		a2.addInteres("Futbol");
		a2.addInteres("Programar");
		
		a3.addInteres("Animales");
		
		a4.addInteres("Tecnologia");
		a4.addInteres("Leer");
		
		
		Lista<Alumno> alumnos = new Lista<>(ordenarCompuesto);	//lista de alumnos
		
		alumnos.add(a1);		
		alumnos.add(a2);
		alumnos.add(a3);
		alumnos.add(a4);
		
/*		
		for(Alumno i: alumnos) {				//itera los alumnos
			System.out.println(i);
		}
*/	
		
		
		
		//------------------------------ punto 4 --------------------------------------------// 
		
// a)
		
		Lista<Integer> listaint = new Lista<>(ordenarInteger);
		
		listaint.add(10);	listaint.add(21);	listaint.add(1);	listaint.add(5);	listaint.add(11);

		
// b)		
		
		for(Integer e: listaint) {
			System.out.print(e +" ");
		}
	 	
		System.out.println(" ");
	

// c)		
		
		listaint.eliminarPorPosicion(0);
		listaint.eliminarOcurrencias(5);
		listaint.eliminarOcurrencias(11);
		
		for(Integer e: listaint) {
			System.out.print(e + " ");
		}
		
		System.out.println(" ");
		System.out.println(" ");

	
// d)
		
		Lista<String> listaString = new Lista<String>(ordenarString);
			
		listaString.add("Facil");	listaString.add("Es");	listaString.add("Parcial");	listaString.add("Prog 2");

// e)
			
		for(String s: listaString) {
			System.out.print(s + " ");
		}
		
			System.out.println(" "); 
			System.out.println(" "); 

// f)			
		System.out.println("''Parcial'' se encuentra en la posicion: "+ listaString.posicionElemento("Parcial"));

// g)
		System.out.println("''Recuperatorio'' se encuentra en la posicion: "+ listaString.posicionElemento("Recuperatorio"));
	

//h)

		System.out.println(" "); 
		
		listaString.setCriterioDeOrden(ordenarDescendenteString);
		
		for(String s: listaString) {
			System.out.print(s + " ");
		}
		

// i)
		System.out.println(" "); 
		System.out.println(" "); 
		
		Alumno alum1 = new Alumno("Agustin","Arleo",22,41969678);
		Alumno alum2 = new Alumno("Lucas","Duana",22,42587741);
		Alumno alum3 = new Alumno("Leandro","Pagano",22,72332741);
		Alumno alum4 = new Alumno("Bautista","Kigan",22,587233741);
		Alumno alum5 = new Alumno("Gonzalo","Gaete",22,4258741);
		Alumno alum6 = new Alumno("Federico","Lopez",22,35999888);
		Alumno alum7 = new Alumno("Juana","Garcia",22,27123455);
		
		Grupo unicen = new Grupo("Unicen");
		Grupo exactas = new Grupo("Exactas");
		Grupo humanas = new Grupo("Humanas");
		Grupo historia = new Grupo("Historia");
	
		unicen.addElemento(exactas);
		unicen.addElemento(humanas);
		unicen.addElemento(alum1);
		
		exactas.addElemento(alum6);
		exactas.addElemento(alum7);
		
		humanas.addElemento(alum2);
		humanas.addElemento(historia);
		
		historia.addElemento(alum3);
		historia.addElemento(alum4);
		historia.addElemento(alum5);
		
		
		
		Grupo olimpiadas = new Grupo("Olimpiadas Matematicas");
		Grupo matea2 = new Grupo("Matea2");
		Grupo losFibo = new Grupo("LosFibo");
		
		Alumno alum8 = new Alumno("Juan","Juarez",25,33222444);
		Alumno alum9 = new Alumno("Julio","Cesar",27,33222111);
		Alumno alum10 = new Alumno("Bernardino","Rivas",22,30987654);
		Alumno alum11 = new Alumno("Jose","Paso",33,33322112);
		Alumno alum12 = new Alumno("Isaac","Newton",20,12343565);
		
		olimpiadas.addElemento(matea2);
		olimpiadas.addElemento(losFibo);
		matea2.addElemento(alum8);
		matea2.addElemento(alum9);
		losFibo.addElemento(alum10);
		losFibo.addElemento(alum11);
		losFibo.addElemento(alum12);
		
		
		Lista<Elemento> estructuras = new Lista<>(ordenarDescendenteCantAlumnos);
		
		estructuras.add(unicen);
		estructuras.add(olimpiadas);
	
		for(Elemento e: estructuras) {
			System.out.println(e.getNombre() + " --> "+ e.getCantAlumnos()+ " alumnos");
		}
	
	
	}

}
