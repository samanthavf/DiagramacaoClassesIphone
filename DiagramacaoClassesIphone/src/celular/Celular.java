package celular;

import celular.AparelhoTelefonico.AparelhoTelefonico;
import celular.Navegador.Navegador;
import celular.ReprodutorMusical.Reprodutor;

public class Celular {

	public static void main(String[] args) throws InterruptedException {
		AparelhoTelefonico telefonico = new AparelhoTelefonico();
		telefonico.aparelhoTelefonico();
		
		Navegador navegador = new Navegador();
		navegador.navegar();
		
		Reprodutor reprodutor = new Reprodutor();
		reprodutor.selecionarMusica();

	}

}
