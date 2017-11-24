package com.sapient.test;

import java.util.List;
import java.time.LocalDate;
import java.util.Arrays;
import com.sapient.emp.*;



public class App {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee("A", LocalDate.of(1983, 10, 15), 1000.0, Gender.M);
		Employee employee2 = new Employee("B", LocalDate.of(1998, 9, 15), 2000.0, Gender.F);
		Employee employee3 = new Employee("C", LocalDate.of(1976, 5, 9), 3000.0, Gender.F);
		Employee employee4 = new Employee("D", LocalDate.of(1990, 3, 10), 4000.0, Gender.M);
		
		
		List<Employee> employees = Arrays.asList(employee1, employee2, employee3, employee4);
		
		ItemLib lib = new ItemLib();
		lib.forEach(employees, System.out::println);
		System.out.println("-----------------------------------");
		
		lib.forEach(employees, item -> System.out.println(item.getName()));
		System.out.println("-----------------------------------");
		
		List<Employee> l = lib.filter(employees, item-> item.getSalary()>2000.00);
		lib.forEach(l, item -> System.out.println(item.getName()));
		System.out.println("-----------------------------------");
		
		List<String> l2 = lib.map(employees, item -> item.getName());
		lib.forEach(l2, System.out::println);
		System.out.println("-----------------------------------");
	}
}
