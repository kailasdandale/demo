package TaskJava8;

import java.util.List;

public class EmpDataTest {

	public static List<Employee> EmployeeData() {
		
		
		return List.of(new Employee(1, "raju", 500000),
				new Employee(2, "dipak", 800000),
				new Employee(4, "mohit", 600000),
				new Employee(6, "pooja", 300000),
				new Employee(9, "nitin", 1200000));
		
		
		
	}
}
