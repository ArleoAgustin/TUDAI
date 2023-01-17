/* Realizar un programa que mientras el usuario ingrese un numero natural realice lo siguiente:
    _cuente cuantas veces el numero fue mayor que 20,
    _pida ingresar un caracter,
    _si el caracter es vocal ingresar un numero entero e imprima la tabla de multiplicar del numero ingresado si es impar,
    _pida ingresar otro numero entero y si es multiplo de 5 imprima la tabla de multiplicar del numero ingresado.
    Finalmente cuando sale de la iteracion imprima por pantalla la cantidad de veces que el numero ingresado fue mayor que 20.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class entrega7 {
	
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
	
//PROCEDIMIENTO
	
	public static void procedimiento () {
		
		int valor = cargar_valor();
		int contador = 0;
		char caracter;
		while (valor >= 0) {
			if (valor > 20) {
				contador = contador +1;
			}
			
			caracter = cargar_caracter ();
			
			switch (caracter) {
				case ('a') : 
				case('e'):
				case ('i'):
				case('o'):
				case('u'):
				case ('A') : 
				case('E'):
				case ('I'):
				case('O'):
				case('U'):
					
					valor = cargar_valor();
					if (valor % 2 != 0) {
						tabla_de_multiplicar (valor);
					}
					
					valor = cargar_valor();
					if (valor % 5 == 0) {
						tabla_de_multiplicar (valor);
					}
				System.out.println("VOCAL");
			
			break;
			}
			System.out.println("Para salir ingrese un numero negativo");
			valor = cargar_valor();
		}
		System.out.println("El valor ingresado fue mayor a 20 " + contador + " veces");
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