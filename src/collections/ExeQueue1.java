package collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExeQueue1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Scanner leia2 = new Scanner(System.in);
		Queue<String> clientes = new LinkedList<String>();
		int opt = 1;
		String nome;
		
		
        
	while (opt > 0) {
		System.out.println("1: Adicionar um novo Cliente na fila");
        System.out.println("2: Listar todos os Clientes na fila");
        System.out.println("3: Chamar (retirar) uma pessoa da fila");
        System.out.println("0: Sair do programa");
		System.out.print("Escolha uma opção: ");
        opt = leia.nextInt();
        switch (opt) {
        case 1 : 
        	System.out.println("Fila: ");
        	System.out.println(clientes);
        	System.out.println("Informe o nome do novo Cliente: ");
        	nome = leia2.nextLine();
        	clientes.add(nome);
        	System.out.println(nome + " Cliente Adicionado!");
        	break;
        	
        case 2 :
        	System.out.println("Lista de Clientes na Fila: ");
        	System.out.println(clientes);
        case 3 : 
        	if(clientes.isEmpty()) {
        		System.out.println("A fila está vazia");
        	}else {
        	System.out.println(clientes.remove());
        	System.out.println("O Cliente foi Chamado! ");
        	
        }
        	
	}
	
	}
	System.out.println("Programa Finalizado!");
	
	leia.close();
	}

}

