package stringProblems;

import java.util.HashMap;

public class CompressString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabcccccaaaaaaa";
		StringBuilder compressStr = compressString(str);
		System.out.println("here is the compressed string:"+compressStr.toString());
	}

	private static StringBuilder compressString(String str) {
		// TODO Auto-generated method stub
		StringBuilder sb =new StringBuilder(str.length());
		int charCount = 0;
		for(int i=0; i<str.length();i++) {
			charCount++;
			if( i+1 < str.length() ) {
				if(str.charAt(i) != str.charAt(i+1)) {
					sb.append(str.charAt(i));
					sb.append(charCount);
					charCount=0;
				}
			}else {
				sb.append(str.charAt(i));
				sb.append(charCount);
				charCount=0;
			}
		}
		
		return sb;
	}

}
