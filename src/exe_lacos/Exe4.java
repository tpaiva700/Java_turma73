package exe_lacos;

import java.util.Scanner;

public class Exe4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String nome;
		int cod;
		float salario, reajuste;
		
		System.out.println("Qual o seu nome: ");
		nome = leia.next();
		
		System.out.println("Informe o código do seu cargo: ");
		cod = leia.nextInt();
		
		System.out.println("Informe o seu salário atual: ");
		salario = leia.nextFloat();
		
		
		switch(cod) {
		case 1:
			reajuste = salario + (0.1f * salario);
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: " + cod);
			System.out.printf("Salário: %.2f", reajuste);
			break;
		case 2:
			reajuste = salario + (0.07f * salario);
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: " + cod);
			System.out.printf("Salário: %.2f" , reajuste);
			break;
		case 3:
			reajuste = salario + (0.09f * salario);
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: " + cod);
			System.out.printf("Salário: %.2f" , reajuste);
			break;
		case 4:
			reajuste = salario + (0.06f * salario);
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: " + cod);
			System.out.printf("Salário: %.2f" , reajuste);
			break;
		case 5:
			reajuste = salario + (0.05f * salario);
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: " + cod);
			System.out.printf("Salário: %.2f" , reajuste);
			break;
		case 6:
			reajuste = salario + (0.08f * salario);
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: " + cod);
			System.out.printf("Salário: %.2f" , reajuste);
			break;
		}
		
		leia.close();
		
	}

}
