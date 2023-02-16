package amdocs;

public class Problem4 {
		
		
		public static void main(String[] args)
	    {
	        Problem4 ob = new Problem4();
	        int arr[] = { 3, 3, 2, 8 };
	        int n = arr.length;
	        ob.multiplyArray(arr, n);
	    }
		
		void multiplyArray(int arr[], int n)
	    {
			if(n>0) {
			int allm = 1;
			for(int i =0; i < n; i++) {
				allm = allm*arr[i];
			}
			System.out.println("Total multiplication:" + allm);
			for(int j =0; j < n ; j++) {
				arr[j] = allm/arr[j];
				System.out.println(arr[j]);
			}
			}
	    }
		// Time complexity O(n)    
}
