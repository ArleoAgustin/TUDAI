package ej9;

public class Ej9 {

    private Celda[][] matriz;
    private static final int N = 4; // Tamaño de la matriz (4x4)

    public Ej9(Celda[][] matriz) {
        this.matriz = matriz;
    }

    public Celda[][] ordenarMatriz() {
        backtracking(0, 0);
        return matriz;
    }

    private boolean backtracking(int fila, int columna) {
        if (fila == N) {
            return true; // Hemos llegado al final de la matriz
        }

        int siguienteFila = fila + (columna + 1) / N;
        int siguienteColumna = (columna + 1) % N;

        if (matriz[fila][columna].getValue() == 0) { // Si es la celda vacía, continuar
            if (siguienteFila < N) {
                if (backtracking(siguienteFila, columna)) return true; // Mover hacia abajo
            } else if (siguienteColumna < N) {
                if (backtracking(0, siguienteColumna)) return true; // Mover hacia la derecha
            }
            return false;
        }

        // Intenta mover hacia abajo
        if (siguienteFila < N && matriz[siguienteFila][columna].isArriba()) {
            swap(fila, columna, siguienteFila, columna);
            if (backtracking(siguienteFila, columna)) return true;
            swap(fila, columna, siguienteFila, columna); // Deshace el movimiento
        }

        // Intenta mover hacia la derecha
        if (siguienteColumna < N && matriz[fila][siguienteColumna].isIzquierda()) {
            swap(fila, columna, fila, siguienteColumna);
            if (backtracking(fila, siguienteColumna)) return true;
            swap(fila, columna, fila, siguienteColumna); // Deshace el movimiento
        }

        return false;
    }

    private void swap(int fila1, int columna1, int fila2, int columna2) {
        Celda temp = matriz[fila1][columna1];
        matriz[fila1][columna1] = matriz[fila2][columna2];
        matriz[fila2][columna2] = temp;
    }
}
