package Collection;

import java.util.Vector;

class movie1
{
	int id , ratings;
	String name;
	
	movie1(int x, String n, int r)
	{
		id = x; name = n; ratings = r;
	}
	
	public String toString()   // object nu directly print maaran li toString naam da function use krea a. 
	                           // toString naam da function java di object naam di class ch py ahunda a.
	{
		return id + "\t" + name + "\t" + ratings;
	}
} 
public class Collection2 {

	public static void main(String[]args)
	{
		
		movie1 obj1 = new movie1(100, "abc",2);
		movie1 obj2 = new movie1(101, "xyz",3);
		movie1 obj3 = new movie1(102, "mnc",1);
		
		Vector<movie1> vec = new Vector<>();
		vec.add(obj1);
		vec.add(obj2);
		vec.add(obj3);
		
		System.out.println(vec);
		
	}
}
