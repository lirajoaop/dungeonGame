package jogo;

//JogoView.java (View)
public class JogoView {
 public void exibirMensagem(String mensagem) {
     System.out.println(mensagem);
 }

// public void exibirStatus(Personagem jogador, Inimigo inimigo) {
//     System.out.println("\n" + jogador.getNome() + " - Vida: " + jogador.getVida());
//     System.out.println(inimigo.getNome() + " - Vida: " + inimigo.getVida() + "\n");
// }
 
 
 Mapa mapa1 = new Mapa(
		 new Monstro("zumbi", 1, 1, 1),
		 new Chave("carvão")
		 );
}
