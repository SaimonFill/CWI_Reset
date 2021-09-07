package application;

public class Lutador {
	private String nome;
	private String nascionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;

	public Lutador(String nome, String nascionalidade, int idade, double altura, double peso, int vitorias,
			int derrotas, int empates) {
		this.nome = nome;
		this.nascionalidade = nascionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}

	public void apresentar() {
		System.out.println("\nLutador: " + this.nome
				+ "\nOrigem: " + this.nascionalidade
				+ "\n" + this.idade + " anos"
				+ "\n" + this.altura + " m de altura"
				+ "\nPesando: " + this.peso + "kg"
				+ "\nGanhou: " + this.vitorias
				+ "\nPerdeu: " + this.derrotas
				+ "\nEmpatou: " + this.empates);
	}

	public void status() {
		System.out.println("\nLutador: " + this.nome
				+ "\n… um peso " + this.categoria
				+ "\nGanhou: " + this.vitorias
				+ "\nPerdeu: " + this.derrotas
				+ "\nEmpatou: " + this.empates);
	}

	public void ganharLuta() {
		setVitorias(getVitorias() + 1);
	}

	public void perderLuta() {
		setDerrotas(getDerrotas() + 1);
	}

	public void empatarLuta() {
		setEmpates(getEmpates() + 1);
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public String getNascionalidade() {
		return nascionalidade;
	}

	public void setNascionalidade(String nascionalidade) {
		this.nascionalidade = nascionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
		setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if (this.peso < 52.2) {
			this.categoria = "Inv·lido";
		} else if (this.peso <= 70.3) {
			this.categoria = "Leve";
		} else if (this.peso <= 83.9) {
			this.categoria = "MÈdio";
		} else if (this.peso <= 120.2) {
			this.categoria = "Pesado";
		} else {
			this.categoria = "Inv·lido";
		}
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

}
