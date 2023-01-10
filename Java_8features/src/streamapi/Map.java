package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Map {

	public static void main(String[] args) {

		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(1, "akshay", 5000));
		emp.add(new Employee(2, "kailas", 20000));
		emp.add(new Employee(3, "ram", 2400));
		emp.add(new Employee(4, "sham", 500));

		Stream<String> map = emp.stream().map(Employee::getName);
		// System.out.println(map);
		map.forEach(System.out::print);
		java.util.Map<String, List<Employee>> collect = emp.stream()
				.collect(Collectors.groupingBy(Employee::getName));

		collect.entrySet().forEach(e -> {

			System.out.println("string" + e.getKey() + "---" + e.getValue());
		});

	}
}
