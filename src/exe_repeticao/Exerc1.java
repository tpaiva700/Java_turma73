package exe_repeticao;

import java.util.Scanner;

public class Exerc1 {

	public static void main(String[] args) {
		//Laço de Repetição FOR
		Scanner leia = new Scanner(System.in);
		int a, b, cont;
		
		System.out.println("Informe dois números: ");
		a = leia.nextInt();
		b = leia.nextInt();
		
		if(a < b) {
			for(cont = a; cont <= b; cont++ ) {
				if(cont % 3 ==0 && cont % 5 ==0) {
					System.out.println(cont + " são múltiplos de 3 e 5");
				}
			}
		}else {
			System.out.println("Intervalo inválido. O primeiro número deve ser menor que o segundo.");
		}
		
		leia.close();
		
		
	}

}
