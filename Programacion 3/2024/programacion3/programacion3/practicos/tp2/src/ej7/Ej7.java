package ej7;

public class Ej7 {

    private int[] numbers;
    private int[] helper;
    private int size;

    public Ej7() {
    }


/*  Implemente un algoritmo de ordenamiento mergesort para un arreglo de tamaño N.
    Implemente un algoritmo de ordenamiento quicksort para un arreglo de tamaño N.
    ● ¿Cuál es su complejidad en el peor caso?
    ● ¿Cuál es su complejidad promedio?
 */

    public void sort(int[] values){

        this.numbers = values;
        size = values.length;
        this.helper = new int[size];
        mergesort(0,size-1);
    }

    private void mergesort(int low, int high){

        if (low < high){
            int middle = (low + high) / 2;
            mergesort(low, middle);
            mergesort(middle +1, high);
            merge(low, middle, high);
        }
    }

    private void merge(int low, int middle, int high){

        for (int i=low; i <= high; i++){
            helper[i] = numbers[i];
        }

        int i = low;
        int j = middle +1;
        int k = low;

        while(i <= middle && j <= high) {
            if (helper[i] <= helper[j]) {
                numbers[k] = helper[i];
                i++;
            }
            else{
                numbers[k] = helper[j];
                j++;
            }
            k++;
        }
        while (i <= middle){
            numbers[k] = helper[i];
            k++;
            i++;
        }
        while (j <= high){
            numbers[k] = helper[j];
            k++;
            j++;
        }
    }



    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Encuentra el pivote y coloca los elementos menores a la izquierda y los mayores a la derecha
            int pi = partition(arr, low, high);

            // Ordena recursivamente las sub-listas antes y después del pivote
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

        private int partition(int[] arr, int low, int high) {
            int pivot = arr[high];
            int i = low - 1;
            for (int j = low; j < high; j++) {
                if (arr[j] < pivot) {
                    i++;
                    // Intercambia arr[i] y arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            // Intercambia arr[i+1] y arr[high] (o el pivote)
            int temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;

            return i + 1;
        }
    }

