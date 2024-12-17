package tree;

public class PrintTraversals {
	static Node root;
	public PrintTraversals() {
		// TODO Auto-generated constructor stub
		root = null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		root = new Node(1);
		root.left = new Node(2);
		root.left.left = new Node(3);
		root.left.right = new Node(4);
		root.right = new Node(6);
		root.right.left = new Node(9);
		System.out.println("inorder");
		printInOrderTree(root);
		System.out.println("postorder");
		printPostOrderTree(root);
		System.out.println("pre-order");
		printPreOrderTree(root);
	}

	private static void printPreOrderTree(Node root) {
		// TODO Auto-generated method stub
		if (root == null)
            return;
		System.out.println(root.key);
		printPreOrderTree(root.left);
		printPreOrderTree(root.right);
	}
	private static void printInOrderTree(Node root) {
		// TODO Auto-generated method stub
		if(root ==  null)
			return;
		printInOrderTree(root.left);
		System.out.println(root.key);
		printInOrderTree(root.right);
	}
	
	private static void printPostOrderTree(Node root) {
		// TODO Auto-generated method stub
		if(root == null) {
			return;
		}
		if(root == null ) { System.out.println("Root is empty. !!"); }
		printPostOrderTree(root.left);
		printPostOrderTree(root.right);
		System.out.println(root.key);
	}
}

/*
class Node{
	int key;
	Node left, right;
	Node(int d){
		key = d;
		left = right = null;
	}
}
*/
