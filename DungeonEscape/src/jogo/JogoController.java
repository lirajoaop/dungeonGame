package jogo;

import java.util.Scanner;

public class JogoController {
    private Jogador jogador;
    private JogoView view;
    private GerenciadorMapa gerenciador;
    private boolean endGame;

    public JogoController(Jogador jogador, JogoView view) {
        this.jogador = jogador;
        this.view = view;
        this.gerenciador = new GerenciadorMapa();
        this.endGame = false;
    }

    public void iniciarJogo() {
        view.exibirMensagem("Bem-vindo ao jogo!");
        view.exibirMensagem("Você vê a chave que precisa para abrir a próxima porta.");
        view.exibirMensagem("Mas ela está guardada por um monstro!");

        Item itemAtual = gerenciador.getItemAtual();
        
        if (itemAtual instanceof Chave) {
            if (!jogador.temChave()) {
                jogador.equip((Chave) itemAtual);
                view.exibirMensagem("Você pegou a chave!");
                gerenciador.removerItemAtual();
            } else {
                view.exibirMensagem("Você já tem a chave.");
            }
        } else if (itemAtual == null) {
            view.exibirMensagem("Não há item para pegar.");
        } else {
            view.exibirMensagem("Esse item não é uma chave.");
        }
    }
}
