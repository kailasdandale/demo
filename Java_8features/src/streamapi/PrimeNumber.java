package streamapi;

public class PrimeNumber {

	public static void main(String[] args) {

		int n = 17;

		int count = 0;

		for (int i = 2; i < n; i++) {

			if (n % i == 0) {
				count++;
				break;
			}
		}
		if (count == 1) {
			System.out.println("number is not prime");
		} else {
			System.out.println("Number is prime");
		}

	}
}
