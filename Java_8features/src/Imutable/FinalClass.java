package Imutable;

public final class FinalClass {

	private final String name;
	private final Employee e;

	public FinalClass(String name, Employee e) {
		super();
		this.name = name;
		Employee ee = new Employee(e.id);
		this.e = ee;
	}

	public String getName() {
		return name;
	}

	public Employee getE() {
		return e;
	}

	public static void main(String[] args) {

		Employee e = new Employee(13);

		FinalClass f = new FinalClass("Neosoft", e);
		System.out.println(f.name);
		e.id = 1;
		System.out.println(f.e.id);

	}

}
