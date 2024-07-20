package INHERITANCESTUDENTMNGT;

public class Major {

	public static void main(String[] args) {
		Calculate[] arr = new Calculate[3];

		for (int i = 0; i < 3; i++) {
			Calculate obj = new Calculate();
			obj.setDetails();
			obj.setMarks();
			// obj.calc();
			obj.calc();
			arr[i] = obj;
		}
		System.out.println("ID\tName\tM1\tM2\tTotal\tStatus");
		System.out.println("---------------------------------------------");
		for (int i = 0; i < 3; i++) {
			Calculate obj = arr[i];
			obj.getDetails();
			obj.getMarks();
			// obj.calc();
			obj.show();
		}
		System.out.println("---------------------------------------------");
	}
}
