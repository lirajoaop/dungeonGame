package jogo;

public class Mapa {
	private Monstro monstro;
	private Item item;
	//msm pro resto dos itens que pode ter num mapa (numa sala)
	// private String[] desenho; //nome ruim, acho que tem que ser array de string pra ir uma por linha
	
	public Mapa (Monstro monstro, Item item /*, String desenho*/) {
		this.monstro = monstro;
		this.item = item;
		//this.desenho = desenho;
	}
	
	//cara eu sinto que to fazendo um laco mto grande
	//isso é pro controller puxar o monstro e o item do mapa
	public Monstro getMonstro() {
		return monstro;
	}
	
	public Item getItem() {
		return item;
	}
	
	public void removerItem() {
        this.item = null;
    }
}
