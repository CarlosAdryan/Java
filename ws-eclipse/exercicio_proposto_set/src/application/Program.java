package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Courses;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Set<Courses> set = new HashSet<>();
		
		System.out.print("How many students for course A?");
		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			int d = sc.nextInt();
			set.add(new Courses(d));
		}

		System.out.print("How many students for course B?");
		int b = sc.nextInt();
		for (int i = 0; i < b; i++) {
			int e = sc.nextInt();
			set.add(new Courses(e));
		}

		System.out.print("How many students for course C?");
		int c = sc.nextInt();
		for (int i = 0; i < c; i++) {
			int f = sc.nextInt();
			set.add(new Courses(f));
		}
		
		System.out.println("Total students: " + set.size());

		sc.close();
	}

}
