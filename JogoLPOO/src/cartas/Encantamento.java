package cartas;

public class Encantamento extends Carta {
	private String efeito;
	
	public Encantamento(String nome, int custoMana, String efeito) {
		super(nome, custoMana);
		this.efeito = efeito;
	}
	
	// contrutor cópia
	public Encantamento(Encantamento x) {
		super(x.getNome(), x.getCustoMana());
		this.efeito = x.getEfeito();
	}
	
	public String getEfeito() {
		return this.efeito;
	}
	
}
