package vetor_matriz;

import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
		//Criando um vetor
		String cachorros [] = new String[3];
		
		Scanner leia = new Scanner(System.in);
		int indice;
		
		for(indice = 0; indice < 3; indice ++ ) {
			System.out.println("Informe o " + (indice + 1) + "º nome do seu Doguinho: ");
			cachorros[indice]= leia.nextLine();
		}
		
		for (indice = 0; indice < cachorros.length; indice ++) {
			System.out.println("Dogs: [" + indice + "] " + cachorros[indice]);
		}
		
		leia.close();
	}

}
