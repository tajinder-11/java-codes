package Practice;

public class reverseinfunction {

	String fun(String str) {
		String s = "";
		int i;
		for (i = 0; i < str.length(); i++) {
			s = str.charAt(i) + s;
		}
		return s;
	}

	public static void main(String[] args) {

		String str = "tajinder";
		reverseinfunction obj = new reverseinfunction();
		String ans = obj.fun(str);
		System.out.println(ans);

	}

}
