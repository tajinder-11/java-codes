package TajinderSingh;

public class HCF {

	public static void main(String[] args) {

		int a = 4, b = 6;
		int min = a < b ? a : b;

		for (int i = min; i >= 1; i--) {

			if (a % i == 0 && b % i == 0) {
				System.out.println("HCF : " +i);
				break;  // Break is necessary if not applied then it will also go to 1.
			}
		}
	}
}