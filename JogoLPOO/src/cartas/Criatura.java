package cartas;

public class Criatura extends Carta {
	private int ataque;
	private int defesa;
	private String[] habilidades;
	
	public Criatura(String nome, int custoMana, int ataque, int defesa, String[] habilidades) {
		this.nome = nome;
		this.custoMana = custoMana;
		this.ataque = ataque;
		this.defesa = defesa; 
		this.habilidades = habilidades;
	}
	
	
	public int getAtaque() {
		return this.ataque;
	}
	public int getDefesa() {
		return this.defesa;
	}
	public String[] getHabilidades() {
		return this.habilidades;
	}
}
