/* Realizar un programa que mientras el usuario ingrese un caracter letra minuscula realice lo siguiente:
    _cuente cuantas veces el caracter fue letra vocal,
    _si el caracter no es vocal pida ingresar un numero entero e imprima la tabla de multiplicar del numero ingresado si es multiplo de 5,
    _pida ingresar otro numero entero y si es multiplo de 3 imprima la tabla de multiplicar del numero ingresado.
    Finalmente cuando sale de la iteracion imprima por pantalla la cantidad de vocales.         
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class entrega12 {
	
//---------------------- PROGRAMA PRINCIPAL -----------------------------------//
	
	
	public static void main(String[] args) {
		char caracter;
		
		caracter = cargar_caracter ();
		procedimiento (caracter);
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
	
//FUNCION QUE DETERMINA SI EL CARACTER ES VOCAL O NO
	
	public static boolean es_vocal (char caracter) {
		boolean vocal;
		vocal = false;
		switch (caracter) {
			case('a'): case('e'): case('i'): case('o'): case('u'): 
				vocal = true;
		break;
		}
		return (vocal);
	}
	
	
//PROCEDIMIENTO
	
	public static void procedimiento (char caracter) {
		
		int contador = 0;
		int valor;
		boolean vocal;
		
		while ((caracter >= 'a') && (caracter <= 'z')) {
			
			vocal = es_vocal(caracter);
			if (vocal == true) {
				contador = contador +1;
			}
			else {
				valor = cargar_valor();
				if (valor % 5 == 0) {
					tabla_de_multiplicar (valor);
				}
				valor = cargar_valor();
				if (valor % 3 == 0) {
					tabla_de_multiplicar (valor);
				}
			}
			
			System.out.println();
			System.out.println("Para salir ingrese un caracter <> de letra minuscula");
			caracter = cargar_caracter();
		}
		System.out.println("Fue vocal: " + contador + " veces");
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