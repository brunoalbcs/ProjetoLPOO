package cartas;

public class Feitico extends Carta {
	private String efeito;
	
	public Feitico(String nome, int custoMana, String efeito) {
		super(nome, custoMana);
		this.efeito = efeito;
	}
	
	// contrutor cópia
	public Feitico(Feitico x) {
		super(x.getNome(), x.getCustoMana());
		this.efeito = x.getEfeito();
	}
	
	public String getEfeito() {
		return this.efeito;
	}
}
