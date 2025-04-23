package application;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        long n = sc.nextLong();  // Mudado para long para aceitar números grandes

        String palavra = Long.toString(n);  // Mudança para usar Long.toString()

        boolean ehPalindromo = true;

        for (int i = 0; i < palavra.length() / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(palavra.length() - 1 - i)) {
                ehPalindromo = false;
                break; // não precisa continuar se já sabe que não é
            }
        }

        if (ehPalindromo) {
            System.out.println("Is palindrome!");
        } else {
            System.out.println("Not palindrome.");
        }

        sc.close();
    }
}
