package PracticeArray;

public class palilndromeinrange {

	public static void main(String[] args) {
		
		int num;
		
	    int start = 10;
	    int end = 80;
	    
	    int add = 0;
	    
	    for(num = start; num <= end; num++)
	    {
			int t = num;
			int sum = 0;
			
			while(num > 0)
			{
				int r = num % 10;
				sum = (sum * 10) + r;
				num = num / 10;
			}
			
			num = t;
			
			if(sum == t)
			{
				while(sum > 0)
				{
					int ld = sum % 10;
					add = add + ld;
					sum = sum / 10;
				}
			}
	    }
	    System.out.println(add);
	}
}
