package StringHandling;
// program to check whether the given ip address is valid or not.
public class IPAddress {

	boolean fun(String str) {
		int i;
		String[] arr = str.split("\\."); // (.)de basis te kise cheej nu split krn lai backword slash lagde a ya fr
											// square brackets[] lagdia ne.

		if (arr.length != 4) // IP address vich max 4 tukde ho skde a je nhi han ta fr oh pehla i false
								// return kr dwe.
		{
			return false;
		}
		for (i = 0; i < arr.length; i++) {
			String s = arr[i];
			int num = Integer.parseInt(s); // Saade kol tukde krk digit string form ch aye c te Integer.parseInt ohnu
											// integer bnaun li use krea a.

			if (num < 0 || num > 255) // IP address da pehla word 0 ton 255 vich hona chahida a je nhi a ta ose velel
										// false return kr dwe.
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		String str = "34.55.67.89";
		IPAddress obj = new IPAddress();
		if (obj.fun(str)) {
			System.out.println("valid IP address");
		} else {
			System.out.println("not valid IP");
		}
	}

}
