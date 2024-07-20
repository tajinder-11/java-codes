package OOPS2;

import java.util.Scanner;

public class stuDriver {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i;

		Student[] arr = new Student[3];

		Helper.input(arr);
		Helper.print(arr);
	}
}
