package Patterns;

public class Pattern1 {

	public static void main(String[] args) {

		for (int i = 0; i <= 6; i++) {

			for (int j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
