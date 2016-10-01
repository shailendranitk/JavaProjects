package com.koderunner;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Employee {
	private Integer employeeNumber;
	private String name;
	private Double salary;
	
	
	
	public Employee(Integer employeeNumber, String name, Double salary) {
		super();
		this.employeeNumber = employeeNumber;
		this.name = name;
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "Employee [employeeNumber=" + employeeNumber + ", name=" + name + ", salary=" + salary + "]";
	}
	
	public static void main(String[] args) {
		
		List<Employee> companyEmployees = new ArrayList<>();
		companyEmployees.add(new Employee(101, "Shailendra", 25000D));
		companyEmployees.add(new Employee(102, "Deepak", 30000D));
		companyEmployees.add(new Employee(103, "Rajesh", 15000D));
		companyEmployees.add(new Employee(104, "Aakash", 40000D));
		
		//Iterating the company employees
		System.out.println("All employees:-");
		companyEmployees.forEach(e -> System.out.println(e));
		
		//Filtering employess with salary more than 15000
		System.out.println("\nFiltering employess with salary more than 15000");
		companyEmployees.stream()
						.filter(e -> e.salary>15000D)
						.forEach(e-> System.out.println(e.name));
		
		
		double totalSalary =companyEmployees.stream()
											.mapToDouble(e -> e.salary)
											.sum();
		
		System.out.println("\nTotal Cost to company :"+totalSalary);
		
		companyEmployees.stream()
		.filter(e -> e.salary>15000D)
		.forEach(e-> System.out.println(e.name));


		OptionalDouble averageSalary =companyEmployees.stream()
							.mapToDouble(e -> e.salary)
							.average();

		System.out.println("\nAverage Salary of employee :"+averageSalary.getAsDouble());
		
	}
	

}
