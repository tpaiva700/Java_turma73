package lacos_condicionais;

import java.util.Scanner;

public class Interativo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("Digite o valor de X: ");
		x = leia.nextInt();
		
		System.out.println("Digite o valor de Y: ");
		y = leia.nextInt();
		
		
		if (x > y) {
			System.out.println("X maior que Y ");
		}else if (x == y) {
			System.out.println("X e Y tem os mesmos valores ");
		}else {
			System.out.println("Y é maior que X ");
		}
		
		leia.close();
		
	}
}
	
