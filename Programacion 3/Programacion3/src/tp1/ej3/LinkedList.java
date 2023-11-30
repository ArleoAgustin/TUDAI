package tp1.ej3;

public class LinkedList<T> {

    private Node<T> first;
    private Node<T> last;
    private int size;

    public LinkedList() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public void insertFront(T info) {
        Node<T> tmp = new Node<T>(info,null, null);
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


    public void push( T newInfo){

        Node<T> n = new Node(newInfo, null, null);

        if(first == null){

            first = n;
            last = n;
        }
        else{
            first.setAnt(n);
            n.setNext(first);
            first = n;
            size++;
        }
    }

    public Node<T> pop(){

        Node<T> pop = first;
        first = first.getNext();
        size--;
        return pop;
    }

    public Node<T> top(){
        return first;
    }

    public void reverse(){

        if(first != null){
            Node<T> auxFirst = new Node();
            Node<T> auxLast = new Node();

            auxFirst = first;
            auxLast = last;

            while(first != null && last != null) {

                first.setInfo(auxLast.getInfo());
                last.setInfo(auxFirst.getInfo());
                first = first.getNext();
                last = last.getAnt();

                auxFirst = auxFirst.getNext();
                auxLast = auxLast.getAnt();
                System.out.println("entro");
            }
            while (first == null && last == null){
                first = first.getAnt();
                last = last.getNext();
            }
        }

    }

    public Node<T> getFirst() {
        return first;
    }

    public Node<T> getLast() {
        return last;
    }
}

