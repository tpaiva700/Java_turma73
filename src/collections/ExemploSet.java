package collections;

import java.util.HashSet;
import java.util.Set;

public class ExemploSet {

	public static void main(String[] args) {
		Set<String> setFrutas = new HashSet<String>();

		// Adiciona algumas frutas na Colection Set
		setFrutas.add("Abacate");
		setFrutas.add("Banana");
		setFrutas.add("Jaboticaba");
		setFrutas.add("Kiwi");
		setFrutas.add("Maçã");
		setFrutas.add("Morango");
		setFrutas.add("Pêra");
		setFrutas.add("Jaboticaba");
		setFrutas.add("Kiwi");
		
		System.out.println("\nDados da Collection: " + setFrutas);
		
		//For Each 
		for(String fruta: setFrutas) {
			if(fruta != null) {
			System.out.println(" Posição da " + fruta + " é " + fruta.hashCode());
			}
		}
	}

}
