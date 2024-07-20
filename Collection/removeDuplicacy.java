package Collection;
import java.util.Arrays;
import java.util.HashSet;

public class removeDuplicacy {
	
	public static void main(String[] args) {
		
		Integer[]arr = {2,6,3,1,9,2,3,5};
		HashSet<Integer> list = new HashSet<>(Arrays.asList(arr)); // technique to take array in HashSet.
		System.out.println(list);
	}

}
