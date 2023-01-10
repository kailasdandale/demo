package singletonclass;

public class Main implements Cloneable {

	public static void main(String[] args) {

		Test test = Test.getTest();

		System.out.println(test);
		Test test2 = Test.getTest();
		System.out.println(test2);

	}
}
