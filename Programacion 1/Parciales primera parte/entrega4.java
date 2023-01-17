/*	Hacer un programa que mientras el usuario ingrese un caracter distinto de '9' realice lo siguiente:
    ·pida ingresar dos caracteres,
    ·cuente la cantidad de veces en que ambos caracteres son digitos,
    ·si ambos nuevos caracteres no son digitos solicite ingresar un numero entero y si es natural menor que 10 imprima la tabla de multiplicar del numero ingresado.
    Finalmente cuando sale de la iteracion imprima por pantalla la cantidad acumulada.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class entrega4 {
	
//---------------------- PROGRAMA PRINCIPAL -----------------------------------//
	
	
	public static void main(String[] args) {
	
		contar_e_imprimirTabla ();
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
		
			
			
	public static void contar_e_imprimirTabla () {
			
		char caracter = cargar_caracter();
		char caracter2;
		int contador = 0;
		int valor;
		
		while (caracter != '9') {
			System.out.println ();
			System.out.println ("Ingrese 2 caracteres: ");
			caracter = cargar_caracter();
			caracter2 = cargar_caracter();
			if (((caracter >= '0') && (caracter <= '9')) && ((caracter2 >= '0') && (caracter2 <= '9'))) {
				contador = contador +1;
			}
			else if ((caracter > '9') && (caracter2 > '9')) {
				valor = cargar_valor();
				
				if ((valor >= 0) && (valor < 10)) {
					tabla_de_multiplicar(valor);
				}
			}
			System.out.println ("Para salir ingrese '9' ");
			caracter = cargar_caracter();
		}
		System.out.println ("Ambos caracteres fueron digitos: " +contador + " veces");
		
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
			