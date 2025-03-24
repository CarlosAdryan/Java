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
			int singlecod = sc.nextInt();
			set.add(new Courses(singlecod));
		}

		System.out.print("How many students for course B?");
		int b = sc.nextInt();
		for (int i = 0; i < b; i++) {
			int singlecod = sc.nextInt();
			set.add(new Courses(singlecod));
		}

		System.out.print("How many students for course C?");
		int c = sc.nextInt();
		for (int i = 0; i < c; i++) {
			int singlecod = sc.nextInt();
			set.add(new Courses(singlecod));
		}
		
		System.out.println("Total students: " + set.size());

		sc.close();
	}

}
