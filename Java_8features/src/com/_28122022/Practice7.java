package com._28122022;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 ava has built-in mechanism to handle exceptions.
Using the try statement we can test a block of code for errors. 
The catch block contains the code that says
what to do if exception occurs.
 */
public class Practice7 {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */

		try {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = a / b;
			System.out.print(c);
		}
		catch (InputMismatchException r) {
			
			System.out.print("java.util.InputMismatchException");
		} 
		catch (Exception e) {
			System.out.print(e);
		}

	}
}