package fibonacci;

import java.util.Iterator;

public class Fibonacci implements Iterable<Integer>{
    private int hasta;

    public Fibonacci(int maxIteraciones){
        hasta = maxIteraciones;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new IteradorFibonacci();
    }

    private class IteradorFibonacci implements Iterator<Integer>{
        private int previo, n;
        private int cantIteraciones;

        public IteradorFibonacci(){
            previo = 1;
            n = 1;
            cantIteraciones = 0;
        }

        @Override
        public boolean hasNext() {
            return cantIteraciones <= hasta;
        }

        @Override
        public Integer next() {
            cantIteraciones++;
            if (cantIteraciones <= 2)
                return 1;
            else{
                int siguiente = previo + n;
                previo = n;
                n = siguiente;
                return siguiente;
            }
        }
    }

    public static void main(String[] args) {
        Fibonacci fibo = new Fibonacci(10);
        for (Integer i:fibo)
            System.out.println(i+",");
    }
}
