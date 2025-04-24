package application;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter segments");
        System.out.print("AB: ");
        int ab = sc.nextInt();
        System.out.print("CD: ");
        int cd = sc.nextInt();
        System.out.print("EF: ");
        int ef = sc.nextInt();
        
        // Verificando a validade do triângulo
        if (ab + cd > ef && ab + ef > cd && cd + ef > ab) {
            System.out.println("Forms a triangle");
        } else {
            System.out.println("Doesn't form a triangle");
        }

        sc.close();
    }
}
