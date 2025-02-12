package jogo;

//GerenciadorDeSalas.java - Gerencia a troca de salas
import java.util.HashMap;
import java.util.Map;

public class GerenciadorMapa {
 private Map<Integer, Mapa> mapas; //relaciona cada mapa a um inteiro
 private int mapaAtual;

 public GerenciadorMapa() {
	 mapas = new HashMap<>();

     // .put pra adicionar a lista de mapas, o chatgpt botou a função "desenharSala" na classe mapa/ssala
     mapas.put(00, new Mapa(
    		 new Monstro("zumbi", 1, 1, 1),
    		 new Chave("carvão")
    		 ));

     mapaAtual = 00; // Começa na sala de entrada
 }

 public void mudarSala(int novoMapa) {
     if (mapas.containsKey(novoMapa)) {
         mapaAtual = novoMapa;
     } else {
         System.out.println("Esse mapa não existe.");
     }
 }

// public void desenharMapaAtual() {
//     mapas.get(mapaAtual).desenharMapa();
// }
//
 public int getMapaAtual() {
     return mapaAtual;
 }
 
 public Item getItemAtual() {
	 return mapas.get(mapaAtual).getItem(); //fazer um desse pra cada tipo de item não da
 }

 public void removerItemAtual() {
    if (mapas.containsKey(mapaAtual)) {
        mapas.get(mapaAtual).removerItem();
    }
}
}
