package streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeTest {

	public static void main(String[] args) {

		List<Employee> emplist = new ArrayList<>();
		emplist.add(new Employee(1, "akshay", 5000));
		emplist.add(new Employee(2, "kailas", 20000));
		emplist.add(new Employee(3, "ram", 2000));
		emplist.add(new Employee(4, "sham", 500));

		Map<Integer, List<Employee>> mapemp = emplist.stream()
				.collect(Collectors.groupingBy(Employee::getSalary, Collectors.toList()));

		mapemp.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + "---" + entry.getValue());
		});

		Employee max = emplist.stream().max(Comparator.comparing(Employee::getSalary)).get();

		System.out.println(max);
		Employee min = emplist.stream().min(Comparator.comparing(Employee::getSalary)).get();

		System.out.println(min);

	}
}
