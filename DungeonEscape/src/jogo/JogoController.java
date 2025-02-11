package jogo;

//ajudinha do chatgpt, não vi bem as coisa de private e public

//JogoController.java (Controller)
import java.util.Scanner; //le oq a pessoa disse

public class JogoController {
 private Jogador jogador;
 //private Monstro monstro; vão ter vários monstros, mas talvez, se tiver max um por sala, a gnt inicia o controller a cada sala?
 private JogoView view; //deixa os mapa pra dps que tiver funcionando a interação com item, monstro e porta
 private Scanner scanner;
 private GerenciadorMapa gerenciador;
 private boolean endGame;

 public JogoController(Jogador jogador/*, Monstro monstro */, JogoView view ) {
     this.jogador = jogador;
     //this.monstro = monstro;
     this.view = view;
     this.scanner = new Scanner(System.in);
     this.gerenciador = new GerenciadorMapa();
     this.endGame = false;
 }

 public void iniciarJogo() {
     view.exibirMensagem("Bem-vindo ao jogo!");
     view.exibirMensagem("Você vê a chave que precisa para abrir a próxima porta.");
     view.exibirMensagem("Mas ela está guardada por um monstro!");
     
     //view.exibirStatus(jogador, monstro);

     while (jogador.getVida() > 0 && endGame==false) {
    	 jogador.equipChave(gerenciador.getItemAtual()); //ta dando erro pq eu n quero fzr um equip pra cada tipo de item
 }
}
