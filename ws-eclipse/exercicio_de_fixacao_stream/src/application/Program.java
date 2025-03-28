package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;
import model.service.EmployeeService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Enter full file path: ");
		String path = sc.next();
		System.out.print("Enter salary: ");
		double salary = sc.nextDouble();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			List<Employee> list = new ArrayList<>();
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			System.out.printf("Email of people whose salary is more than %.2f: \n", salary);
			
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> names = list.stream()
					.filter(e -> e.getSalary() > salary)
					.map(e -> e.getEmail())
					.sorted(comp)
					.collect(Collectors.toList());
			
			names.forEach(System.out::println);
			
			EmployeeService es = new EmployeeService();
			
			double sum = es.filteredSum(list, e -> e.getName().charAt(0) == 'M');
			
			System.out.printf("Sum of salary of people whose name starts with 'M': %.2f", sum);
			
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
		sc.close();

	}

}
