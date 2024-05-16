package celular.AparelhoTelefonico;

import celular.Menu.Menu;

public class AparelhoTelefonico extends Menu implements ComportamentosAparelho, Runnable{
	
	public void aparelhoTelefonico() throws InterruptedException {
		ligar();
		Thread.sleep(1000);
		atender();
		Thread.sleep(2500);
		System.out.println("atendendo ligação");
		Thread.sleep(2000);
		iniciarCorreioVoz();
		Thread.sleep(2000);
		System.out.println(" Só queria te avisar sobre a reunião amanhã às 10h.\n"
				+ " Precisamos discutir os detalhes do projeto.\n "
				+ "Se puder, me ligue de volta para confirmar.\n"
				+ " Obrigado.\n");
		Thread.sleep(1000);
		desligar();
		celular();
	}
	
	@Override
	public void ligar() {//THREADS
		System.out.println("Ligando aparelho.\n");
	}

	@Override
	public void atender() {
		System.out.println("Chamando...\n");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("\n Olá, você alcançou o correio de voz.\n "
				+ "No momento, não posso atender sua ligação. Por favor, deixe uma mensagem\n "
				+ "após o sinal e entrarei em contato assim que possível.\n");
		
	}

	public void desligar() {
		System.out.println("Chamada encerrada.");
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	

}
