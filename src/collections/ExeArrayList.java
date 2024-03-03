package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExeArrayList {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		// ArrayList
		ArrayList<String> cores = new ArrayList<String>();
		String cor;
		int cont;
		
		System.out.println("Informe 5 cores!");
		for(cont = 0; cont < 5; cont ++) {
			cor = leia.nextLine();
			cores.add(cor);
		}
		
		 System.out.println("Listar todas as cores: " + cores);
		 
		 //Ordenando por ordem crescente
		 Collections.sort(cores);
		 System.out.println("Ordenar as cores: " + cores);
		 
		 
	}

}
