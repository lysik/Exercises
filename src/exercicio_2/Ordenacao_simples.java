package exercicio_2;

import java.util.Scanner;

public class Ordenacao_simples {

	public static Scanner scanner;

	public static void main(String[] args) {
		
		int a, b, c, aux;
		scanner = new Scanner (System.in);
		
		System.out.print("entre com 3 números inteiros: ");
		scanner = new Scanner (System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();

		if(a>b){
			aux = b;
			b = a;
			a = aux;
		}

		if(b>c){
			aux = c;
			c = b;
			b = aux;
		}

		if(b<a){
			aux = b;
			b = a;
			a=aux;
		}
		
		System.out.print(" " + a + "<" + b + "<" + c);
	}
}
