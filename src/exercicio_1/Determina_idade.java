package exercicio_1;

import java.util.Scanner;

public class Determina_idade {
	private static Scanner scanner;

	public static void main(String[] args) {
		
		int anoAtual, anoNascimento, qtdeAnos;
			
		scanner = new Scanner(System.in);
		
		
			System.out.println("Entre com o ano atual: ");
		    anoAtual = scanner.nextInt();
		
			System.out.println("Entre com o ano de nascimento: ");
			anoNascimento = scanner.nextInt();
		
			qtdeAnos = anoAtual - anoNascimento;
			System.out.println("Em " + anoAtual +" você completou ou irá completar  "+ qtdeAnos);

	}

}
