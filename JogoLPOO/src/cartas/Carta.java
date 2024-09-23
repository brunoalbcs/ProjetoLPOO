package cartas;

public abstract class Carta {
	protected String nome;
	protected int custoMana;
	
	
	
	public String getNome() {
		return this.nome;
	}
	public int getCustoMana() {
		return this.custoMana;
	}
}