package tp1.ej3;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> l = new LinkedList<>();

        l.push(3);
        l.push(5);
        l.push(1);
        l.push(8);

        System.out.println(l.toString());

        System.out.println(" ");
        l.reverse();
        System.out.println(l.toString());
    }
}
