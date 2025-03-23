package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Courses;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many students for course A?");
		int a = sc.nextInt();
		for (int i=0; i < a; i++) {
		int x = sc.nextInt();
		}
		
		System.out.print("How many students for course B?");
		int b = sc.nextInt();
		for (int i=0; i < b; i++) {
		int x = sc.nextInt();
		}
		
		System.out.print("How many students for course C?");
		int c = sc.nextInt();
		for (int i=0; i < b; i++) {
		int x = sc.nextInt();
		}
		
		Courses courses = new Courses(a, b, c);
		
		Set<Courses> set = new HashSet<>();
		set.add(courses);
		
		System.out.println("Total students: " + courses.sum());
		
		
		sc.close();

	}

}
