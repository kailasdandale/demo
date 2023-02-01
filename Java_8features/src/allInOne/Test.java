package allInOne;

import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Test {

	public static List<Employee> getAllEmployee() {

		return Arrays.asList(new Employee(1, "pavan", 26, 23000d, "male", "IT"),
				new Employee(2, "raju", 28, 48000d, "male", "Hr"),
				new Employee(3, "divya", 28, 26000d, "female", "Development"),
				new Employee(6, "nitin", 29, 49000d, "male", "IT"),
				new Employee(5, "pooja", 21, 34000d, "female", "Development"),
				new Employee(4, "neha", 27, 50000d, "female", "Hr"));
	}

	public static void groupByNameAndDipartment() {

		Map<String, Optional<Employee>> emp = getAllEmployee().stream().collect(Collectors
				.groupingBy(Employee::getDipartment, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
		emp.entrySet().forEach(e -> {
			System.out.println(e.getKey() + " >>" + e.getValue().get());
		});

		/*
		 * emp.forEach((k, v) -> { Optional<Employee> e = emp.get(k);
		 * System.out.println(k + "-" + e.get());
		 * 
		 * });
		 */
		
	}
    //Names of Employee with dipartment.
	public static void NamesOfEmployeeByEachDipartment() {

       Map<String, List<String>> collect = 
    		   getAllEmployee()
    		   .stream()
			   .collect(Collectors
						.groupingBy(Employee::getDipartment,
								Collectors.mapping(Employee::getName, 
										Collectors.toList())));
 	           System.out.println(collect);


	}
	
	//group of Employee Age with his name //
	public static void mappingByAgeAndName() {
		Map<Integer, List<String>> map = 
		
				 getAllEmployee()
		         .stream()
		         .collect(Collectors.groupingBy(e->e.getAge(),
				  Collectors
				 .mapping(Employee::getName, Collectors.toList())));
		
		System.out.println(map);
	}
	//max salary of Hr Dept
	public static void maxSalaryOfHrDipartmentEmployee() {
		Employee maxSalaryOfEmployee =
				
				getAllEmployee()
				.stream()
				.filter(e -> e.getDipartment().equals("Hr"))
				.collect(Collectors
						.maxBy(Comparator
								.comparing(Employee::getSalary)))
				                .get();

//		Optional<Employee> max = l.stream()
//				.max(Comparator.comparing(Employee::getSalary));

		System.out.println(" " + maxSalaryOfEmployee);

	}

	public static void getAllEmp() {

		getAllEmployee()
		.stream()
		.sorted(Comparator
				.comparing(Employee::getAge))
		.forEach(System.out::println);
	}

	public static void highSalaryWithDipartmentWise() {

		Map<String, Optional<Employee>> maxSalaryOfEachDipt =
				getAllEmployee()
				.stream()
				.collect(Collectors.groupingBy(Employee::getDipartment,
						Collectors.reducing(BinaryOperator
								.maxBy(Comparator
										.comparing(Employee::getSalary)))));
		maxSalaryOfEachDipt.entrySet().forEach(e -> {
			System.out.println("Dipartment >> " + e.getKey() + " >>salary of Employee >>" + e.getValue().get());
		});
		
//		Map<String, Optional<Employee>> collect = getAllEmployee().stream()
//		.collect(Collectors.groupingBy(Employee::getDipartment,
//						Collectors.maxBy(Comparator
//						.comparing(Employee::getSalary))));
	 }

	private static void topTwoSalary() {
		  
		DoubleSummaryStatistics maxTwo = 
		
		getAllEmployee()
		.stream()
		
	//	.filter(e->"IT".equalsIgnoreCase(e.getDipartment()))
		
		.sorted(Comparator.comparing(Employee::getSalary)
		.reversed())
		.limit(2)
		.collect(Collectors.summarizingDouble(Employee::getSalary));
		
		System.out.println(maxTwo);
		System.out.println(maxTwo.getAverage());
}
	
	public static void highSalaryWithDipartmentWiser() {

		Map<String, Optional<Employee>> maxSalaryOfEachDipt =
				getAllEmployee()
				.stream()
				.collect(Collectors.groupingBy(Employee::getDipartment,
						Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
								
	//System.out.println(maxSalaryOfEachDipt);
	
		maxSalaryOfEachDipt.forEach((k,v)->{
			System.out.println(k+":"+v.get());
		
		});
	
	
	}
	
	
	
	public static void maxSalaryOfEachDipt() {
		
		Map<String, Optional<Employee>> map =
				getAllEmployee()
				.stream().
		        collect(Collectors.groupingBy(s->s.getDipartment(),
				Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
		
		map.forEach((k,v)->{
			System.out.println(k+":"+v.get());
			
		});
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Map<Employee, Integer> map = new HashMap<>();
		map.put(new Employee(1, "pavan", 26, 23000d, "male", "IT"), 1);
		map.put(new Employee(2, "dipak", 28, 56000d, "male", "dev"), 2);
		map.put(new Employee(3, "rahul", 23, 29000d, "male", "test"), 34);
		 
		List<Entry<Employee, Integer>> list =
				 map.entrySet()
				 .stream()
		.sorted(Map.Entry.comparingByKey
				(Comparator.comparing(Employee::getSalary)))
		.collect(Collectors.toList());

		 // System.out.println(list);
		
		 // getAllEmployee());
		 
	     // mappingByAgeAndName();
		 
		 // getAllEmp();
		 
		//groupByNameAndDipartment();
		 
		 NamesOfEmployeeByEachDipartment();
		
	//	highSalaryWithDipartmentWiser();
	
		maxSalaryOfEachDipt();
		// avrageSalary();
		 
		// maxSalaryOfHrDipartmentEmployee();
		 
		// highSalaryWithDipartmentWise();
		
	//	topTwoSalary();
		 
	}

	

}
