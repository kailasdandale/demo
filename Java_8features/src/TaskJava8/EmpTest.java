package TaskJava8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmpTest {

	public static List<Employee>taxiPayableEmployees(String input){
	return	
			//if 
			(input.equalsIgnoreCase("tax"))
			? EmpDataTest
		    .EmployeeData()
		    .stream()
		    .filter(e->e.getSalary() >500000)
		    .collect(Collectors.toList())
			
		    //else return nontaxiable employee list
			
		    :EmpDataTest
			.EmployeeData()
			.stream()
			.filter(e->e.getSalary() <= 500000)
			.collect(Collectors.toList());
		
	}
	
	public static void highSalaryOfEmployee() {
		
		Map<String, Optional<Employee>> maxsalaryofemp = EmpDataTest
		.EmployeeData()
		.stream()
		.collect(Collectors
				.groupingBy(Employee::getName,
						Collectors.maxBy(Comparator
								.comparing(Employee::getSalary))));	
		
		maxsalaryofemp.forEach((k,v)->{
			System.out.println(k+" : "+v.get());
		
			
		});
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		
		Map<Integer, Employee>map=new HashMap<>();
		map.put(1, new Employee(2, "dipak", 230000));
		map.put(2, new Employee(1, "navin", 34000));
		map.put(3, new Employee(5, "pooja", 764744));
		map.put(4, new Employee(7, "dipali", 874464));
		
//		List<Entry<Integer, Employee>> ss = map.entrySet()
//		.stream()
//		.sorted(Map
//				.Entry
//				.comparingByValue(Comparator
//						.comparing(Employee::getSalary)))
//		.collect(Collectors.toList());
		
		highSalaryOfEmployee();
		
		//System.out.println(taxiPayableEmployees("nontax"));
	}
}
