package core;

import java.util.*;


public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> l = new ArrayList();
l.add(2);
l.add(9);
l.add(5);
l.add(1);
l.add(4);

Comparator<Integer> com = new ComparatorImpl() {
	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		if(o1 < o2)
			return 1;
		return -1;
	}
};
Collections.sort(l, com);
System.out.println(l);
	}

}
