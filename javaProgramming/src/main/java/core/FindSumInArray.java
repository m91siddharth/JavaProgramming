package core;

public class FindSumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {11, 15, 6, 8, 9, 10};
		int x = 25;
		int[] pos = findx(arr, x);
		System.out.println(pos[0]+"&"+pos[1]);
	}

	private static int[] findx(int[] arr, int x) {
		// TODO Auto-generated method stub
		int[] pos = new int[2];
		
		for(int i =0; i < arr.length; i++) {
			for(int j =i+1; j < arr.length; j++) {
				if(arr[i]+arr[j] == x) {
					pos[0] = i;
					pos[1] = j;
					return pos;
				}
				
			}
		}
		return pos;
		
	}

}
