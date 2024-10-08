package jogador;

import java.util.ArrayList;
import cartas.*;

public class Jogador {
	private String nome;
	private int xp = 0;
	private int nivel = 0;
	private int vida;
	private int mana;
	private ArrayList<Carta> deck;
	private ArrayList<Carta> mao;
	private ArrayList<Carta> cemiterio;
	
	public Jogador(String nome, ArrayList<Carta> deck) {
		this.nome = nome;
		this.deck = deck;
	}

	public String getNome() {
		return nome;
	}

	public int getXp() {
		return xp;
	}

	public int getNivel() {
		return nivel;
	}
	
	public int getMana() {
		return mana;
	}

	public ArrayList<Carta> getMao() {
		return mao;
	}

	public ArrayList<Carta> getCemiterio() {
		return cemiterio;
	}
	
	public ArrayList<Carta> getDeck() {
		return deck;
	}

	public void setDeck(ArrayList<Carta> deck) {
		this.deck = deck;
	}
	
	public void serVida(int vida) {
		this.vida = vida;
	}
	
	public void aumentarXp(int quantidade) {
		this.xp += quantidade;
		if (this.xp >= 100 + 2*this.nivel*this.nivel ) {
			this.nivel++;
			this.xp -= 100 + 2*this.nivel*this.nivel;
			System.out.println("Nível aumentado!");
		}
	}
	
}
