package ej4;

public class Main {

    public static void main(String[] args) {

        Ej4 ej4 = new Ej4();

        int n = 6;
        System.out.println("Los primeros " + n + " términos de la secuencia de Fibonacci son:");
        for (int i = 0; i < n; i++) {
            System.out.print(ej4.fibonacci(i) + " ");
        }
    }
}
