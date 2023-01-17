
public class Main {

	public static void main(String[] args) {
		
		PilaElemento pila0 = new PilaElemento();
		PilaElemento pila1;
		
		pila0.push("hola0");
		pila0.push("hola1");
		pila0.push("hola2");
		pila0.push("hola3");
		pila0.imprimir();
		pila1 = pila0.copy();
		pila0.pop();
		pila0.pop();
		pila0.reverse();
		pila0.imprimir();
		pila1.imprimir();
		pila0.pop();
		pila1.imprimir();
		pila1.reverse();
		pila1.imprimir();
	}
}
