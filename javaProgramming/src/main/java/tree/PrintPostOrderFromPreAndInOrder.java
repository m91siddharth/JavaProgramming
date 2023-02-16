package tree;

import java.util.Arrays;

public class PrintPostOrderFromPreAndInOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] in = {4,2,5,1,3,6};
		int[] pre = {1,2,4,5,3,6};
		printPostOrder(in, pre, in.length);
	}

	private static void printPostOrder(int[] in, int[] pre, int length) {
		// TODO Auto-generated method stub
		int root = search(pre[0], in , length);
		if(root != 0) {
			printPostOrder(in, Arrays.copyOfRange(pre, 1, root), length);
		}
		if(root != length-1) {
			printPostOrder(Arrays.copyOfRange(in, root+1, length),
		    Arrays.copyOfRange(pre, 1+root, length), length - root - 1);
		}
		System.out.print( pre[0] + " ");
	}

	private static int search(int i, int[] in, int length) {
		// TODO Auto-generated method stub
		for(int k =0; k <length; k++ ) {
			if(i == in[k]) {
				return k;
			}
		}
		return -1;
	}

}
//class Node{
//	int key;
//	Node left, right;
//	Node(int d){
//		key = d;
//		left = right = null;
//	}
//}
