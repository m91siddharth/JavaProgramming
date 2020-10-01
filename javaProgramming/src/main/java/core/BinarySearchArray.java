package core;

import java.util.Arrays;

public class BinarySearchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6};
		int key=5;
		int loc = binarySearch(arr, key);
		System.out.print("key location after binary search :"+ loc);
	}
//method for binary search
	public static int binarySearch(int[] arr, int d) {
		int loc = binary(arr,0,arr.length,d);	
		return loc;
	}

	private static int binary(int[] arr, int l, int r, int x) {
		// TODO Auto-generated method stub
		if(l>r)
			return -1;
		if(l==r)
			return -1;
		if(r>l) {
			int mid = (l + r-1)/2;
			
			if(arr[mid]==x) {
				return mid;
			}
			if(arr[mid] > x) {
				binary(arr, 0, arr.length, x);
			}
			
			return binary(arr, mid, r, x);
			
		}
		
		
		return 0;
	}

}
