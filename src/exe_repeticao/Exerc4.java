package exe_repeticao;

import java.util.Scanner;

public class Exerc4 {

	public static void main(String[] args) {
		// Laço de Repetição DO…WHILE
		Scanner leia = new Scanner(System.in);
		
		int num; 
		int soma = 0;
		
		
		do {
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			
			if(num > 0) {
				soma += num;
			}
			
		}while(num != 0);
		
		System.out.println("A soma dos números positivos é: " + soma);
	}

}
