package application;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Solicita o número ao usuário
        System.out.println("Enter a number");
        long n = sc.nextLong();  // Usa long para aceitar números maiores

        // Converte o número para String para facilitar a comparação
        String palavra = Long.toString(n);

        boolean ehPalindromo = true;

        // Verifica se o número é palíndromo comparando caracteres simétricos
        for (int i = 0; i < palavra.length() / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(palavra.length() - 1 - i)) {
                ehPalindromo = false;
                break;  // Interrompe o loop assim que encontra um par de caracteres diferentes
            }
        }

        // Exibe o resultado baseado na verificação
        if (ehPalindromo) {
            System.out.println("Is palindrome!");
        } else {
            System.out.println("Not palindrome.");
        }

        sc.close();
    }
}
