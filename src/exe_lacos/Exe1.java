package exe_lacos;

import java.util.Scanner;

public class Exe1 {

	public static void main(String[] args) {
		//Recebe 3 inteiros 
		int a, b, c;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o valor de A: ");
		a = leia.nextInt();
		
		System.out.println("Informe o valor de B: ");
		b = leia.nextInt();
		
		System.out.println("Informe o valor de C: ");
		c = leia.nextInt();
		
		if(a + b > c ) {
			System.out.println("A Soma de A + B é Maior do que C");
		}else if(a + b < c) {
			System.out.println("A Soma de A + B é Menor do que C");
		}else {
			System.out.println("A Soma de A + B é Igual a C");
		}
		
		leia.close();
		
	}

}
