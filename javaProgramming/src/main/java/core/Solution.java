package core;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[2];
		int[] b = new int[3];
		b[0]= 3;
		b[1]= 2;
		b[2]= 3;
		a = twoSum(b,6);
		System.out.println(a[0]+":"+a[1]);
	}
	
    public static int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];
        
        	for(int i=0; i< nums.length-1; i++){
                for(int j =i+1;j< nums.length; j++){
                	System.out.println("Sum ::"+ ((int)nums[i] +(int)nums[j]));
                	System.out.println("target"+target);

                	if(nums[i] + nums[j] == target)
	                {
	                    a[0] = i;
	                    a[1] = j;
	                }
            }
            }
            return a;
    }
}
