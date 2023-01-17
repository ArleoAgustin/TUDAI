/*  Hacer un programa que mientras el usuario ingrese un caracter distinto de '*' realice lo siguiente:
    _pida ingresar otro caracter,
    _cuente cuantas veces el nuevo caracter fue letra mayuscula y aparte cuantas veces fue digito,
    _si el nuevo caracter ingresado es vocal calcule la productoria de los primeros 18 numeros naturales e imprima el resultado por pantalla,
    _si el nuevo caracter no es vocal solicite ingresar un numero entero e imprima la tabla de multiplicar del numero ingresado.
    Finalmente cuando sale de la iteracion imprima por pantalla ambas cantidades (mayusculas y digitos) por separado.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class entrega5 {
	
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
		
	
	public static boolean es_vocal ( char caracter) {
		
		boolean vocal = false;
		
		switch (caracter) {
		case ('a'): case ('e'): case('i'): case('o'): case('u'): case('A'): case('E'): case('I'): case('O'): case('U') :
			vocal = true;
		break;
		}
		return (vocal);
	}
	
	
	
	public static void procedimiento () {
		
		char caracter = cargar_caracter();
		int contador1, contador2;
		contador1 = 0;
		contador2 = 0;
		int valor;
		boolean vocal;
		
		while (caracter != '*') {
			
			caracter = cargar_caracter();
			vocal = es_vocal(caracter);
			
			if ((caracter >= 'A') && (caracter <= 'Z')) {
				contador1 = contador1 +1;
			}
			
			if ((caracter >= '0') && (caracter <= '9')) {
				contador2 = contador2 +1;
			}
			
			if (vocal == true) {
					productoria();
			}
			
			else if (vocal == false) {
				valor = cargar_valor();
				tabla_de_multiplicar (valor);
			}
			
			System.out.println();
			System.out.println("Para salir ingrese '*' ");
			caracter = cargar_caracter();
			System.out.println();
		}
		System.out.println("Fue digito: " + contador2);
		System.out.println("fue mayuscula: " + contador1);
		
	}
	

//CALCULAR PRODUCTORIA 
	
	public static void productoria () {
		
		int resultado = 1;
		for (int min = 1; min <= 18; min++) {
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