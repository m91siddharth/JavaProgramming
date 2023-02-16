package stringProblems;

import java.util.ArrayList;
import java.util.List;

public class PermutationPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inp = "Tact coa";
		Boolean iPP = ifpermutationpalindrome(inp.toLowerCase());
		if(iPP) {
			System.out.println("Yes, String chars permutations are palindrome!");
		}else {
			System.out.println("No, String chars permutations are not palindrome!");
		}
	}

	private static Boolean ifpermutationpalindrome(String inp) {
		// TODO Auto-generated method stub
		List<Character> ls = new ArrayList<Character>();
		char[] ca = inp.toCharArray();
		for(int i=0; i <ca.length; i++) {
			if(ca[i]!=' ') {
				if(ls.contains(ca[i])) {
					ls.remove(ls.indexOf(ca[i]));
				}else {
					ls.add(ca[i]);
				}
			}
		}
		if(ls.size() == 0 || ls.size() ==1) {
			return true;
		}else {
			return false;
		}
	}

}
