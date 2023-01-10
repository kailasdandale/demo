package com._27122022;

//find second largest number in givan array

public class Practice15 {

	public static void main(String[] args) {
		int arr[] = { 12, 45, 76, 78, 98, 80, 600, 789 };

		int large = 0;
		int sec = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > large) {
				sec = large;
				large = arr[i];
			}

			if (arr[i] < large && arr[i] > sec) {
				sec = arr[i];
			}

		}

		System.out.println(large);
		System.out.println(sec);

	}
}
