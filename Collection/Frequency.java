package Collection;
/* pehla map ch check krna a k value hai ya nhi iniitially map khaali pya a ta krk else wale map. put ch ja k oh value nu
   add kr dyega fr 13 nu check kruga oh v hai ni map ch te ohnu v else ale method naal put kr dauga. fr jdo dobara 12 auna 
   ta os ne determine kr laina  ak map ch haiga a 12 so ohne if vich vadd k 12 + 1 kr dena and fr ehne agge te agge eve i 
   challi jana a.
*/
import java.util.HashMap;

public class Frequency {

	public static void main(String[] args) {
		
		int []arr = {12,13,12,11,12,11,100,22};
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < arr.length; i++)
		{
			if(map.containsKey(arr[i])) // jekar map ch element hai ta eh challuga je nhi ta else ch jaauga.
			{
				map.put(arr[i], map.get(arr[i])+ 1); // jo pehla present a ohnu ik hor + kr dauga c++ di tra.
			}
			else 
			{
				map.put(arr[i],1);
			}
		}
		System.out.println(map);

	}

}
