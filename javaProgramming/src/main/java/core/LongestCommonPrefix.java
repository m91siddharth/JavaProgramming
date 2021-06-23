package core;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] str = {"word" , "world" , "wo", "worth"};
		System.out.println("longest common prefix :::"+getCommonprefix(str));
	}

	private static String getCommonprefix(String[] str) {
		// TODO Auto-generated method stub
		Arrays.sort(str);
		
		int lowestLen = str[0].length();
		int counter=0;
		String prefix = null;
		int k;
		for(int j =0; j<str.length-2; j++) {
			k =j;
			for(int i =0; i < lowestLen;i++) {
				if(str[j].charAt(i) == str[++k].charAt(i)) {
					counter++;
				}
			}
			if(counter>=0 ) {
				if(prefix == null)
					prefix= str[0].substring(0,counter);
				else if(prefix.length() > counter)
					prefix = str[j].substring(0, counter);
			}
		}
		
		return prefix;
	}
}
