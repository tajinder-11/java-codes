package Arrays;

/*
 es question ch apa given digits di frequency find krni a 
 mtlb ki ik digit os no ch kinni vaar aaya a 
 */
public class FrequencyOfDigits {

	public static void main(String[] args) {

		int num = 592329;

		int[] arr = new int[10];   //sb ton pehla ik array bna laina a 10 length da kyunki digits 10 i hunde a. 

		while (num > 0) {
			int r = num % 10;  //pehla number nu todna a aapa ta ki kalla kalla digit mil jaye
			arr[r]++;         //jive jive number nu todi jana a ove hi count nu plus kri jana.
			num = num / 10;  // fr number nu shota krn de lyi 10 naal divide krna a.

		}

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != 0) {   
				System.out.println(i + " comes " + arr[i] + " times");
			}
		}

	}

}
