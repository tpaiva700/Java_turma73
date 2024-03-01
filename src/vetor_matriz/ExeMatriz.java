package vetor_matriz;

import java.util.Scanner;

public class ExeMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		int matriz [][] = new int [3][3];
		
		int somarPrincipal = 0;
		int somarSecundario = 0; 
		int indice;
		int colun;
		
		System.out.println("Informe os números da Matriz: ");
		
		for(indice = 0; indice < matriz.length; indice++) {
			for(colun = 0; colun < matriz.length; colun ++) {
				matriz [indice] [colun] = leia.nextInt();
			}
		}

		System.out.println("Elementos da Diagonal Principal: ");
		
		for(indice = 0; indice < matriz.length; indice ++) {
			System.out.println(matriz [indice] [indice] + " ");
			somarPrincipal += matriz [indice][indice];
		}
		
		System.out.println("Elementos da diagonal secundária: ");
        for (indice = 0; indice < 3; indice++) {
            System.out.print(matriz[indice][2 - indice] + " ");
            somarSecundario += matriz [indice][indice];
        }
        
        System.out.println("\n \nSoma dos elementos da diagonal principal:\n" + somarPrincipal);		
		System.out.println("\n \nSoma dos elementos da diagonal secundária:\n" + somarSecundario);
        
        
	}

}
