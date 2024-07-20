package Collection;

import java.util.Vector;

public class sizeCapacity {

	public static void main(String[] args) {
		
		Vector<Integer> vec = new Vector<>(2,4);
		
		System.out.println(vec.size());
		System.out.println(vec.capacity());
		
		vec.add(11);
		vec.add(11);
		vec.add(11);
		
		System.out.println(vec.size());
		System.out.println(vec.capacity());
	}

}
