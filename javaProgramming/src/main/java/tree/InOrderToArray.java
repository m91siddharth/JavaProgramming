package tree;

import java.util.ArrayList;

public class InOrderToArray {
	static Node root;
	public InOrderToArray() {
		// TODO Auto-generated constructor stub
		root = null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		root = new Node(5);
		root.left = new Node(3);
		root.left.left=new Node(1);
		root.left.right=new Node(2);
		root.right = new Node(9);
//		inOrderToArray(root);
		int[] in = inOrderToArray(root);
		int n = in.length;
		ArrayList<Integer> ni = new ArrayList();
		for(int i=0; i < n ; i++ ) {
			if(i==0) {
				ni.add(in[i+1]);
			}
			else if(i+1>=n) {
				ni.add(in[i-1]);
			}else {
				ni.add(in[i-1]+in[i+1]);
			}
			
		}
		System.out.println(ni);
	}
	private static int[] inOrderToArray(Node root) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ar = new ArrayList();
		inOrder(root, ar);
		System.out.println(ar);
		return ar.stream().mapToInt(i -> i).toArray();
	}
	private static void inOrder(Node root, ArrayList<Integer> ar) {
		// TODO Auto-generated method stub
		if(root == null) {
			return;
		}
		inOrder(root.left,ar);
		ar.add(root.key);
		inOrder(root.right,ar);
	}

}

class Node{
	int key;
	Node left, right;
	Node(int d){
		left=right=null;
	}
}