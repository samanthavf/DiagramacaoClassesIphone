package celular.Menu;

import java.util.Scanner;

import celular.AparelhoTelefonico.AparelhoTelefonico;
import celular.Navegador.Navegador;
import celular.ReprodutorMusical.Reprodutor;

public class Menu {
	Scanner sc = new Scanner(System.in);
	int opcaoSelecionada =0;
	
	public void celular() throws InterruptedException {
		System.out.println("| 1 - Telefone            |");
		System.out.println("| 2 - Internet            |");
		System.out.println("| 3 - Música              |");
		System.out.println("| 4 - Desligar Aparelho   |");
		
		opcaoSelecionada = sc.nextInt();
		operacoes(opcaoSelecionada);
	}
	
	public void operacoes(int opcaoSelecionada) throws InterruptedException {
		switch (opcaoSelecionada) {
		case 1:
			AparelhoTelefonico aparelho = new AparelhoTelefonico();
			aparelho.aparelhoTelefonico();
			break;
			
		case 2:
			Navegador navegador = new Navegador();
			navegador.navegar();
			break; 
			
			case 3:
				Reprodutor reprodutor = new Reprodutor();
				reprodutor.selecionarMusica();
			break;
			
			case 4:
				sc.close();
				System.exit(opcaoSelecionada);
				break;
				
		default:
			break;
		}
	}
}
