package tp2.ej1;

public class Node {

    private Node izq, der;
    private int info;

    public Node() {
        this.izq = null;
        this.der = null;
    }

    public Node(Node n){
        this.izq = n.getIzq();
        this.der = n.getDer();
        this.info = n.getInfo();
    }

    public Node(int value){
        this.izq = null;
        this.der = null;
        this.info = value;
    }

    public Node getIzq() {
        return izq;
    }

    public void setIzq(Node izq) {
        this.izq = izq;
    }

    public Node getDer() {
        return der;
    }

    public void setDer(Node der) {
        this.der = der;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public boolean soyVocal(){
        return switch (this.getInfo()) {
            case 'a' -> true;
            case 'e' -> true;
            case 'i' -> true;
            case 'o' -> true;
            case 'u' -> true;
            default -> false;
        };
    }

    public boolean soyHoja(){
        return getDer() == null && getIzq() == null;
    }
}
