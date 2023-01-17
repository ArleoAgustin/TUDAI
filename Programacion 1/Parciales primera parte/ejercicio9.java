/*Hacer un programa que mientras el usuario ingrese un caracter distinto de '*' realice lo siguiente:
    _pida ingresar un caracter y un numero entero,
    _si el nuevo caracter no es vocal imprima la tabla de multiplicar del numero ingresado,
    _pida ingresar otro numero entero y si es impar imprima la tabla de multiplicar de dicho numero,
    Finalmente cuando sale de la iteracion imprima por pantalla la tabla de multiplicar del numero 5.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ejercicio9 {
	
//---------------------- PROGRAMA PRINCIPAL -----------------------------------//
	
	
	public static void main(String[] args) {
		
		char caracter;
		caracter = cargar_caracter();
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
	
	public static boolean es_vocal (char caracter) {
		boolean vocal;
		vocal = false;
		switch (caracter) {
			case('a'): case('e'): case('i'): case('o'): case('u'): case('A'): case('E'): case('I'): case('O'): case('U'):
				vocal = true;
		}
		
		return(vocal);
	}
	
	
	
	public static void procedimiento (char caracter) {
		
		int valor;
		boolean vocal;
		while (caracter != '*') {
			caracter = cargar_caracter();
			valor = cargar_valor();
			vocal = es_vocal(caracter);
			if (vocal == false) {
				tabla_de_multiplicar (valor);
				valor = cargar_valor();
				if (valor % 2 != 0) {
					tabla_de_multiplicar (valor);
				}
			}
			System.out.println ();
			System.out.println ("Para salir ingrese '*' ");
			caracter = cargar_caracter();
		}
		valor = 5;
		tabla_de_multiplicar (valor);
		
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