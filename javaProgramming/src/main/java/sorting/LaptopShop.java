package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LaptopShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Laptop> lap =  new ArrayList();
		lap.add(new Laptop("Dell", 8, 500));
		lap.add(new Laptop("Apple", 12, 800));
		lap.add(new Laptop("Lenovo",16 , 600));
		Collections.sort(lap);
		
		for(Laptop l : lap) {
			System.out.println(l);
		}
		
		Comparator cp = new Comparator<Laptop>() {

			@Override
			public int compare(Laptop o1, Laptop o2) {
				// TODO Auto-generated method stub
				if(o1.getPrice()>o1.getPrice()) {
					return 1;
				}else {
					return -1;
				}
			}
		};
		
		Collections.sort(lap, cp);
		
		for(Laptop l : lap) {
			System.out.println(l);
		}
	}

}
