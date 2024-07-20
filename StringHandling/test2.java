package StringHandling;

// making a new String = means ki stringnu reverse krk ik khaaali string ch paauna a.

public class test2 {

	String fun(String str) {
		
		String s = "";            //khaali string lyi aa kyunki apa reverse krk ede ch paauni a string 
		int i;
		for (i = str.length() - 1; i >= 0; i--) {
			
			s = s + str.charAt(i);      //ikaale ikaale chahracters nu add krn da treeka.
		}
		return s;    // s nu return krwa ditta kyunki sara kuj end te ode ch i store hoya a. 
	}

	public static void main(String[] args) {
		String str = "hello";
		test2 obj = new test2();
		String ans = obj.fun(str);
        System.out.println("Answer = " + ans);
	}

}
