package collection2;

import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class test1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		HashMap<String, ArrayList<student>> map = new HashMap<>();
		
		for(int j = 0; j< 3;j++)
		{
			System.out.println("enter the class : ");
			String cls = sc.next();
			ArrayList<student> list = new ArrayList<>();
			for(int i = 0; i < 3; i++)
			{
				System.out.println("enter the id and name : ");
				int id = sc.nextInt();
				String naam = sc.next();
				student obj = new student();
				
				obj.setId(id);
				obj.setName(naam);
				list.add(obj);
			}
			map.put(cls, list);
		}
	  
	for(Entry<String, ArrayList<student>> x : map.entrySet())
	  {
		  String cls = x.getKey();
		  System.out.println("class " + cls);
		  ArrayList<student> list = x.getValue();
		  for(int i = 0; i < list.size();i++)
		  {
			  student obj = list.get(i);
			  System.out.println(obj.getId() + "\t" + obj.getName());
		  }
	  }

	}

}
