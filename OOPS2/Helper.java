package OOPS2;

import java.util.Scanner;

public class Helper {
	
	static void input(Student[] arr) {
		int i;
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < 3; i++) // it is for input
		{
			System.out.println("Enter the id and name ");
			int roll = sc.nextInt();
			String naam = sc.next();

			Student obj = new Student();
			obj.setId(roll);
			obj.setName(naam);
			arr[i] = obj;
		}

	}

	static void print(Student[] arr) // it is for output
	{
		System.out.println("Student Data ");

		int i;
		for (i = 0; i < 3; i++) {
			Student obj = arr[i];
			System.out.println(obj.getId() + "\t" + obj.getName());
		}
	}
}