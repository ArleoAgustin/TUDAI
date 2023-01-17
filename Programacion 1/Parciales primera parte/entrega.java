/*
    Hacer un programa que mientras el usuario ingrese un caracter letra mayuscula realice lo siguiente:
    _si el caracter no es vocal ingresar un numero entero e imprima la tabla de multiplicar del numero ingresado,
    _pida ingresar otro numero entero y si es impar imprima la tabla de multiplicar del numero ingresado,
    _cuente cuantas veces el caracter ingresado fue letra mayuscula.
    Finalmente cuando sale de la iteracion imprima por pantalla la cantidad de letras mayusculas.
    */


import java.io.BufferedReader;
import java.io.InputStreamReader;
public class entrega {
	
//---------------------- PROGRAMA PRINCIPAL -----------------------------------//
	
	
	public static void main(String[] args) {
		
		char caracter;
		
		caracter = cargar_caracter();
		procedimiento (caracter);
	}
	
	
	

//---------------------------------------------- METODOS: ------------------------------------------------//
	
	

//FUNCION CARGAR LETRA 
	
	public static char cargar_caracter () {
	
		char caracter = '*';
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println ("Ingrese una letra mayuscula ");
			caracter = entrada.readLine().charAt(0);
			
		}
		catch(Exception exc) {
			System.out.println (exc);
			
		}
		
		return (caracter);
	
	}
	

// FUNCION QUE CARGA UN VALOR ENTERO	
	
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
		case('A'): case('E'): case('I'): case('O'): case('U'):
			vocal = true;
		break;
		}
		return (vocal);
	}
	
	
	
	
	public static void procedimiento (char caracter) {
		
		int valor;
		int contador = 0;
		
		while ((caracter >= 'A') && (caracter <= 'Z' )) {
			contador = contador +1;
			boolean vocal = es_vocal(caracter);	
			if (vocal == false) {
			
				valor = cargar_valor();
				tabla_de_multiplicar(valor);
				valor = cargar_valor();
				if (valor % 2 != 0) {
					tabla_de_multiplicar(valor);
				}
			}
			
			System.out.println();
			System.out.println("Para salir ingrese un caracter <> de letra mayuscula");
			caracter = cargar_caracter();
		}
		System.out.println("Fue letra mayuscula: " + contador + " veces");
	}
	

	
	
		
//PROCEDIMIENTO: TABLA DE MULTIPLICAR
	
	public static void tabla_de_multiplicar (int valor) {
		int MINMULTI = 1;
		int MAXMULTI = 10;

		for (int multi = MINMULTI; multi <= MAXMULTI; multi++) {
			System.out.println(valor + " x " + multi + " = " + (valor * multi));
		}
	}
	
	
}