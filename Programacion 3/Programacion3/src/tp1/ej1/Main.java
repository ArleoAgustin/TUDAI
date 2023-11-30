package tp1.ej1;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> l = new LinkedList<>();

        l.insertFront(2);
        l.insertFront(55);
        l.insertFront(123);
        l.insertFront(112);
        l.insertFront(1);
        l.insertFront(-59);

        System.out.println(l.toString());
        System.out.println(l.size());
        System.out.println(l.extractFront());
        System.out.println(l.get(1));
    }
}
