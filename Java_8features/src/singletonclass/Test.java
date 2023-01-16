package singletonclass;

public class Test implements Cloneable {

	private static Test t = new Test();

	private Test() {

	}

	public static Test getTest() {

		if (t == null)
			return new Test();
		else
			return t;
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		Test t = Test.getTest();
		System.out.println(t.hashCode());
		Test t2 = Test.getTest();
		System.out.println(t2.hashCode());
		Test t4 = Test.getTest();
		System.out.println(t4.hashCode());
		// Test t3=(Test) t.clone();
		// System.out.println(t3.hashCode());
	}

}
