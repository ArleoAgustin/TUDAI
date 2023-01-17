/*	Realizar un programa que mientras el usuario ingrese dos caracteres letras (en cada iteracion pide ingresar dos caracteres) 
 * 	realice lo siguiente:
    cuente la cantidad de veces en que ambos caracteres son minuscula,
    solicite ingresar un numero entero y si es natural menor que 20 imprima la tabla de multiplicar del numero ingresado.
    Finalmente cuando sale de la iteracion imprima por pantalla la cantidad que fue contando.*/



import java.io.BufferedReader;
import java.io.InputStreamReader;
public class entrega2 {
	
//---------------------- PROGRAMA PRINCIPAL -----------------------------------//
	
	
	public static void main(String[] args) {
	
		imprimir_tablaYcontar ();
		
	}
	
	

//---------------------------------------------- METODOS: ------------------------------------------------//
	
	
	//FUNCION CARGAR LETRA 
	
		public static char cargar_caracter () {
		
			char caracter = '*';
			
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			
			try {
				
				System.out.println ("Ingrese una letra ");
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
		
		
		
// IMPRIMIR TABLA Y CONTAR VECES QUE AMBOS SON MINUSCULA
		
		public static void imprimir_tablaYcontar () {
			
			char caracter1, caracter2;
			int contador = 0;
			int valor;
			caracter1 = cargar_caracter ();
			caracter2 = cargar_caracter ();
			
		while (caracter1 != '*') {
			if (((caracter1 >= 'a') && (caracter1 <= 'z')) && ((caracter2 >= 'a') && (caracter2 <= 'z'))) {
				
				contador = contador +1;
			}
				
				valor = cargar_valor();
				if ((valor >= 0) && (valor < 20)) {
					tabla_de_multiplicar(valor);
				}
				System.out.println("Para salir presione: '*' "); 
				caracter1 = cargar_caracter ();
				caracter2 = cargar_caracter ();
				
			}
			System.out.println("la cantidad de veces que ambos ingresos fueron letras minusculas fue: " + contador );
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
		
	