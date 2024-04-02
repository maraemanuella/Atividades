package ContaBanco;

import java.util.Scanner;

public class ContaJava {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int NumeroDaConta = 0;
		String Agencia, NomeDoCliente;
		Double Saldo=0.0;
		
		System.out.println("Por favor, digite seu nome: ");
		NomeDoCliente = scanner.nextLine().trim();
				
	    System.out.printf("%s, digite o número da sua conta: ", NomeDoCliente);
	    NumeroDaConta = scanner.nextInt();
	    
		scanner.nextLine();

	    
	    System.out.println("Por favor, digite o número da Agência! ");
		Agencia = scanner.nextLine().trim();
		
	    System.out.println("Por favor, digite seu saldo: ");
	    Saldo = scanner.nextDouble();
	    
	    System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco,\nsua agência é %s, conta %d e seu saldo %.2f\njá está disponível para saque.", NomeDoCliente, Agencia, NumeroDaConta, Saldo);
	    

		
		
		

		
		



	    
		
	}

}
