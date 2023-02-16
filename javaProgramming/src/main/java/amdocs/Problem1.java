package amdocs;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a= "abcdefg";
		String as = null;
		char[] ca = a.toCharArray();
		for(int i=0; i < a.length(); i=i+2) {
			System.out.println(ca[i]);
			System.out.println(ca[i+1]);
		}
		myfun(as);
	}

	private static void myfun(String as) {
		// TODO Auto-generated method stub
		
	}

}
