package application;

public class Mario {

	private String nome;
	private int idade;
	private double altura;
	private int estamina;
	private int moedas;
	private int vidas;

	public Mario() {
		this.nome = "Mario";
		this.idade = 40;
		this.altura = 1.5;
		this.estamina = 100;
		this.moedas = 0;
		this.vidas = 1;
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

	public void crescer() {
		this.altura = this.altura * 2;
	}

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
		System.out.println(
				"Nome: " + this.nome 
				+ "\nEstamina: " + this.estamina + "% " 
				+ "\nIdade: " + this.idade 
				+ "\nAltura: " + this.altura
				+ "\nMoedas: " + this.moedas
				+ "\nVidas: " + this.vidas);
	}
}
