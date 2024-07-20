package Collection;
// it is a collection of nodes which are linked with each other.
// eh array waang extra space ni laindi background te, so devolopers jyada prefer krde ne es nu.

import java.util.LinkedList;
public class linklist {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		list.add(11);
		list.add(23);
		list.add(45);
		list.add(32);
		
		System.out.println(list.get(1));
	}
}
