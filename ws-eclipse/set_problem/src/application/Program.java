package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Set<String> users = new HashSet<>();

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter file full path: ");
		String path = sc.next();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();

			while (line != null) {
				String[] i = line.split(" ");
				if (!users.contains(i[0])) {
					users.add(i[0]);
				}
				line = br.readLine();
			}
			System.out.print("Total users: " + users.size());
		} catch (IOException e) {
			System.out.println("ERROR" + e.getMessage());
		}
		sc.close();
	}
}