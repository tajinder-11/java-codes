package Loops;

public class FirstAndLastOfDigit {

	public static void main(String[] args) {
		
		int num = 1234;
		int last = num % 10;		
		System.out.println("Last : " +  last);
		
		while(num >= 10) {  // num nu aapa 10 ton wadda rkhange kyunki 0 da mod ta hona i ni a.
			num = num/10;
		}
		
		int first = num;
		System.out.println("First : " + first);	
	}

}
