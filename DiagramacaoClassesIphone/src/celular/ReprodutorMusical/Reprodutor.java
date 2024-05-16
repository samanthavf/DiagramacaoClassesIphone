package celular.ReprodutorMusical;

import java.util.Scanner;

import celular.Menu.Menu;

public class Reprodutor extends Menu implements ComportamentosReprodutor, Runnable {
	
	Scanner sc  = new Scanner(System.in);
	int musicaSelecionada = 0;
	 
	@Override
	public void tocar() {
		System.out.println("Carregando música selecionada...\n");
		
	}

	@Override
	public void pausar() {
		System.out.println("\nPause");
		
		
	}
	
	@Override
	public void selecionarMusica() throws InterruptedException {
		System.out.println("                                                   ------ 0|<-Voltar ----");
		System.out.println("-----------------------------------------------------------------------");
		System.out.println(" --------------------------------- MP3 ------------------------------- ");
		System.out.println("--------------------- ESCOLHA A MÚSICA QUE DESEJA  --------------------");
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("| 1 - Aha- Hunting high and low    |");
		System.out.println("| 2 - Sade- Smooth Operator        |");
		System.out.println("| 3 - Kid Abelha- Lágrimas e chuva |");
		System.out.println("| 4 - The Bangles- Eternal Flame   |");
		System.out.println("| 5 - Beatles- Eleanor Rigby       |");
		
		 musicaSelecionada = sc.nextInt();
		 tocarMusica(musicaSelecionada);
	}
	
	
	 public void tocarMusica(int musicaSelecionada) throws InterruptedException {
	
			switch (musicaSelecionada) {
			case 1:
				tocar();
				Thread.sleep(1500);
				
				System.out.println("Tocando Aha - Hunting high and low...\n");
				
				Thread.sleep(1500);
				
				System.out.println("Here I am\r\n"
						+ "And within the reach of my hands\r\n");
				
				
				Thread.sleep(1000);
				
				System.out.println("She sounds asleep\r\n");
				
				Thread.sleep(1000);
				System.out.println("And she's sweeter now than the wildest dream\r\n"
						+ "Could have seen her\r\n");
				
				Thread.sleep(1000);
				System.out.println( "And I watch her slipping away\r\n"
						+ "Though I know I'll be\r\n");
				
				Thread.sleep(1000);
				System.out.println("Hunting high and low\r\n");
				
				Thread.sleep(1000);
				System.out.println("High\r\n"
						+ "There's no end to the lengths\r\n");
				
				Thread.sleep(1000);
				System.out.println("I'll go to\r\n");
				
				Thread.sleep(1000);
				System.out.println( "Hunting high and low\r\n");
				
				Thread.sleep(1000);
				System.out.println("High\r\n");
				
				Thread.sleep(1000);
				System.out.println("There's no end\r\n");
				
				Thread.sleep(1000);
				System.out.println("To the lengths I'll go\r\n");
				
				Thread.sleep(1000);
				System.out.println( "To find her again\r\n");
				
				Thread.sleep(1000);
				System.out.println("Upon this my dreams are depending\r\n"
						+ "Through the dark\r\n");
				
				pausar(); 

				Thread.sleep(2500);
				
				System.out.println("\nReproduzir..\n");
				
				Thread.sleep(1000);
				System.out.println("I sense the pounding of her heart\r\n"
						+ "Next to mine\r\n");
				
				Thread.sleep(1000);
				System.out.println("She's the sweetest love I could find\r\n"
						+ "And so I guess I'll be\r\n");
				Thread.sleep(1000);
				System.out.println("Hunting high and low\r\n"
						+ "High\r\n");
				Thread.sleep(1000);
				System.out.println("There's no end to the lengths\r\n"
						+ "I'll go to\r\n");
				Thread.sleep(1000);
				System.out.println("High and low\r\n"
						+ "High\r\n");
				Thread.sleep(1000);
				System.out.println("Do you know what it means to love you?\r\n");
				Thread.sleep(1000);
				System.out.println("I'm hunting high and low\r\n"
						+ "And now she's telling me\r\n");
				Thread.sleep(1000);
				System.out.println("She's got to go away\r\n"
						+ "I'll always be hunting high and low\r\n");
				Thread.sleep(1000);
				System.out.println("Hungry for you (and now she's telling me)\r\n"
						+ "Watch me tearing myself to pieces\r\n");
				Thread.sleep(1000);
				System.out.println("Hunting high and low\r\n"
						+ "High\r\n");
				Thread.sleep(1000);
				System.out.println("There's no end to the lengths\r\n");
				Thread.sleep(1000);
				System.out.println( "I'll go to, oh, oh, oh, oh\r\n");
				Thread.sleep(1000);
				System.out.println("For you, I'll be\r\n");
				Thread.sleep(1000);
				System.out.println("Hunting high and low\n");
				
				selecionarMusica();
				break;
				
			case 2:
				tocar();
				Thread.sleep(1500);
				
				System.out.println("Tocando Sade - Smooth Operator...\n");
				
				Thread.sleep(1500);
				
				System.out.println("Diamond life, lover boy\r\n"
						+ "He move in space with minimum waste and maximum joy\r\n");
				
				Thread.sleep(1000);
				System.out.println("City lights and business nights\r\n");
				Thread.sleep(1000);
				System.out.println("When you require streetcar desire for higher heights\r\n"
						+ "No place for beginners or sensitive hearts\r\n");
				Thread.sleep(1000);
				System.out.println( "When sentiment is left to chance\r\n"
						+ "No place to be ending but somewhere to start\r\n");
				Thread.sleep(1000);
				System.out.println("No need to ask, he's a smooth operator\r\n");
				Thread.sleep(1000);
				System.out.println("Smooth operator\r\n");
				Thread.sleep(1000);
				System.out.println("Smooth operator\r\n");
				Thread.sleep(1000);
				System.out.println("Smooth operator\r\n");
				Thread.sleep(1000);
				System.out.println( "Coast to coast, LA to Chicago, western male\r\n");
				Thread.sleep(1000);
				System.out.println("Across the north and south, to Key Largo, love for sale\r\n"
						+ "Face to face, each classic case\r\n");
				Thread.sleep(1000);
				System.out.println( "We shadow box and double cross\r\n");
				Thread.sleep(1000);
				System.out.println("Yet need the chase\r\n");
				Thread.sleep(1000);
				System.out.println("A license to love, insurance to hold\r\n"
						+ "Melts all your memories and change into gold\r\n");
				Thread.sleep(1000);
				System.out.println( "His eyes are like angels but his heart is cold\r\n");
				Thread.sleep(1000);
				System.out.println( "No need to ask, he's a smooth operator\r\n");
				Thread.sleep(1000);
				System.out.println("Smooth operator\r\n");
				Thread.sleep(1000);
				System.out.println("Smooth operator\r\n");
				Thread.sleep(1000);
				System.out.println("Smooth operator\r\n");
				Thread.sleep(1000);
				System.out.println("Coast to coast, LA to Chicago, western male\r\n");
				Thread.sleep(1000);
				System.out.println("Across the north and south, to Key Largo, love for sale\r\n");
				Thread.sleep(1000);
				System.out.println("Smooth operator\r\n");
				Thread.sleep(1000);
				System.out.println("Smooth operator\r\n");
				Thread.sleep(1000);
				System.out.println("Smooth operator\r\n");
				Thread.sleep(1000);
				System.out.println("Smooth operator");
				
				pausar(); 

				Thread.sleep(2500);
				
				System.out.println("\nReproduzir..\n");
				
				Thread.sleep(1000);
				
				System.out.println("A license to love, insurance to hold\r\n"
				        + "Melts all your memories and change into gold\r\n");
				
				Thread.sleep(1000);
				System.out.println("His eyes are like angels but his heart is cold\r\n");
				Thread.sleep(1000);
				System.out.println("No need to ask, he's a smooth operator\r\n");
				Thread.sleep(1000);
				System.out.println("Smooth operator\r\n");
				Thread.sleep(1000);
				System.out.println("Smooth operator\r\n");
				Thread.sleep(1000);
				System.out.println("Smooth operator\r\n");
				Thread.sleep(1000);
				System.out.println( "Coast to coast, LA to Chicago, western male\r\n");
				Thread.sleep(1000);
				System.out.println("Across the north and south, to Key Largo, love for sale\r\n");
				Thread.sleep(1000);
				System.out.println("Smooth operator\r\n");
				Thread.sleep(1000);
				System.out.println("Smooth operator\r\n");
				Thread.sleep(1000);
				System.out.println("Smooth operator\r\n");
				Thread.sleep(1000);
				System.out.println("Smooth operator\n");
				Thread.sleep(1000);
				System.out.println();
				
				selecionarMusica();
				break;
				
			case 3:
				tocar();
				Thread.sleep(1500);
				
				System.out.println("Tocando Kid Abelha - Lágrimas e chuva...\n");
				
				Thread.sleep(1500);
				
				System.out.println("Eu perco o sono e choro\r\n"
						+ "Sei que quase desespero\r\n"
						+ "Mas não sei por quê\r\n");
				
				Thread.sleep(1000);
				
				System.out.println("A noite é muito longa\r\n"
						+ "Eu sou capaz de certas coisas\r\n"
						+ "Que eu não quis fazer\r\n");
				
				Thread.sleep(1000);
				
				System.out.println("Será que alguma coisa\r\n"
						+ "Nisso tudo, faz sentido?\r\n");
				
				Thread.sleep(1000);
				
				System.out.println("A vida é sempre um risco\r\n"
						+ "Eu tenho medo\r\n");
				
				Thread.sleep(1000);
				
				System.out.println("Lágrimas e chuva\r\n"
						+ "Molham o vidro da janela\r\n"
						+ "Mas ninguém me vê\r\n");
				
				Thread.sleep(1000);
				
				System.out.println("O mundo é muito injusto\r\n"
						+ "Eu dou plantão dos meus problemas\r\n"
						+ "Que eu quero esquecer\r\n");
				
				Thread.sleep(1000);
				
				System.out.println("Será que existe alguém\r\n"
						+ "Ou algum motivo importante\r\n");
				
				Thread.sleep(1000);
				
				System.out.println("Que justifique a vida\r\n"
						+ "Ou pelo menos esse instante\r\n");
				
				pausar(); 
				
					Thread.sleep(2500);
					
					System.out.println("\nReproduzir..\n");
					
					Thread.sleep(1000);
					
					System.out.println("Eu vou contando as horas\r\n"
							+ "E fico ouvindo passos\r\n");
					
					Thread.sleep(1000);
					
					System.out.println("Quem sabe o fim da história\r\n"
							+ "De mil e uma noites\r\n");
					
					Thread.sleep(1000);
					
					System.out.println("De suspense no meu quarto\r\n");
					
					Thread.sleep(1000);
					
					System.out.println("Eu perco o sono e choro\r\n"
							+ "Sei que quase desespero\r\n");
					
					Thread.sleep(1000);
					
					System.out.println( "Mas não sei por quê\r\n"
							+ "(Não sei por quê)\n");

					selecionarMusica();
				break;
			
			case 4:
				tocar();
				Thread.sleep(1500);
				
				 System.out.println("Tocando The Bangles - Eternal Flame...\n");
				 
				Thread.sleep(1500);
				 
				System.out.println("Close your eyes, give me your hand, darling\r\n"
						+ "Do you feel my heart beating?\r\n");
				
				Thread.sleep(1000);
				
				System.out.println("Do you understand? Do you feel the same?\r\n"
						+ "Am I only dreaming?\r\n");
				
				Thread.sleep(1000);
				
				System.out.println("Is this burning an eternal flame?\r\n");
				
				Thread.sleep(1000);
				
				System.out.println( "I believe it's meant to be, darling\r\n"
				+ "I watch you when you are sleeping\r\n"
				+ "You belong with me\r\n");
				
				Thread.sleep(1000);
				
				System.out.println("Do you feel the same? Am I only dreaming?\r\n");
				
				Thread.sleep(1000);
				
				System.out.println("Or is this burning (burning) an eternal flame?\r\n");
				
				Thread.sleep(1000);
				
				System.out.println("Say my name\r\n"
						+ "Sun shines through the rain\r\n"
						+ "A whole life so lonely\r\n"
						+ "And then come and ease the pain\r\n");
				
				Thread.sleep(1000);
				
				System.out.println("I don't want to lose this feeling, oh\r\n"
						+ "Say my name\r\n"
						+ "Sun shines through the rain\r\n");
				
				Thread.sleep(1000);
				
				System.out.println("A whole life so lonely\r\n"
						+ "And then come and ease the pain\r\n");
				
				Thread.sleep(1000);
				
				System.out.println( "I don't want to lose this feeling, oh\r\n"
						+ "Close your eyes, give me your hand\r\n"
						+ "Do you feel my heart beating?\r\n"
						+ "Do you understand? Do you feel the same?\r\n"
						+ "Am I only dreaming?\r\n");
				
				pausar(); 

				Thread.sleep(2500);
				
				System.out.println("\nReproduzir..\n");
				
				Thread.sleep(1000);
				
				System.out.println("Or is this burning an eternal flame?\r\n"
						+ "Close your eyes, give me your hand, darling\r\n");
				
				System.out.println("Do you feel my heart beating?\r\n");
				
				Thread.sleep(1000);
				
				System.out.println("Do you understand? Do you feel the same?\r\n"
						+ "Am I only dreaming?\r\n"
						+ "Is this burning an eternal flame?\r\n");
				
				Thread.sleep(1000);
				
				System.out.println( "Close your eyes, give me your hand, darling\r\n"
						+ "Do you feel my heart beating?\r\n"
						+ "Do you understand? Do you feel the same?\r\n"
						+ "Am I only dreaming?\r\n");
				
				Thread.sleep(1000);
				
				System.out.println("Oh (an eternal flame)\r\n"
						+ "Close your eyes, give me your hand, darling\r\n"
						+ "Do you feel my heart beating?\r\n");
				
				
				
				System.out.println("Do you understand? Do you feel the same?\r\n"
						+ "Am I only dreaming?\r\n"
						+ "Is this burning an eternal flame?\r\n");
				
				Thread.sleep(1000);
				
				System.out.println("Close your eyes, give me your hand...\n");
				
				selecionarMusica();
				break;
				
			case 5:
				tocar();
				Thread.sleep(1500);
				
				 System.out.println("Tocando Beatles - Eleanor Rigby...\n");
				 
				 Thread.sleep(1500);
				 
				System.out.println("Ah, look at all the lonely people\r\n"
						+ "Ah, look at all the lonely people\r\n");
				
				
				Thread.sleep(1000);
				
				System.out.println("Eleanor Rigby\r\n");
				
				Thread.sleep(1000);
				
				System.out.println("Picks up the rice in the church where a wedding has been\r\n"
						+ "Lives in a dream\r\n");
				
				Thread.sleep(1000);
				
				System.out.println("Waits at the window\r\n"
						+ "Wearing the face that she keeps in a jar by the door\r\n"
						+ "Who is it for?\r\n");
				
				Thread.sleep(1000);
				
				System.out.println("All the lonely people\r\n"
						+ "Where do they all come from?\r\n"
						+ "All the lonely people\r\n"
						+ "Where do they all belong?\r\n");
				
				Thread.sleep(1000);
				
				System.out.println("Father McKenzie\r\n");
				
				Thread.sleep(1000);
				
				System.out.println("Writing the words of a sermon that no one will hear\r\n"
						+ "No one comes near\r\n"
						+ "Look at him working\r\n"
						+ "Darning his socks in the night when there's nobody there\r\n"
						+ "What does he care?\r\n");
				
				Thread.sleep(1000);
				
				System.out.println("All the lonely people\r\n"
						+ "Where do they all come from?\r\n"
						+ "All the lonely people\r\n"
						+ "Where do they all belong?\r\n");
				
				Thread.sleep(1000);
				
				System.out.println("Ah, look at all the lonely people\r\n" +
						"\nAh, look at all the lonely people\r\n");
				
				Thread.sleep(1000);
				
				System.out.println("Eleanor Rigby\r\n");
				
				Thread.sleep(1000);
				
				System.out.println("Died in the church and was buried along with her name\r\n"
						+ "Nobody came\r\n");
				
				Thread.sleep(1000);
				
				System.out.println("Father McKenzie\r\n"
						+ "Wiping the dirt from his hands as he walks from the grave\r\n"
						+ "No one was saved\r\n");
				
				Thread.sleep(1000);
				
				System.out.println("All the lonely people (ah, look at all the lonely people)\r\n"
						+ "Where do they all come from?\r\n"
						+ "All the lonely people (ah, look at all the lonely people)\r\n"
						+ "Where do they all belong? \n");
				
				selecionarMusica();
				break;
				
			case 0:
				celular();
				break;
			default:
				System.out.printf("Música não encontrada.");
				voltar();
			}
	 }
	
	public void voltar() throws InterruptedException {
		selecionarMusica();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
