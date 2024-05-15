package celular.AparelhoTelefonico;

public class AparelhoTelefonico implements ComportamentosAparelho, Runnable{
	private String Chamando;
	
	public void aparelhoTelefonico() throws InterruptedException {
		ligar();
		Thread.sleep(1000);
		atender();
		Thread.sleep(2500);
		iniciarCorreioVoz();
		Thread.sleep(2000);
		desligar();
	}
	
	@Override
	public void ligar() {//THREADS
		System.out.println("Ligando aparelho.\n");
	}

	@Override
	public void atender() {
		setChamando("Chamando...\n");
		System.out.println(getChamando());
			System.out.println("atendendo ligação");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("\n Olá, você alcançou o correio de voz de [Seu Nome].\n "
				+ "No momento, não posso atender sua ligação. Por favor, deixe uma mensagem\n "
				+ "após o sinal e entrarei em contato assim que possível.\n");
		
		System.out.println(" Só queria te avisar sobre a reunião amanhã às 10h.\n"
				+ " Precisamos discutir os detalhes do projeto.\n "
				+ "Se puder, me ligue de volta para confirmar.\n"
				+ " Obrigado.\n");
	}

	public void desligar() {
		System.out.println("Chamada encerrada.");
	}
	
	public String getChamando() {
		return Chamando;
	}

	public void setChamando(String chamando) {
		Chamando = chamando;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	

}
