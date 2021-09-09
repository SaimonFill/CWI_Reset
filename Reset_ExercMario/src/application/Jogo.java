package application;

import java.util.Random;

public class Jogo {

	private Personagem jogador1;
	private Personagem jogador2;
	
	public Jogo(Personagem jogador1, Personagem jogador2) {
		this.jogador1 = jogador1;
		this.jogador2 = jogador2;
	}
	
	public void imprimeJogadores() {
		this.jogador1.imprimeCaracteristicas();
		this.jogador2.imprimeCaracteristicas();
	}
	
	public void jogar() {
		Random random = new Random();
		
		int coletaJogador1 = random.nextInt(30);
		int coletaJogador2 = random.nextInt(30);
		
		for (int i = 0; i < coletaJogador1; i++) {
			this.jogador1.coletarMoeda();
		}
		
		for (int i = 0; i < coletaJogador2; i++) {
			this.jogador2.coletarMoeda();
		}
		
		System.out.println(jogador1.getNome() + " coletou: " + coletaJogador1 + " moedas");
		System.out.println("Resumo do " + jogador1.getNome());
		jogador1.imprimeCaracteristicas();
		
		System.out.println("\n" + jogador2.getNome() + " coletou: " + coletaJogador2 + " moedas");
		System.out.println("Resumo do " + jogador2.getNome());
		jogador2.imprimeCaracteristicas();
	}
}
