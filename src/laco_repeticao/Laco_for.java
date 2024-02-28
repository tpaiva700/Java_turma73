package laco_repeticao;

import java.util.Scanner;

public class Laco_for {

	public static void main(String[] args) {
		String nome1;
		int i;
		Scanner leia = new Scanner(System.in);
		
		for(i = 1; i <= 3; i++) {
			System.out.println("Digite o " + i + "º nome: ");
			nome1 = leia.nextLine();
			System.out.println("O " + i + "º nome é: " + nome1);
		}
		
		leia.close();
		
	}

}
