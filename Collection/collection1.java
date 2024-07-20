package Collection;

import java.util.Vector;
class student
{
	
	int id;
	String name;
	
	student(int x, String n)
	{
		id = x;  name = n;
	}
	
	public String toString()
	{
		return "student[id = " + id + ", name =" + name + "]";
	
}
}
public class collection1 {

	public static void main(String[]args)
	{
		Vector<student> vec = new Vector<>();
		student obj1 = new student(100, "aman");
		student obj2 = new student(101,"raman");
		student obj3 = new student(102,"chaman");
		
		vec.add(obj1);
		vec.add(obj2);
		vec.add(obj3);
		
		System.out.println(vec);
		
	}

	}

