package Loops;

public class SwapFirstAndLAst {

	public static void main(String[] args) {
		
		int num = 1234;
		int t = num;
		int c =0;
	    int last = num % 10;
	    System.out.println("Last : " + last);
	    
	    while(num >= 10) {
	    	c++;
	        num =num/10;
	    }
	    
	    System.out.println("Digits " + c);
	    int first = num;
	    System.out.println("First : " + first);
	    
	    num = t;
	    num = num /10;
	    
	    int power = (int)Math.pow(10,c-1);
	    
	    int mid = num % power;
	    System.out.println("Mid : " + mid);
	    
	    num = last * (int)Math.pow(10 , c) + mid * 10 + first;
	    System.out.println("Final : " + num);
	}

}
