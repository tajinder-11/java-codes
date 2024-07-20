package DualLoop;

public class TableWithInRange {

	public static void main(String[] args) {

		int num;

		for (num = 3; num <= 7; num++) {

			for (int i = 1; i < 11; i++) {

				System.out.println(num * i + " ");
			}
			System.out.println();
		}

	}

}
