package core;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Siddharth";
		String a="";
		char[] arr= s.toCharArray();
		for(int i =arr.length-1; i >= 0 ; i-- ) {
			a = a+arr[i];
		}
		System.out.println("reverse string :::: "+a);
	}

}
