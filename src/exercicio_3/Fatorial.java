package exercicio_3;

import java.util.Scanner;

public class Fatorial {

	public static Scanner scanner;

	public static void main(String[] args) {
		int n,nm, total =1;
		scanner = new Scanner(System.in);
		
		
		System.out.println("informe um número para calcurar seu fatorial: ");
		n = scanner. nextInt();
		nm = n;
		
		while (n > 0){
			total = total*n;
			n--;
			
		}
	
		System.out.println("o fatorial de "+ nm +" é:  "+total);

		System.exit(0);
	}

}
