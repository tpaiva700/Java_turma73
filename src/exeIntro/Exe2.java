package exeIntro;

import java.util.Scanner;

public class Exe2 {

	public static void main(String[] args) {
		//Variáveis pra receber os valores das notas
		float n1, n2, n3, n4, media;
		
		Scanner leia1 = new Scanner(System.in);
		
		//Solicitando as notas
		System.out.println("Por favor informe a nota 1:  ");
		n1 = leia1.nextFloat();
		
		System.out.println("Por favor informe a nota 2: ");
		n2 = leia1.nextFloat();
		
		System.out.println("Por favor informe a nota 3: ");
		n3 = leia1.nextFloat();
		
		System.out.println("Por favor informe a nota 4: ");
		n4 = leia1.nextFloat();
		
		media = (n1 + n2 + n3 + n4)/4;
		
		System.out.printf("A média das suas notas é %.1f", media);
	}

}
