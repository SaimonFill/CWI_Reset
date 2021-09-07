package application;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("Teste para verificar a altura do salto do Mario");
        Personagem mario = new Personagem("Mario", 40, 1.60);
        mario.imprimeCaracteristicas();
        mario.saltar();
        System.out.println("---");

        System.out.println("Teste para verificar a altura do salto do Luigi");
        Personagem luigi = new Personagem("Luigi", 40, 1.80);
        luigi.imprimeCaracteristicas();
        luigi.saltar();
        System.out.println("---");
        
	}
}
