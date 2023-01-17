/*Realizar un programa que mientras el usuario ingrese un caracter letra minuscula o digito realice lo siguiente:
    _si el caracter es vocal calcule la productoria de los primeros 15 numeros naturales e imprima el resultado por pantalla,
    _si no es vocal solicite ingresar un numero entero e imprima la tabla de multiplicar del numero ingresado,
    _cuente cuantas veces el caracter fue letra minuscula y por otro lado cuantas veces el caracter fue digito.
    Finalmente cuando sale de la iteracion imprima por pantalla ambas cantidades por separado.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class entrega10 {
	
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
			case('a'): case('e'): case('i'): case('o'): case('u'): 
				vocal = true;
		break;
		}
		return (vocal);
	}
	
	
	
	public static void procedimiento (char caracter) {
		int valor, cont1, cont2;
		cont1 = 0;
		cont2 = 0;
		boolean vocal;
		
		while (((caracter >= 'a') && (caracter <= 'z')) || ((caracter >= '0') && (caracter <= '9'))) {
			vocal = es_vocal (caracter);
			if ((caracter >= 'a') && (caracter <= 'z')) {
				cont1 = cont1 +1;
			}
		
			if ((caracter >= '0') && (caracter <= '9')) {
				cont2 = cont2 +1;
			}
		
			if (vocal == true) {
				valor = 15;
				productoria(valor);
			}
			
			else {
				valor = cargar_valor();
				tabla_de_multiplicar (valor);
			}
			System.out.println ();
			System.out.println ("Para salir ingrese un caracter <> de letra minuscula o digito");
		caracter = cargar_caracter();	
		}
		System.out.println ("La cantidad de letras minusculas fue: " + cont1);
		System.out.println ("La cantidad de digitos fue: " + cont2);
	}
	
	
	//CALCULAR PRODUCTORIA 
	
		public static void productoria (int valor) {
			
			int resultado = 1;
			for (int min = 1; min <= valor; min++) {
				resultado = resultado * min;
			}
			System.out.println("La productoria de los primero 18 nros naturales es: " + resultado);
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