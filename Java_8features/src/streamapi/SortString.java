package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortString {

	public static void main(String[] args) {

		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(1, "akshay", 5000));
		emp.add(new Employee(2, "kailas", 20000));
		emp.add(new Employee(3, "ram", 2400));
		emp.add(new Employee(4, "sham", 500));

		List<Employee> l = emp.stream()
				
				.sorted(Comparator.comparing(Employee::getSalary))
				
				.collect(Collectors.toList());
		
		List<Employee> list = emp.stream().sorted((s1,s2)->s1.getSalary()-s2.getSalary()).collect(Collectors.toList());
		
	//	System.out.println("list"+ list);

		List<Employee> limit = emp.stream()
				.sorted(Comparator.comparing(Employee:: getSalary)
				.reversed())
				.limit(3)
				.collect(Collectors.toList());
		System.out.println(limit);
		
		

		

	}
}
