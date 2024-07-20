package Collection;

// jdo apa hashset nu use krde a ta oder maintain nhi hunda.
// it doesen't take duplicate entries. eh allow ni krda kehnda k bahar i reh anni dea.
import java.util.HashSet;

public class hashSet {

	public static void main(String[] args) {
		
		HashSet<Integer> list = new HashSet<Integer>();
		list.add(20);
		list.add(11);
		list.add(5);
		list.add(9);
		
		System.out.println(list);

	}

}
