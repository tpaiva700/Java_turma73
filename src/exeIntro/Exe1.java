package exeIntro;

import java.util.Scanner;

public class Exe1 {

	public static void main(String[] args) {
		//1ºVamos criar as variaveis salario e abono 
		float salario, abono, soma;
		
		//entrada do usuário
		Scanner leia1 = new Scanner(System.in);
		
		System.out.println("Por favor informe o seu salário atual: ");
		salario = leia1.nextFloat();
		
		System.out.println("informe o valor do abono: ");
		abono = leia1.nextFloat();
		
		soma = salario + abono;
		
		System.out.println("Esse é o seu novo salário: " + soma);
		
	}

}
