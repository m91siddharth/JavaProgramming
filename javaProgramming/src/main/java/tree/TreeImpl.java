package tree;

public class TreeImpl {

	Node root;
	TreeImpl(int a){
		root = new Node(a);
	}
	TreeImpl(){
		root = null;
	}
	
	public static void main(String[] args) {
		TreeImpl newTree = new TreeImpl(5);
		newTree.root.left = new Node(1);
		newTree.root.right = new Node(2);
		
		
	}
}

//class Node{
//	int key;
//	Node left, right;
//	Node(int d){
//		key = d;
//		left= right =null;
//	}
//}