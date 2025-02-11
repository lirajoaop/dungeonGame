package jogo;

public class App {
	public static void main(String[] args) {
		Jogador jogador = new Jogador(10, 2, 5);
		//Inimigo inimigo = new Inimigo("Goblin", 20, 5);
		JogoView view = new JogoView(); //aho que a criação da view pode ser no construtor do controller tbm
		JogoController controller = new JogoController(jogador, /*inimigo,*/ view);

		controller.iniciarJogo();
	}
}
