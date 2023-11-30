package tp1.ej6;

import java.util.Comparator;
import java.util.Iterator;

public class LinkedList<Integer> implements Iterable<Integer>{
    private Node<Integer> first;
    private int size;
    private Comparator<Integer> comparador;

    public LinkedList(Comparator<Integer> comp) {
        this.first = null;
        this.size = 0;
        this.comparador = comp;
    }

    public void insertFront(Integer info) {
        Node<Integer> tmp = new Node<Integer>(info,null);
        tmp.setNext(this.first);
        this.first = tmp;
        this.size++;
    }

    public Integer extractFront() {
        this.first = this.first.getNext();
        this.size--;
        return first.getInfo();

    }

    public boolean isEmpty() {

        return this.first == null;
    }

    public Integer get(int index) {

        int contador = 0;
        Node<Integer> aux = first;

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
        Node<Integer> t = first;
        while (t != null) {
            res += t.getInfo() + " ";
            t = t.getNext();
        }
        return  res;
    }


    public void insertarOrdenado(Integer n) {

        if (!this.isEmpty()) {
            System.out.println("entre");
          /*  Node aux = first;
            while (aux != null && aux.getInfo() != n) {
                aux = aux.getNext();
                if (aux == null){
                    Node aux2 = new Node<Integer>(n, null);
                    aux = aux2;
                }
            }*/

        }else {
            Node aux = new Node<Integer>(n, null);
            first = aux;
        }

    }


    public LinkedList<Integer> listaComun(LinkedList<Integer> l1) {

        LinkedList<Integer> res = new LinkedList<Integer>(new ComparadorInteger());
        this.forEach(aux -> {
            l1.forEach(n -> {
                if (aux.equals(n))
                    res.insertarOrdenado(n);
            });
        });
        return res;
        }


    @Override
    public Iterator<Integer> iterator() {
        return new IteratorLinkedList<>(this.first);
    }
}

