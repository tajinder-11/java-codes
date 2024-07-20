package TajinderSingh;

public class IncrementAndDecrement {
	
	public static void main(String[]args) {
		
		
		
	    int a = 2;
	    
 		int b = a++ + a++ + a++;
		
		int c = a-- + a--; //+ a--;
		
		int d = a++ + a++ + ++a;
		
		System.out.println("the value of c is : " +c);
		
        System.out.println("the value of a is : " +a);
        
        System.out.println("the value of c is : " +d);
        
        System.out.println("the value of b is : " +b);
	}

}
