package cartas;

public class Criatura extends Carta {
	private int ataque;
	private int defesa;
	private String passiva;
	
	public Criatura(String nome, int custoMana, int ataque, int defesa, String passiva) {
		super(nome, custoMana);
		this.ataque = ataque;
		this.defesa = defesa; 
		this.passiva = passiva;
	}
	
	// contrutor cópia
	public Criatura(Criatura x) {
		super(x.getNome(), x.getCustoMana());
		this.ataque = x.getAtaque();
		this.defesa = x.getDefesa(); 
		this.passiva = x.getPassiva();
	}
	
	public int getAtaque() {
		return this.ataque;
	}
	
	public int getDefesa() {
		return this.defesa;
	}
	
	public String getPassiva() {
		return this.passiva;
	}
	
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	
	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}
}
