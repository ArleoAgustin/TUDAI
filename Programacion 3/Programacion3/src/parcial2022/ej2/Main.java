package parcial2022.ej2;

public class Main {

    public static void main(String[] args) {

        LinkedList e = new LinkedList();

        TreeNode e0 = new TreeNode("E0",0);
        TreeNode e1 = new TreeNode("E1",100);
        TreeNode e2 = new TreeNode("E2",130);
        TreeNode e3 = new TreeNode("E3",220);
        TreeNode e4 = new TreeNode("E4",290);
        TreeNode e5 = new TreeNode("E5",300);
        TreeNode e6 = new TreeNode("E6",340);
        TreeNode e7 = new TreeNode("E7",450);
        TreeNode e8 = new TreeNode("E8",500);
        TreeNode e9 = new TreeNode("E9",570);
        TreeNode e10 = new TreeNode("E10",680);
        TreeNode e11 = new TreeNode("E11",700);
        TreeNode e12 = new TreeNode("E12",720);
        TreeNode e13 = new TreeNode("E13",830);

        e0.setNext(e1); e1.setNext(e2); e2.setNext(e3); e3.setNext(e4); e4.setNext(e5); e5.setNext(e6);
        e6.setNext(e7); e7.setNext(e8); e8.setNext(e9); e9.setNext(e10); e10.setNext(e11);
        e11.setNext(e12); e12.setNext(e13);

        e.insertFirst(e0);

        System.out.println(e);

        Ej2 ej2 = new Ej2(e);

        System.out.println(ej2.greedy(e0,e13,400,e0));
    }

}
