package introducao;

import java.util.Scanner;

public class entradaSaida {

	public static void main(String[] args) {
		String name = "Hinata";
		
		//printLN = pula linha
		System.out.println("Olá Hyuga " + name);
		//print = não pula linhas
		//System.out.print("texto " + name);
		
		String name2;
		int idade;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe seu nome cão: ");
		name2 = leia.next();
		
		//a variavel leia vai mudando de acordo com o tipo de dados da variavel inicial: ex nome é string, idade int.
		System.out.println("Informe sua idade cão: ");
		idade = leia.nextInt();
		
		System.out.println("Seu nome é: " + name2 + " e sua idade " + idade );
	}

}
