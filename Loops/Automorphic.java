package Loops;
// 6 : 36
// 5 : 25
// 25: 625
// 76: 5776
public class Automorphic {

	public static void main(String[]args) {
		
		int num = 25;
		int t = num;
		
		int c =0;
		
		int sq = num * num;
		System.out.println("Square : "  + sq);
		
		while(num > 0) {
			c++;
			num = num/10;
		}
		System.out.println("Digits : " + c);
		
		int power = (int)Math.pow(10 , c);
		int last = sq % power;
		System.out.println("Last : " + last);
		
		if(t== last) {
			System.out.println("automorphic number");
		}
		else {
			System.out.println("not automorphic");
		}
	}
}
