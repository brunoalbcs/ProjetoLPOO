package cartas;

public abstract class Carta {
	protected String nome;
	protected int custoMana;
	
	public Carta(String nome, int custoMana) {
		this.nome = nome;
		this.custoMana = custoMana;
	}
	
	public String getNome() {
		return this.nome;
	}
	public int getCustoMana() {
		return this.custoMana;
	}
}