

public class Node implements Comparable<Node>, PrintOnScreen{
	private PrintOnScreen perentNode;
	private Node leftNode;
	private Node rightNode;
	private int velueNode;
	
	public Node(int v) {
		this.velueNode = v;
	}
	
	public Node(PrintOnScreen perent) {
		this. perentNode = perent;
	}
	
	public Node(PrintOnScreen perent, int v) {
		this. perentNode = perent;
		this.velueNode = v;
	}
	
	public void toAssing(Node n2) {
		if (this.compareTo(n2) == 1) {
			if (leftNode != null) {
				leftNode.toAssing(n2);
			} else {
				leftNode = n2;
			}
		} else {
			if (rightNode != null) {
				rightNode.toAssing(n2);
			} else {
				rightNode = n2;
			};
		}
	}
	@Override
	public void run() {
		if (leftNode != null) {
			leftNode.run();
		} 
		this.execute();
		if (rightNode != null) {
			rightNode.run();
		}
	}
	
	public void execute() {
		System.out.println(this);
	}
	
	public String toString() {
		return "Node level - "+velueNode+"\n";
	}

	@Override
	public int compareTo(Node n) {
		return velueNode - n.getVelueNode();
	}
	
	public void setPerentNode(PrintOnScreen perentNode) {
		this.perentNode = perentNode;
	}

	public PrintOnScreen getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(Node leftNode) {
		this.leftNode = leftNode;
	}

	public PrintOnScreen getRightNode() {
		return rightNode;
	}

	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
	}

	public int getVelueNode() {
		return velueNode;
	}

	public void setVelueNode(int velueNode) {
		this.velueNode = velueNode;
	}

	public PrintOnScreen getPerentNode() {
		return perentNode;
	}
}
