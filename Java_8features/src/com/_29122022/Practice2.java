package com._29122022;

import java.util.function.Consumer;

public class Practice2 {

	public static void main(String[] args) {
		hello("raju", null, val -> {
			System.out.println("No last Name provided by " + val);
		});
	}

	public static void hello(String firstName, String lastName, Consumer<String> callBack) {

		System.out.println(firstName);
		if (lastName != null) {
			System.out.println(lastName);
		} else {
			callBack.accept(firstName);
		}
	}
}
