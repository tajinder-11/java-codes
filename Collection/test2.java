package Collection;

import java.util.TreeSet;

class movienew implements Comparable
{
	int rank;
	String name;
	
	movienew(int x, String n)
	{
		rank= x ; name = n;
	}
	
	public String toString()
	{
		return name +"\t"+ rank;
		
	}

	@Override
	public int compareTo(Object o) {
		movienew obj=(movienew)o;
		return this.rank - obj.rank;
	}
}
public class test2 {

	public static void main(String[] args) {
		
    movienew obj1 = new movienew(2, "mnp ");
    movienew obj2 = new movienew(1, "xyz ");
    movienew obj3 = new movienew(3, "abc ");
    
    TreeSet<movienew> list = new TreeSet<>();
    
    list.add(obj1);
    list.add(obj2);
    list.add(obj3);
    
    System.out.println(list);
    

	}

}
