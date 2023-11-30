package tp1.ej1;

public class TreeNode<T> {

    private T info;
    private TreeNode<T> next;

    public TreeNode() {
        this.info = null;
        this.next = null;
    }

    public TreeNode(T info, TreeNode<T> next) {
        this.setInfo(info);
        this.setNext(next);
    }

    public TreeNode<T> getNext() {
        return next;
    }

    public void setNext(TreeNode<T> next) {
        this.next = next;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

}
