package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String tipo;
		String nome;
		int numConta = 0;
		int op = 1;
		int operacao = 0;
		double depositar = 0.0;
		double sacar = 0.0;

		System.out.println("Qual tipo de conta desaja abrir?");
		System.out.println("'cc' para Conta Corrente");
		System.out.println("'cp' para Conta Poupança");
		tipo = sc.nextLine();

		System.out.println("Digite seu nome: ");
		nome = sc.nextLine();

		if (numConta == 0) {
			numConta = 0001;
		} else {
			numConta += 0001;
		}

		ContaBanco conta1 = new ContaBanco(numConta, nome);
		conta1.abrirConta(tipo);
		System.out.println(conta1.resumoConta());

		while (op == 1) {

			System.out.println();
			System.out.println("Qual operação deseja fazer?");
			System.out.println("1. Saldo;");
			System.out.println("2. Depositar;");
			System.out.println("3. Sacar;");
			System.out.println("4. Fechar Conta;");
			System.out.println("5. Sair.");
			operacao = sc.nextInt();

			switch (operacao) {
			case 1:
				System.out.println("Saldo: R$ " + conta1.getSaldo());
				break;

			case 2:
				if (conta1.isStatus()) {
					System.out.println("Valor para depósito: ");
					depositar = sc.nextDouble();
					conta1.depositar(depositar);
					System.out.println("Seu saldo agora é: R$ " + conta1.getSaldo());
				} else {
					System.out.println("Conta fechada, abra a conta para depositar!");
				}
				break;

			case 3:
				if (conta1.isStatus()) {
					if (conta1.getSaldo() > sacar) {
						System.out.println("Valor para saque: ");
						sacar = sc.nextDouble();
						conta1.sacar(sacar);
						System.out.println("Seu saldo agora é: R$ " + conta1.getSaldo());
					} else {
						System.out.println("Limite insuficiente!");
					}
				} else {
					System.out.println("É necessário abrir a conta para sacar!");
				}
				break;

			case 4:
				if (conta1.getSaldo() > 0) {
					System.out.println("Você precisa sacar o restante!");
				} else if (conta1.getSaldo() < 0) {
					System.out.println("Você está devendo, fale com o gerente!");
				} else {
					conta1.setStatus(false);
					System.out.println("Conta fechada com sucesso!");
				}
				break;

			case 5:
				op = 0;
				break;

			}
		}

		sc.close();
	}

}
