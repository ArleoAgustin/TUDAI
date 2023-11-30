package parcial2022.ej2;

public class TreeNode<T> {

    private T info;
    private float kms;
    private TreeNode<T> next;

    public TreeNode() {
        this.info = null;
        this.next = null;
    }

    public TreeNode(T text, float kms){
        this.info = text;
        this.kms = kms;
        this.next = null;
    }

    public TreeNode(T  info, TreeNode<T> next, float kms) {
        this.setInfo(info);
        this.setNext(next);
        this.kms = kms;
    }

    public float getKms() {
        return kms;
    }

    public void setKms(float kms) {
        this.kms = kms;
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

    @Override
    public String toString() {
        return "" + info;
    }
}
