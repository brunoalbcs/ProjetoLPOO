package cartas;

public abstract class Carta {
	protected String nome;
	protected int custoMana;
	protected String caminho;

	public Carta(String nome, int custoMana, String caminho) {
		this.nome = nome;
		this.custoMana = custoMana;
		this.caminho = caminho;
	}

	public String getNome() {
		return this.nome;
	}

	public int getCustoMana() {
		return this.custoMana;
	}
	
	public String getCaminho() {
		return this.caminho;
	}
}