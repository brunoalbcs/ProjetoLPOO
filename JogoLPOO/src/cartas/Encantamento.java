package cartas;

public class Encantamento extends Carta {
	private String efeito;
	
	public Encantamento(String nome, int custoMana, String efeito, String caminho) {
		super(nome, custoMana, caminho);
		this.efeito = efeito;
	}
	
	// contrutor cópia
	public Encantamento(Encantamento x) {
		super(x.getNome(), x.getCustoMana(), x.getCaminho());
		this.efeito = x.getEfeito();
	}
	
	public String getEfeito() {
		return this.efeito;
	}
	
}
