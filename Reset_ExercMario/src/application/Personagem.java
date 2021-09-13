package application;

public abstract class Personagem {

	private String nome;
	private int idade;
	protected double altura;
	private int estamina;
	private int moedas;
	private int vidas;

	public Personagem(String nome, int idade, double altura) {
		this.nome = nome;
		this.altura = altura;
		this.idade = idade;
		this.estamina = 100;
		this.moedas = 0;
		this.vidas = 1;
	}

	public void saltar() {
		System.out.println(getNome() + " pulou " + this.altura * 0.5);
	}
	
	public void saltar(double alturaObstaculo) {
		System.out.println("Obstaculo: " + alturaObstaculo + "\n " + this.nome + "pulou " + alturaObstaculo * 1.5);
	}

	public void perderEstamina() {
		this.estamina -= 10;

		if (this.estamina < 0) {
			this.estamina = 0;
		}
	}

	public void ganharEstamina() {
		this.estamina += 5;
		if (this.estamina > 100) {
			this.estamina = 100;
		}
	}

	public abstract void crescer();

	public void revigorar() {
		this.estamina = 100;
	}

	public void morrer() {
		this.estamina = 0;
		this.vidas -= 1;

		if (this.vidas < 0) {
			this.vidas = 0;
		} else if (this.vidas > 0) {
			revigorar();
		}
	}

	public void coletarMoeda() {
		this.moedas += 1;

		if (this.moedas % 10 == 0) {
			this.vidas += 1;
		}
	}

	void imprimeCaracteristicas() {
		System.out.println("Nome: " + this.nome + "\nEstamina: " + this.estamina + "% " + "\nIdade: " + this.idade
				+ "\nAltura: " + this.altura + "\nMoedas: " + this.moedas + "\nVidas: " + this.vidas);
	}

	public String getNome() {
		return this.nome;
	}
}
