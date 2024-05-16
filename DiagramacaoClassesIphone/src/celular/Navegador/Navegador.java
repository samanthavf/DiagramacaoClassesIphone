package celular.Navegador;

import celular.Menu.Menu;

public class Navegador extends Menu implements ComportamentosNavegador, Runnable{
	
	public void navegar() throws InterruptedException {
		exibirPagina();
		Thread.sleep(1000);
		atualizarPagina();
		Thread.sleep(2500);
		System.out.println("página atualizada.\n");
		Thread.sleep(1000);
		adicionarNovaAba();
		celular();
	}

	@Override
	public void exibirPagina() {
		System.out.println("\nexibindo página.\n");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("nova aba adicionada.\n");
	
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
