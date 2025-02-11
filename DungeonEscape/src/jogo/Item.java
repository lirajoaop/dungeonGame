package jogo;

class Item {
    private String nome;

    public Item(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Chave extends Item {
    public Chave(String nome) {
        super(nome);
    }
}

class Equipamento extends Item {
    public Equipamento(String nome) {
        super(nome);
    }
}

class Arma extends Item {
    public Arma(String nome) {
        super(nome);
    }
}

class Capacete extends Equipamento {
    public Capacete(String nome) {
        super(nome);
    }
}

class Peitoral extends Equipamento {
    public Peitoral(String nome) {
        super(nome);
    }
}

class Escudo extends Equipamento {
    public Escudo(String nome) {
        super(nome);
    }
}