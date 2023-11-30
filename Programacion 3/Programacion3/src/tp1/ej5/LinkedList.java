package tp1.ej5;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {
    private Node<T> first;
    private int size;

    public LinkedList() {
        this.first = null;
        this.size = 0;
    }

    public void insertFront(T info) {
        Node<T> tmp = new Node<T>(info,null);
        tmp.setNext(this.first);
        this.first = tmp;
        this.size++;
    }

    public T extractFront() {
        this.first = this.first.getNext();
        this.size--;
        return first.getInfo();

    }

    public boolean isEmpty() {

        return this.size > 0;
    }

    public T get(int index) {

        int contador = 0;
        Node<T> aux = first;

        while(aux != null) {

            if(contador == index)
                return aux.getInfo();

            aux = aux.getNext();

            contador++;
        }

        return null;
    }

    public int size() {

        return this.size;
    }

    @Override
    public String toString() {
        String res = "";
        Node<T> t = first;
        while (t != null) {
            res += t.getInfo() + " ";
            t = t.getNext();
        }
        return  res;
    }


    public int indexOf(T info){
        int cont = 0;
        Node<T> n = new Node<>();
        n = first;
        return  indexOfRecusivo(n,info, cont);

    }

    private int indexOfRecusivo(Node<T> n, T info, int cont){

        if(n == null)
            return -1;
        else if (n.getInfo().equals(info))
            return cont;
        else
            return    indexOfRecusivo(n.getNext(), info, cont+1);
    }



    @Override
    public Iterator<T> iterator() {
        return new IterableList();
    }

    private class IterableList implements Iterator<T>{

        int pos;

        public IterableList(){
            pos = 0;
        }

        @Override
        public boolean hasNext() {
            return pos < size();
        }

        @Override
        public T next() {

            return get(pos-1);
        }
    }

}

