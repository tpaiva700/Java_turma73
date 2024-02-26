package exeIntro;

import java.util.Scanner;

public class Exe4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variáveis
				float n1, n2, n3, n4, calcs;
				
				Scanner leia1 = new Scanner(System.in);
				
				//Solicitando os valores
				System.out.println("Por favor informe o valor 1:  ");
				n1 = leia1.nextFloat();
				
				System.out.println("Por favor informe o valor 2: ");
				n2 = leia1.nextFloat();
				
				System.out.println("Por favor informe o valor 3: ");
				n3 = leia1.nextFloat();
				
				System.out.println("Por favor informe o valor 4: ");
				n4 = leia1.nextFloat();
				
				calcs = (n1 * n2) - (n3 * n4);
				
				System.out.printf("A média das suas notas é %.1f", calcs);
	}

}
