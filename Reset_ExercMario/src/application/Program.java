package application;

public class Program {

	public static void main(String[] args) {

		Mario mario = new Mario("Mario", 40, 1.60);
		Luigi luigi = new Luigi("Luigi", 37, 1.80);
		Yoshi yoshi = new Yoshi("Yoshi", 94, 0.85);

		mario.imprimeCaracteristicas();
		mario.crescer();
		mario.imprimeCaracteristicas();
		System.out.println("----------------");

		luigi.imprimeCaracteristicas();
		luigi.crescer();
		luigi.imprimeCaracteristicas();
		System.out.println("----------------");

		yoshi.imprimeCaracteristicas();
		yoshi.crescer();
		yoshi.imprimeCaracteristicas();
		System.out.println("----------------");

		luigi.saltar();
		mario.saltar();
		yoshi.saltar();
		System.out.println("----------------");

		luigi.saltar(2);
		mario.saltar(3);
		yoshi.saltar(10);
		System.out.println("----------------");

	}
}
