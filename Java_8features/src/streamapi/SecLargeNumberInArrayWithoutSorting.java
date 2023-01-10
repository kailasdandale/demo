package streamapi;

public class SecLargeNumberInArrayWithoutSorting {

	public static void main(String[] args) {

		int arr[] = { 23, 65, 21, 89, 76, 54, 500, 300 };

		int max = 0;
		int sec = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {

				sec = max;
				max = arr[i];

			}
			if (arr[i] < max && arr[i] > sec) {
				sec = arr[i];

			}

		}
		// System.out.println(arr.length-2);
		System.out.println(sec);

	}
}
