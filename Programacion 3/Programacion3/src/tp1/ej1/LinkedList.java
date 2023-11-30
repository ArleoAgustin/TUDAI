package tp1.ej1;

public class LinkedList<T> {
    private TreeNode<T> first;
    private int size;

    public LinkedList() {
        this.first = null;
        this.size = 0;
    }

    public void insertFront(T info) {
        TreeNode<T> tmp = new TreeNode<T>(info,null);
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
        TreeNode<T> aux = first;

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
        TreeNode<T> t = first;
        while (t != null) {
            res += t.getInfo() + " ";
            t = t.getNext();
        }
        return  res;
    }

}

