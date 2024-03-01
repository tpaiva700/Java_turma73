package vetor_matriz;

import java.util.Scanner;

public class ExeVetor1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//Nosso vetor
		int num [] = {2,5,1,3,4,9,7,8,10,6};
		int numUser, indice, posicao = 0; 
		
		System.out.println("Digite o número que você deseja encontrar: ");
		numUser = leia.nextInt();
		
		for(indice = 0; indice < num.length; indice ++) {
			if (numUser == num[indice]) {
				posicao = indice;
			}
	}
		if(posicao != 0) {
			System.out.println("O número " + numUser + " está localizado na posição: " + posicao);
		}else {
			System.out.println("O número " + numUser + " não foi encontrado!");
		}
		leia.close();
		
	}
}
