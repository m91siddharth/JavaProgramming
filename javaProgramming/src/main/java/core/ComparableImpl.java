package core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class students implements Comparable<students>{
	int rollno, marks;
	String name;
	public students(int r, int m, String n) {
		super();
		this.rollno =r;
		this.marks=m;
		this.name=n;
	}
	@Override
	public String toString() {
		return "students [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
	}
	@Override
	public int compareTo(students o) {
		// TODO Auto-generated method stub
		return marks>o.marks?1:-1;
	}
	
}
public class ComparableImpl {
	
	public static void main(String[] args) {
		List<students> l = new ArrayList<students>();
		l.add(new students(4,80,"shivam"));
		l.add(new students(76,86,"sujata"));
		l.add(new students(5,99,"sid"));
		
//		Comparable com = new Comparable<T>() {
//			@Override
//			
//		};
		Collections.sort(l);
		for(students s: l) {
			System.out.println(s);
		}
	}
	
}
