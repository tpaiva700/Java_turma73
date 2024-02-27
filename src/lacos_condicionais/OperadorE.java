package lacos_condicionais;

import java.util.Scanner;

public class OperadorE {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade;
		boolean carteira;
		
		System.out.println("Informe a sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("Você tem carteira de habilitação? (true/false) ");
		carteira = leia.nextBoolean();
		
		if(idade >= 18 && carteira == true) {
			System.out.println("Você pode dirigir!");
		}else {
			System.out.println("Você não atingiu os critérios");
		}
		
		leia.close();
	}

}
