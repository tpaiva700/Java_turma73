package exe_repeticao;

import java.util.Scanner;

public class Exerc2 {

	public static void main(String[] args) {
		//Laço de Repetição FOR
		Scanner leia = new Scanner(System.in);
		
		int num, numPar, numImpar, cont; 
		
		numPar = 0; 
		numImpar = 0;
		
		for(cont = 1; cont <= 10; cont ++) {
			System.out.println("Digite o " + cont + "º número: ");
			num = leia.nextInt();
			
			if(num % 2 == 0) {
				numPar ++ ;
			}else {
				numImpar ++ ;
			}
		}
		
		System.out.println("Total de números pares: " + numPar);
		System.out.println("Total de números ímpares: " + numImpar);

        
		
	}

}
