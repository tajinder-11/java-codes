package DualLoop;
import java.util.*;
public class PalindromeInRange {
	


	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int num ,count =0;
		
		System.out.println("Enter the start number :"); 
	    int start = sc.nextInt();
	    System.out.println("Enter the end number");
	    int end = sc.nextInt();
	    
		for(num=start; num<=end;num++) {	
			
			int t = num;
			int sum = 0;
			
			while(num>0) {
				
				int r = num % 10;
				sum = sum * 10 +r;
				num = num/10;
			}
			//System.out.println(num);
			
			num = t;  // num nu dobara zinda krea kyunki 10 change ho k 0 ho gya c te fr increment ho k 1 ho gya te loop infinite chal gya c 
			if(num == sum) 
			{
				count++;
				System.out.print(num + " ");
			}
		}
		System.out.println("Total : " + count);
		
	
	}

}
