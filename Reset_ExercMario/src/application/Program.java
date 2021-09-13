package application;

public class Program {

	public static void main(String[] args) {
		
		Mario mario = new Mario("Mario", 40, 1.60);
		Luigi luigi = new Luigi("Luigi", 37, 1.80);
		Yoshi yoshi = new Yoshi("Yoshi", 94, 0.85);
		
		mario.montadoYoshi();
        mario.montarNoYoshi(yoshi);
        mario.montadoYoshi();
        System.out.println("----------------");
        
        luigi.voar();
        System.out.println("----------------");

        System.out.println("Velocidade atual: " + yoshi.getVelocidade());
        yoshi.comerFruta();
        System.out.println(yoshi.getFrutas());
        System.out.println("Velocidade atual: " + yoshi.getVelocidade());
        yoshi.comerFruta();
        System.out.println(yoshi.getFrutas());
        System.out.println("Velocidade atual: " + yoshi.getVelocidade());
        yoshi.comerFruta();
        yoshi.comerFruta();
        System.out.println(yoshi.getFrutas());
        System.out.println("Velocidade atual: " + yoshi.getVelocidade());
	}
}
