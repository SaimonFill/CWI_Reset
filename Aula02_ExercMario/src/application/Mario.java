package application;

public class Mario {

	private String nome;
	private int idade = 0;
	private double altura = 0.0;
	private int estamina = 0;
	private boolean crescer;
	private boolean rapido;

	public Mario(String nome, int idade, double altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.estamina = 100;
		this.crescer = false;
		this.rapido = false;
	}

	public void perderEstamina() {
		estamina -= 10;
		if(estamina < 0) {
			estamina = 0;
		}
	}
	
	public void ganhaEstamina() {
		estamina += 5;
		if(estamina > 100) {
			estamina = 100;
		}
	}
	
	public void crescer() {
		altura = altura * 2;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAltura() {
		return this.altura;
	}

	public void setEstamina(int estamina) {
		this.estamina = estamina;
	}

	public int getEstamina() {
		return this.estamina;
	}

	public void setCrescer(boolean crescer) {
		this.crescer = crescer;
	}

	public boolean getCrescer() {
		return this.crescer;
	}

	public void setRapido(boolean rapido) {
		this.rapido = rapido;
	}

	public boolean getRapido() {
		return this.rapido;
	}

	void imprimeCaracteristicas() {
		System.out.println("Nome: " + getNome() + "\nEstamina: " + getEstamina() + "% " + "\nIdade: " + getIdade()
				+ "\nAltura: " + getAltura());
	}
}
