package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import entities.Candidates;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		String path = sc.next();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			Set<Candidates> set = new HashSet<>();
			String line = br.readLine();
			while(line != null) {

				String[] candidates = line.split(",");
				String username = candidates[0];
				int vote = Integer.parseInt(candidates[1]);
				
				Map<String, Integer> votes = new TreeMap<>();
				
				votes.put(username, vote);
				
				for (String key : votes.keySet()) {
					System.out.println(key + ": " + votes.get(key));
				}
			
				
			}
			
			}
		catch (IOException e) {
			System.out.println("ERROR" + e.getMessage());
		}
		
		
		sc.close();

	}

}
