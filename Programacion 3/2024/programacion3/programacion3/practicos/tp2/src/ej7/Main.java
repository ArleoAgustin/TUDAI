package ej7;

public class Main {

    public static void main(String[] args) {

        Ej7 ej7 = new Ej7();

        System.out.println("");
        System.out.println("MergeSort:");

        int [] arr = {44,12,110,3,78,22,45,98};

        ej7.sort(arr);

        for (int i : arr) {
            System.out.print(i+ ", ");
        }

        System.out.println("");
        System.out.println("QuickSort:");


            int [] arr2 = {44,12,110,3,78,22,45,98};
            int n = arr2.length;
            ej7.quickSort(arr2, 0, n - 1);
            System.out.println("Arreglo ordenado por Quicksort:");
            for (int num : arr2) {
                System.out.print(num + ", ");
            }

    }
}
