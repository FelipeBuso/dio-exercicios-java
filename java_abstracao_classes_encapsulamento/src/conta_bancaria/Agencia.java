package conta_bancaria;

import java.util.Scanner;

public class Agencia {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		var option = -1;
		System.out.println("Informe o valor de abertura da sua conta");
		double valor = scanner.nextDouble();
		var conta = new Conta(valor);
		do {
			System.out.println("Digite o número da operação desejada");
			System.out.println("1 - Consultar Saldo");
			System.out.println("2 - Consultar Cheque Especial");
			System.out.println("3 - Depósito");
			System.out.println("4 - Saque");
			System.out.println("5 - Pagamento de conta");
			System.out.println("6 - Checa limite usado");
			System.out.println("0 - Sair");
			option = scanner.nextInt();
			
			switch (option) {
				case 1 -> {
					double saldo = conta.getSaldo();
					System.out.println("Saldo: " + saldo);
					}
				case 2 -> {
					double limite = conta.getLimite();
					System.out.println("Cheque especial: " + limite);
					}
				case 3 -> {
					System.out.println("Informe o valor do depósito");
					double deposito = scanner.nextDouble();
					conta.deposito(deposito);
					}
				case 4 -> {
					System.out.println("Informe o valor do saque");
					double saque = scanner.nextDouble();
					conta.saque(saque);
					}
				case 5 -> {
					System.out.println("Informe o valor do pagamento");
					double pagamento = scanner.nextDouble();
					conta.pagamento(pagamento);
					}
				case 6 -> conta.limiteUsado();
			}
		} while (option != 0);
		

	}
}
