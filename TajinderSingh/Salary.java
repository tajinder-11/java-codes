package TajinderSingh;

public class Salary {

	public static void main(String[] args) {

		int sal = 100;
		char gen = 'm';
		int exp = 7;
		int incr = 0;

		if (gen == 'f') {

			if (exp > 5) {
				incr = sal * 20 / 100;
			}
			if (exp > 3 && exp <= 5) {
				incr = sal * 15 / 100;
			}
		} else if (gen == 'm') {
			if (exp > 5) {
				incr = sal * 15 / 100;
			}
			if (exp > 3 && exp <= 5) {
				incr = sal * 10 / 100;
			}
		}

		int ts = sal + incr;

		System.out.println("Increment is " + incr);
		System.out.println("New salary is " + ts);

	}
}
