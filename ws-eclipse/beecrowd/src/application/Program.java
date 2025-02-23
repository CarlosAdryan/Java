package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		
		while (a != 0) {
			
			int[][] mat = new int[a][a];
			
			for(int i = 0; i < a; i++) {
				for(int j = 0; j < a; j++) {
					mat[i][j] = 1 + Math.abs(i - j);
				}
			}
			
			StringBuffer sb = new StringBuffer();			
			for(int i = 0; i < a; i++) {
				sb.append(String.format("%3d", mat[i][0]));	
				for(int j = 1; j < a; j++) {
					sb.append(String.format(" %3d", mat[i][j]));		
				}
				sb.append(System.lineSeparator());
			}
			System.out.println(sb);
			
			a = sc.nextInt();
			
		}
		
		sc.close();
		
	}
}
