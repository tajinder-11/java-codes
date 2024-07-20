package Loops;

public class Armstrong3 {

	public static void main(String[] args) {
		
		int num =153;
		int c =0;
		int t =num;
		
		while(num>0) {
			c++;
			num = num/10;
		}
		
		num = t;
		int sum =0;
		
		while(num>0) {
			
			int r  = num%10;
		    sum = sum + (int)Math.pow(r , c);
		    num = num/10;
		}
		
		if(t==sum) {
			System.out.println("armstrong");
		}
		else {
			System.out.println("not armstrong");
		}
		
		

	}

}
