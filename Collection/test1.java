package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class test1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		
		System.out.println(list);
		
		System.out.println("using for loop ");
		for(int i = 0; i < list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		System.out.println("using for each loop ");
		for(Integer x : list) 
		{
			System.out.println(x);
		}
		
		System.out.println("using Iterator ");
		Iterator itr = list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
