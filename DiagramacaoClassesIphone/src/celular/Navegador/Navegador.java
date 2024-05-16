package celular.Navegador;

public class Navegador implements ComportamentosNavegador, Runnable{
	
	public void navegar() throws InterruptedException {
		exibirPagina();
		Thread.sleep(1000);
		atualizarPagina();
		Thread.sleep(2500);
		System.out.println("página atualizada.\n");
		Thread.sleep(1000);
		adicionarNovaAba();
	}

	@Override
	public void exibirPagina() {
		System.out.println("\nexibindo página.\n");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("nova aba adicionada.");
	
	}

	@Override
	public void atualizarPagina() {
		System.out.println("atualizando página...\n");
	
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
