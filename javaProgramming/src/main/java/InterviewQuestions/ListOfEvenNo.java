package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class ListOfEvenNo {

	
	//return list of even numbers in a list consecutive subsequence 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls = new ArrayList<>();
		ls.add(2);
		ls.add(4);
		ls.add(5);
		ls.add(4);
		ls.add(6);
		ls.add(8);
		System.out.print(getEvenSubsequence(ls));
	}

	private static List<Integer> getEvenSubsequence(List<Integer> ls) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<>();
		List<Integer> tmp = new ArrayList<>();
		int count =0, max =0;
		for(int i =0;i<ls.size();i++) {
			if(ls.get(i)%2 ==0) {
				count++;
				tmp.add(ls.get(i));
				if(count>max) {
					max = count;
					l.clear();
					l.addAll(tmp);
				}
			}else {
				count = 0;
				tmp.clear();
			}
		}
		return l;
	}

}
