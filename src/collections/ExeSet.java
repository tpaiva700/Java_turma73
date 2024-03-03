package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ExeSet {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Set<Integer> setNum = new HashSet<Integer>();
		int cont, num;
		
		
		System.out.println("Informe 10 numeros!");
		for(cont = 0; cont < 10; cont ++) {
			num = leia.nextInt();
			setNum.add(num);
		}
		
		System.out.println("Listar dados do Set: " + setNum);
		
		
		Iterator<Integer> isetNumb = setNum.iterator();

		while (isetNumb.hasNext()) {
			System.out.println("Listar dados do Set: " + isetNumb.next());
		}
	}

}
