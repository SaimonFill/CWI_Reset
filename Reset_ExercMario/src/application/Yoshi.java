package application;

public class Yoshi extends Personagem {

	private int qtdFrutasComidas;
	private int velocidade;
	
	public Yoshi(String nome, int idade, double altura) {
		super(nome, idade, altura);
		this.qtdFrutasComidas = 0;
		this.velocidade = 10;
	}
	
	public int getVelocidade() {
		return this.velocidade;
	}
	
	public int getFrutas() {
		return this.qtdFrutasComidas;
	}
	
	public void comerFruta() {
		this.qtdFrutasComidas += 1;
		
		if (this.qtdFrutasComidas % 2 == 0) {
			this.velocidade = this.velocidade * 2;
		}
	}

}
