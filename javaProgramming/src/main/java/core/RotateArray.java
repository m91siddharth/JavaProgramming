package core;
import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		int d=2;
		rotate(arr, d);
		Arrays.stream(arr).forEach(System.out::println);

	}

	private static void rotate(int[] arr, int d) {
		// TODO Auto-generated method stub
		int tmp;
		int l = arr.length;
		for(int i=0; i<d ; i++) {
			tmp = arr[0];
			for(int j=0; j<l-1;j++) {
				arr[j] = arr[j+1];
			}
			arr[l-1] = tmp;
		}
	}

}
