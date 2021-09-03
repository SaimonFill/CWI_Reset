package application;

public class Mario {

	private String nome;
	private int idade = 0;
	private double altura = 0.0;
	private int estamina = 0;
	private boolean crescer;
	private boolean rapido;

	public Mario(String nome, int idade, double altura) {
		setNome(nome);
		this.setIdade(idade);
		this.setAltura(altura);
		this.estamina = 100;
		this.crescer = false;
		this.rapido = false;
	}

	public void setNome(String n) {
		this.nome = n;
	}

	public String getNome() {
		return this.nome;
	}

	public void setIdade(int i) {
		this.idade = i;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setAltura(double a) {
		this.altura = a;
	}

	public double getAltura() {
		return this.altura;
	}

	public void setEstamina(int e) {
		this.estamina = 50;
	}

	public int getEstamina() {
		return this.estamina;
	}

	public void setCrescer(boolean c) {
		this.crescer = c;
	}

	public boolean getCrescer() {
		return this.crescer;
	}

	public void setRapido(boolean r) {
		this.rapido = r;
	}

	public boolean getRapido() {
		return this.rapido;
	}

	void imprimePoderes() {
		if (crescer || rapido) {
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

	void imprimeCaracteristicas() {
		System.out.println("Nome: " + getNome() + "\nEstamina: " + getEstamina() + "% " + "\nIdade: " + getIdade()
				+ "\nAltura: " + getAltura());
	}
}
