package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ExemploArrayList {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		ArrayList<Double> notes = new ArrayList<Double>();
		Double numero;
		
		
		//Adicionando valores dentro do nosso ArrayList
		notes.add(7.0);
		notes.add(8.0);
		notes.add(3.0);
		
		System.out.println("\nNotas cadastradas: " + notes);
		
		System.out.println("Informe um número ");
		numero = leia.nextDouble();
		
		System.out.println("\nNotas cadastradas: " + notes.indexOf(numero));
	}

}
