package core;

import java.util.Comparator;

public class ComparatorImpl implements Comparator<Integer>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		if(o1 < o2)
			return 1;
		return -1;
	}

}
