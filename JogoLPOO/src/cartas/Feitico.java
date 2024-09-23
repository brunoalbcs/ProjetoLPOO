package cartas;

public class Feitico extends Carta {
	private String efeito;
	
	public Feitico(String nome, int custoMana, String efeito) {
		this.nome = nome;
		this.custoMana = custoMana;
		this.efeito = efeito;
	}
}
