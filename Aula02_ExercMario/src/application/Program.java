package application;

public class Program {

	public static void main(String[] args) {
		
		Mario mario = new Mario();
		mario.nome = "Mario Bros";
		mario.corCamisa = "vermelha";
		mario.corMacacao = "azul";
		mario.caracteristicas();
		mario.poderCrescer();
		mario.superVelocidade();
		mario.poderes();
	}

}
