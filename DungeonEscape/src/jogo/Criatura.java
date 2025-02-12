package jogo;

class Criatura {
    protected int vida;
    protected int defesa;
    protected int ataque;

    public Criatura(int vida, int defesa, int ataque) {
        this.vida = vida;
        this.defesa = defesa;
        this.ataque = ataque;
    }

    public int getVida() {
        return vida;
    }

    public int getDefesa() {
        return defesa;
    }

    public int getAtaque() {
        return ataque;
    }

    public void receberDano(int dano) { // pra que defesa se ela não influencia no dano
        vida -= dano;
        if (vida < 0) {
            vida = 0;
        }
    }

    public void curar(int quantidade) {
        vida += quantidade;
    }
}

class Jogador extends Criatura {
    private Chave chave;
    private Arma arma;
    private Capacete capacete;
    private Peitoral peitoral; //acho que tem mto item
    private Escudo escudo;

    public Jogador(int vida, int defesa, int ataque) {
        super(vida, defesa, ataque);
        this.chave = null;
        this.arma = null;
        this.capacete = null;
        this.peitoral = null;
        this.escudo = null;
    }
    
    //dar equipamento pro jogador
    public void equip(Chave chave) {
    	this.chave = chave;
    }

    //Verificar se o jogador já tem uma chave
    public boolean temChave() {
        return this.chave != null;
    }
}

class Monstro extends Criatura {
    private String nome;

    public Monstro(String nome, int vida, int defesa, int ataque) { //kkkkk monstro tem nome e o pobe do jogador não
        super(vida, defesa, ataque);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void atacar(Criatura alvo) {
        int dano = Math.max(ataque - alvo.getDefesa(), 0);
        System.out.println(nome + " te atacou e te causou " + dano + " de dano!");
        alvo.receberDano(dano);
    }
}
