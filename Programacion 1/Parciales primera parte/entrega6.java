/* Hacer un programa que mientras el usuario ingrese dos caracteres letra (en cada iteracion se pide ingresar dos caracteres)
   realice lo siguiente:
 	·cuente la cantidad de veces en que ambos caracteres son vocal minuscula a la vez o vocal mayuscula (al mismo tiempo),
  	·si no se cumple lo anterior, solicite ingresar un numero entero y si es natural imprima la tabla de multiplicar del numero ingresado.
    Finalmente cuando sale de la iteracion imprima por pantalla la cantidad que fue acumulando.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class entrega6 {
	
//---------------------- PROGRAMA PRINCIPAL -----------------------------------//
	
	
	public static void main(String[] args) {
	
		procedimiento ();
	}
	
	

//---------------------------------------------- METODOS: ------------------------------------------------//
	
	
	
	//FUNCION CARGAR CARACTER
	
		public static char cargar_caracter () {
				
			char caracter = '*';
					
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
					
			try {
				System.out.println ("Ingrese un caracter ");
				caracter = entrada.readLine().charAt(0);
					
			}
			catch(Exception exc) {
				System.out.println (exc);
						
			}
					
			return (caracter);
				
		}
		
		
		
		//FUNCION CARGAR VALOR
		
	public static int cargar_valor () {
						
		int valor = 0;
						
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
						
		try {
			System.out.println ("Ingrese un valor entero: ");
			valor = Integer.valueOf(entrada.readLine());
		}
		catch(Exception exc) {
		System.out.println (exc);
							
		}
	return (valor);
	}
	
	
	public static boolean es_vocal (char caracter1, char caracter2) {
		boolean vocal;
		vocal = false;
		
		switch (caracter1) {
			case ('a'): case ('e'): case('i'): case('o'): case('u'): 
				switch (caracter2) {
					case ('a'): case ('e'): case('i'): case('o'): case('u'):
						vocal = true;	
				break;
				}
		break;
		}
				switch (caracter1) {
					case('A'): case('E'): case('I'): case('O'): case('U'):
					switch (caracter2) {
						case('A'): case('E'): case('I'): case('O'): case('U') :
							vocal = true;
					break;
					}
				break;
				}
		
		
		return(vocal);
	}
	
//PROCEDIMIENTO 
	
	public static void procedimiento () {
		
		
		int contador = 0;
		int valor;
		System.out.println("Ingrese dos caracteres letra:");
		char caracter1 = cargar_caracter();
		char caracter2 = cargar_caracter();
		boolean vocal;
		while (((caracter1 > '9') && (caracter2 > '9')) && ((caracter1 != '*') && (caracter2 != '*'))) {
				vocal = es_vocal(caracter1, caracter2);
				if (vocal == true) {
					contador++;
				}
				else {
					valor = cargar_valor();
					tabla_de_multiplicar (valor);
				}
			System.out.println("Ingrese dos caracteres letra:");
			caracter1 = cargar_caracter();
			caracter2 = cargar_caracter();
		
		}
		System.out.println("Fueron vocal minuscula o mayuscula: " + contador + " veces");
		
	}
	
	
	
	
	//TABLA DE MULTIPLICAR 
	
		public static void tabla_de_multiplicar (int valor) {
			int MINMULTI = 1;
			int MAXMULTI = 10;

			for (int multi = MINMULTI; multi <= MAXMULTI; multi++) {
				System.out.println(valor + " x " + multi + " = " + (valor * multi));
			}
		}
}