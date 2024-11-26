package cartas;

public class Feitico extends Carta {
	private String efeito;
	
	public Feitico(String nome, int custoMana, String efeito, String caminho) {
		super(nome, custoMana, caminho);
		this.efeito = efeito;
	}
	
	// contrutor cópia
	public Feitico(Feitico x) {
		super(x.getNome(), x.getCustoMana(), x.getCaminho());
		this.efeito = x.getEfeito();
	}
	
	public String getEfeito() {
		return this.efeito;
	}
}
