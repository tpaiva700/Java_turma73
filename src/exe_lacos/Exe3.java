package exe_lacos;

import java.util.Scanner;

public class Exe3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int itens, quant;
		float total;
		
		System.out.println("Informe o código do produto: ");
		itens = leia.nextInt();
		
		System.out.println("Informe a quantidade do produto: ");
		quant = leia.nextInt();
		
		switch(itens) {
		case 1:
			total = (quant * 10.00f);
			System.out.printf("Produto: Cachorro quente \n" + "valor total é R$ %.2f" , total );
			break;
		case 2:
			total = (quant * 15.00f);
			System.out.printf("Produto: X-Salada \n" + "valor total é R$ %.2f" , total );
			break;
		case 3:
			total = (quant * 18.00f);
			System.out.printf("Produto: X-Bacon \n" + "valor total é R$ %.2f" , total );
			break;
		case 4:
			total = (quant * 12.00f);
			System.out.printf("Produto: um Bauru \n" + "valor total é R$ %.2f" , total );
			break;
		case 5:
			total = (quant * 8.00f);
			System.out.printf("Produto: Refrigerante \n" + "valor total é R$ %.2f" , total );
			break;
		case 6:
			total = (quant * 13.00f);
			System.out.printf("Produto: Suco de laranja \n" + "valor total é R$ %.2f" , total );
			break;
		}
		
		leia.close();
	}

}
