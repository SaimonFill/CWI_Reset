package application;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("Teste para ver se o mario inicializa os novos atributos");
        Mario mario = new Mario();
        mario.imprimeCaracteristicas();
        System.out.println("---");

        System.out.println("Teste para ver se o mario reinicia a estamina após revigorar");
        Mario mario2 = new Mario();
        mario2.imprimeCaracteristicas();
        mario2.perderEstamina(); // desconta 10
        mario2.perderEstamina(); // desconta 10
        mario2.imprimeCaracteristicas();
        mario2.revigorar();
        mario2.imprimeCaracteristicas();
        System.out.println("---");

        System.out.println("Teste para ver se o mario atualiza a quantidade de moedas após a coleta");
        Mario mario3 = new Mario();
        mario3.imprimeCaracteristicas();
        mario3.coletarMoeda();
        mario3.coletarMoeda();
        mario3.coletarMoeda();
        mario3.imprimeCaracteristicas();
        System.out.println("---");

        System.out.println("Teste para ver se o mario ganha uma vida a cada 10 moedas coletadas");
        Mario mario4 = new Mario();
        mario4.imprimeCaracteristicas();
        mario4.coletarMoeda();
        mario4.coletarMoeda();
        mario4.coletarMoeda();
        mario4.coletarMoeda();
        mario4.coletarMoeda();
        mario4.coletarMoeda();
        mario4.coletarMoeda();
        mario4.coletarMoeda();
        mario4.coletarMoeda();
        mario4.coletarMoeda();
        mario4.imprimeCaracteristicas();
        mario4.coletarMoeda();
        mario4.coletarMoeda();
        mario4.coletarMoeda();
        mario4.coletarMoeda();
        mario4.coletarMoeda();
        mario4.coletarMoeda();
        mario4.coletarMoeda();
        mario4.coletarMoeda();
        mario4.coletarMoeda();
        mario4.coletarMoeda();
        mario4.imprimeCaracteristicas();
        System.out.println("---");

        System.out.println("Teste para ver se o mario perde uma vida após morrer");
        Mario mario5 = new Mario();
        mario5.imprimeCaracteristicas();
        //coletar 10 moedas para ganhar mais uma vida
        mario5.coletarMoeda();
        mario5.coletarMoeda();
        mario5.coletarMoeda();
        mario5.coletarMoeda();
        mario5.coletarMoeda();
        mario5.coletarMoeda();
        mario5.coletarMoeda();
        mario5.coletarMoeda();
        mario5.coletarMoeda();
        mario5.coletarMoeda();
        //verificando se ganhou uma vida
        mario5.imprimeCaracteristicas();
        //morrer
        mario5.morrer();
        //verificando se perdeu uma vida
        mario5.imprimeCaracteristicas();
        System.out.println("---");

        System.out.println("Teste para ver se o mario reinicia a estamina após morrer e ainda possuir vida");
        Mario mario6 = new Mario();
        mario5.imprimeCaracteristicas();
        //coletar 10 moedas para ganhar mais uma vida
        mario6.coletarMoeda();
        mario6.coletarMoeda();
        mario6.coletarMoeda();
        mario6.coletarMoeda();
        mario6.coletarMoeda();
        mario6.coletarMoeda();
        mario6.coletarMoeda();
        mario6.coletarMoeda();
        mario6.coletarMoeda();
        mario6.coletarMoeda();
        //perder estamina
        mario6.perderEstamina();
        //verificando se ganhou uma vida e se atualizou a estamina
        mario6.imprimeCaracteristicas();
        //morrer
        mario6.morrer();
        //verificando se perdeu uma vida e se reiniciou a estamina
        mario6.imprimeCaracteristicas();
        System.out.println("---");

        System.out.println("Teste para ver se o mario mantém a quantidade de vidas em 0 após morrer 2 vezes");
        Mario mario7 = new Mario();
        mario7.imprimeCaracteristicas();
        mario7.morrer();
        mario7.morrer();
        mario7.imprimeCaracteristicas();
        System.out.println("---");
        
	}

}
