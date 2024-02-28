package exe_repeticao;

import java.util.Scanner;

public class Exerc3 {

	public static void main(String[] args) {
		//Laço de Repetição WHILE
		Scanner leia = new Scanner(System.in);
		
		int idade ;
		int idmenor = 0; 
		int idmaior = 0;
		
		System.out.println("Digite uma idade: ");
		idade = leia.nextInt();
		
		while (idade > 0) {
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
			if(idade < 21) {
				idmenor ++;
			}else if (idade > 50){
				idmaior ++;
			}
		}
		
		System.out.println("Total de pessoas menores de 21 anos: " + idmenor);
		System.out.println("Total de pessoas maiores de 50 anos: " + idmaior);
		
		leia.close();
	}

}
