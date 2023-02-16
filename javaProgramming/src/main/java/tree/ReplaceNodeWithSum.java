package tree;

import java.util.ArrayList;

public class ReplaceNodeWithSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] in = {4,2,5,1,6,3,7};
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

}
