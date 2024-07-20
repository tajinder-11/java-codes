package Collection;
import java.util.Map.Entry;
// eh v order maintain nhi krda,
import java.util.HashMap;

public class hashmap {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> list  = new HashMap<>();
		list.put(7 , " aman");
		list.put(5 , " gagan");
		list.put(4 , " pardhaan");
		list.put(3 , " inder");
		list.put(6 , " vaddiInder");
        System.out.println(list);
        
		for(Entry<Integer, String> x : list.entrySet())
		{
			System.out.println(x.getKey()+ "\t" +x.getValue());
		}
	}
}
