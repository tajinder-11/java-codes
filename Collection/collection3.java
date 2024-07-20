package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class movie 
{

	int id, rating;
	String name;

	movie(int x, String n, int r) 
	{
		id = x;
		name = n;
		rating = r;
	}

	public String toString() 
	{
		return id + "\t" + name + "\t" + rating;
	}

}

class sorting1 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {

		movie obj1 = (movie) o1;
		movie obj2 = (movie) o2;
		return obj1.rating - obj2.rating;
	}
}

class sorting2 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		movie obj1 = (movie) o1;
		movie obj2 = (movie) o2;
		return 0;
	}
}

public class collection3 {

	public static void main(String[] args) {

		movie obj1 = new movie(100, "mnp", 2);
		movie obj2 = new movie(101, "abc", 1);
		movie obj3 = new movie(102, "xyz", 3);

		ArrayList<movie> list = new ArrayList<>();

		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		Collections.sort(list, new sorting1());
		for (int i = 0; i < list.size(); i++) {
			movie obj = list.get(i);
			System.out.println(obj);
		}

	}

}
