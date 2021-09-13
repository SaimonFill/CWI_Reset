package application;

public class Mario extends Personagem {
	
	private Yoshi yoshi;

	public Mario(String nome, int idade, double altura) {
		super(nome, idade, altura);
	}
	
	public void montarNoYoshi(Yoshi yoshi) {
		this.yoshi = yoshi;
	}

	@Override
	public void crescer() {
		this.altura = this.altura * 1.5;
	}
	
	public void montadoYoshi() {
		if (yoshi != null) {
			System.out.println("Mario está montado no Yoshi!");
		} else {
			System.out.println("Não está montado no Yoshi!");
		}
	}
}
