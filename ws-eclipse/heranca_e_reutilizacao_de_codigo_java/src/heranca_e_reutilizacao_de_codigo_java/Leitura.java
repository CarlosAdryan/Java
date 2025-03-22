package heranca_e_reutilizacao_de_codigo_java;

import java.util.Scanner;

public class Leitura {

	public static void main(String[] args) {
		//Criando o objeto scanner - que tem acesso 
		//aos metodos de leitura

		Scanner LerDados = new Scanner(System.in);
		
		System.out.println("Entre com o seu nome: ");
		//criando var que vai receber o nome
		String name;
		// metodo nextLine para a leitura dos caracteres
		name = LerDados.next();
		
		System.out.println("Seja bem-vindo :" + name);
		
		
		
	}

}
