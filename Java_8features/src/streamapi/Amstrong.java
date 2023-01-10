package streamapi;

import java.util.Scanner;

public class Amstrong {
	public int amrstrong(int no) {

		int length = 0;
		int t1 = no;
		while (t1 > 0) {
			t1 = t1 / 10;

			length++;
		}

		int t2 = no;
		int rem = 0;
		int arm = 0;
		while (t2 > 0) {
			rem = t2 % 10;
			int mul = 1;
			for (int i = 1; i <= length; i++) {

				mul = mul * rem;
			}
			arm = arm + mul;
			t2 = t2 / 10;
		}
		if (arm == no) {
			System.out.println("Its an arstrong");
		} else {
			System.out.println("its not armstrong");

		}
		return arm;

	}

	public static void main(String[] args) {
		Amstrong obj = new Amstrong();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the No");
		int no = scanner.nextInt();
		int amrstrong = obj.amrstrong(no);

		System.out.println(amrstrong);
	}
}
