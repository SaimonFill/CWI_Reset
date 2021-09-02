package application;

public class Mario {

	String nome;
	String corCamisa;
	String corMacacao;
	boolean crescer;
	boolean rapido;

	void caracteristicas() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Cor da Camisa: " + this.corCamisa);
		System.out.println("Cor do Macacao: " + this.corMacacao);
	}

	void poderCrescer() {
		this.crescer = true;
	}

	void superVelocidade() {
		this.rapido = true;
	}

	void poderes() {
		if (!!crescer || !!rapido) {
			if (!!crescer) {
				System.out.println("Mário está grande!");
			}
			if (!!rapido) {
				System.out.println("Mário está rápido!");
			}
		} else {
			System.out.println("Mário não está com poderes ativos!");
		}
	}
}
