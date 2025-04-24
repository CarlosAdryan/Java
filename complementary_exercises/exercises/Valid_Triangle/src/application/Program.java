package application;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Solicita os segmentos do triângulo
        System.out.println("Enter the segments of the triangle:");
        System.out.print("Side AB: ");
        int ab = sc.nextInt();
        System.out.print("Side CD: ");
        int cd = sc.nextInt();
        System.out.print("Side EF: ");
        int ef = sc.nextInt();
        
        // Verificação se os lados formam um triângulo válido
        if (ab + cd > ef && ab + ef > cd && cd + ef > ab) {
            System.out.println("The sides form a triangle.");
        } else {
            System.out.println("The sides do not form a triangle.");
        }
        
        sc.close();
    }
}
