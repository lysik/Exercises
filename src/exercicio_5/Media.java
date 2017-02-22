package exercicio_5;

import java.util.Scanner;

public class Media {
	
	private static Scanner scanner;

	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		double nota1, nota2, nota3, media;
					
		System.out.println("Entre com a primeira nota: ");
		nota1 = scanner.nextDouble();
		System.out.println("Entre com a segunda nota: ");
		nota2 = scanner.nextDouble();
		System.out.println("Entre com a terceira nota: ");
		nota3 = scanner.nextDouble();
		media = (nota1+nota2+nota3)/3;
		
		if(media >= 7){
			System.out.println("Aprovado com média: "+ media);
				}
		else if(media >= 5){
			System.out.println("Em recuperação com média: "+ media);			
				}
		else{
			System.out.println("Reprovado com média: "+ media);
		}
	}

}
