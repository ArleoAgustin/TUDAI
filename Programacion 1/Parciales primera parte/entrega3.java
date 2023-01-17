/*	 Realizar un programa que mientras el usuario ingrese dos caracteres digitos (en cada iteracion pide ingresar dos caracteres) 
  	 realice lo siguiente:
    ·cuente cuantas veces ambos caracteres son '0' o '1',
    ·solicite ingresar un numero entero y si es natural menor que 10 imprima la tabla de multiplicar del numero ingresado.
    ·Finalmente cuando sale de la iteracion imprima por pantalla la cantidad de veces que ingreso caracteres '0' o '1'.
*/


import java.io.BufferedReader;
import java.io.InputStreamReader;
public class entrega3 {
	
//---------------------- PROGRAMA PRINCIPAL -----------------------------------//
	
	
	public static void main(String[] args) {
	
		contador_0_1_imprimirTabla();
		
	}
	
	

//---------------------------------------------- METODOS: ------------------------------------------------//
	
	
	//FUNCION CARGAR LETRA 
	
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
		
		
		
// CONTADOR 0 O 1, IMPRIMIR TABLA
		
		public static void contador_0_1_imprimirTabla() {
			System.out.println("Para salir presione '*' ");
			char caracter1 = cargar_caracter();
			char caracter2= cargar_caracter();
			int contador = 0;
			int valor;
			while (caracter1 != '*') {
				if (((caracter1 == '0') && (caracter2 == '0')) || ((caracter1 == '1') && (caracter2 == '1'))) {
					
					contador = contador +1;
				}
				valor = cargar_valor();
				if ((valor >= 0) && (valor < 10)) {
					tabla_de_multiplicar(valor);
				}
				System.out.println("Para salir presione '*' ");
				caracter1 = cargar_caracter();
				caracter2 = cargar_caracter();
				
			}
			System.out.println("Ambos caracteres fueron 0 o 1: " + contador + " veces");
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