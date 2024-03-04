package metods;


public class ExemploMetodo {

	public static void main(String[] args) {
		
		//Chamando meus métodos
		somar(2, 3);
		
		System.out.println(somar(2, 3));
		
		//Se estiver no mesmo package, mas em classes diferentes:
		ExemploMetodo1.message1("OiÊ");
		
		//Se o método estiver no mesmo arquivo Java
		//message1("Sei lá");
	}
	
	//Criando nosso método
	public static int somar(int num1, int num2) {
		return num1 + num2;
	}
	
	
}
