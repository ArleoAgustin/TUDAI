import java.util.ArrayList;


public class NodeTree {
	private ArrayList<Integer> values;
	private Node root;
	public NodeTree(int v) {
		values = new ArrayList<Integer>();
		root =  new Node(v);
		values.add(1);
		values.add(2);
		values.add(3);
		values.add(4);
		values.add(6);
		values.add(7);
		values.add(8);
		values.add(9);
	}
	
	public void assingValues() {
		root.setVelueNode(0);
		for (Integer v : values) {
			root.toAssing(new Node (v));
		}
	}
	public void runNodes() {
		root.run();
	}
}
