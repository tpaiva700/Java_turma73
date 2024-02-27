package exe_lacos;

import java.util.Scanner;

public class Exe2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int a;
		
		System.out.println("Informe o valor de A: ");
		a = leia.nextInt();
		
		if(a > 0 && a % 2 == 0) {
			System.out.println("O Número " + a + " é par e positivo!");
		}else if(a < 0 && a % 2 != 0 ) {
			System.out.println("O Número " + a + " é ímpar e negativo!");
			a = a +1;
		}else if(a < 0 && a % 2 == 0 ) {
			System.out.println("O Número " + a + " é par e negativo!");
		}else {
			System.out.println("O Número " + a + " é ímpar e positivo!");
		}
		
		leia.close();
	}

}
