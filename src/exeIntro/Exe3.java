package exeIntro;

import java.util.Scanner;

public class Exe3 {
	public static void main(String[] args) {
		//Variáveis
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		Scanner leia1 = new Scanner(System.in);
		
		
		System.out.println("informe o salário bruto: ");
		salarioBruto = leia1.nextFloat();
		
		System.out.println("Informe o adicional noturno: ");
		adicionalNoturno = leia1.nextFloat();
		
		System.out.println("Informe as horas extras: ");
		horasExtras = leia1.nextFloat();
		
		System.out.println("Informe o valor do Desconto em salário do colaborador: ");
		descontos = leia1.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.printf("O valor do salário Líquido é %.2f", salarioLiquido);
		
	}
	
}
