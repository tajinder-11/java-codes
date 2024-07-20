package TajinderSingh;

public class GreaterBetween3Numbers {

	public static void main(String[]args) {
		
		int a = 5 , b = 5 , c = 5;
		
		if(a>b && a>c) {
			System.out.println("a is greatest");
		}
		else if(b>a && b>c) {
			System.out.println("b is greatest");
		}
		else if(c>a && c>b ){
			System.out.println("c is greatest");
		}
		else if( a==b && b==c) {
			System.out.println("No one is greatest");
		}
	}
}
