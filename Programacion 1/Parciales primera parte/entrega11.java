/*Realizar un programa que mientras el usuario ingrese un caracter vocal mayuscula realice lo siguiente:
    _cuente cuantas veces el caracter ingresado fue 'A' o 'E',
    _pida ingresar otro caracter,
    _si el nuevo caracter es digito calcular el promedio acumulado entre 0 y 100 e imprima el resultado por pantalla,
    _si el nuevo caracter no es digito solicite ingresar un numero entero y si es multiplo de 10 imprima por pantalla la tabla de multiplicar del numero ingresado.
    Finalmente cuando sale de la iteracion imprima por pantalla la cantidad de 'A' o 'E'.     
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class entrega11 {
	
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
	
//PROCEDIMIENTO
	
	public static void procedimiento (char caracter) {
		
		int cont1, cont2, valor;
		cont1 = 0;
		cont2 = 0;
		
		while ((caracter >= 'A') && (caracter <= 'Z')) {
			
			if (caracter == 'A') {
				cont1 = cont1 +1;
			}
			
			if (caracter == 'E') {
				cont2 = cont2 +1;
			}
			
			caracter = cargar_caracter();
			if ((caracter >= '0') && (caracter <= '9')) {
				promedio();
			}
			else {
				valor = cargar_valor();
				if (valor % 10 == 0) {
				tabla_de_multiplicar (valor);
				}
			}
			System.out.println("Para salir ingrese un caracter <> de letra MAYUSCULA");
			caracter = cargar_caracter();
		}
		System.out.println("El numero de veces que se ingreso la letra 'A' es: " + cont1);
		System.out.println("El numero de veces que se ingreso la letra 'E' es: " + cont2);
	}
	
	
//PROMEDIO
	
	public static void promedio () {
		
		int valor1 = 0;
		int valor2 = 100;
		int resultado; 
		resultado = ((valor1 + valor2) / 2);
		System.out.println("El promedio entre 0 y 100 es: " + resultado);
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