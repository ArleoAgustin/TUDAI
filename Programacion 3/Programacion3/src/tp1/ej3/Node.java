package tp1.ej3;

public class Node<T> {

    private T info;
    private Node<T> next;
    private Node<T> ant;

    public Node() {
        this.info = null;
        this.next = null;
        this.ant = null;
    }

    public Node(T info, Node<T> next, Node<T> ant) {
        this.setInfo(info);
        this.setNext(next);
        this.setAnt(ant);
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public Node<T> getAnt() {
        return ant;
    }

    public void setAnt(Node<T> ant) {
        this.ant = ant;
    }
}
