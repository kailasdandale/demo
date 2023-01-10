package singletonclass;

public class Test  {

	private static Test t = new Test();

	private Test() {

	}

	public static Test getTest() {
		return t;
	}

	public static void main(String[] args) {

		Test t = Test.getTest();
		System.out.println(t);

	}

}
