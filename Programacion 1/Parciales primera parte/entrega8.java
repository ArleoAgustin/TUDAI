/*Hacer un programa que mientras el usuario ingrese un caracter distinto de '0' realice lo siguiente:
    _pida ingresar otro caracter,
    _cuente cuantas veces el nuevo caracter ingresado fue '2' o '4',
    _si el nuevo caracter es digito calcule el promedio acumulado entre 100 y 200 e imprima el resultado por pantalla,
    _solicite ingresar un numero entero y si es par imprima la tabla de multiplicar del numero ingresado.
    Finalmente cuando sale de la iteracion imprima por pantalla la cantidad de veces '2' o '4'.    
*/




import java.io.BufferedReader;
import java.io.InputStreamReader;
public class entrega8 {
	
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
	
	
	
	public static void procedimiento (char caracter) {
		
		int valor;
		int cont1 = 0;
		int cont2 = 0;
		
		while (caracter != '0') {
			caracter = cargar_caracter();
			if (caracter == '2') {
				cont1 = cont1 +1;
			}
			if (caracter == '4') {
				cont2 = cont2 +1;
			}
			if ((caracter >= '0') && (caracter <= '9')) {
				promedio();
			}
			valor = cargar_valor();
			if (valor % 2 == 0) {
				tabla_de_multiplicar (valor);
			}
			System.out.println();
			System.out.println("Para salir ingrese '0'");
			caracter = cargar_caracter();
		}
		System.out.println("Veces que se ingreso '4': " + cont2);
		System.out.println("Veces que se ingreso '2': " + cont1);
	}
	
	// CALCULAR PROMEDIO
	
	public static void promedio () {
		int valor1, valor2, resultado;
		valor1 = 100;
		valor2 = 200;
		resultado = ((valor1 + valor2) / 2);
		System.out.println("El promedio entre 100 y 200 es: " + resultado);
		
		
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