package principal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import cartas.*;

public class Jogador {
	private String nome;
	private int xp;
	private int nivel;
	private ArrayList<Carta> deck;
	private ArrayList<Carta> mao;
	private ArrayList<Carta> campo;
	private ArrayList<Carta> cemiterio;
	private int vida;
	private int mana;
	private int cristalDeMana;

	public Jogador(String nome) {
		this.nome = nome;
		this.xp = 0;
		this.nivel = 1;
		this.deck = new ArrayList<Carta>();
		this.mao = new ArrayList<Carta>();
		this.campo = new ArrayList<Carta>();
		this.cemiterio = new ArrayList<Carta>();
		this.vida = 20;
		this.cristalDeMana = 0;
		carregarOuCriarDados();
	}

	private void carregarOuCriarDados() {
		String nomeArquivo = "dados-" + nome + ".txt"; // criar um arquivo pra cada jogador
		File arquivo = new File(nomeArquivo);

		if (arquivo.exists()) {
			try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
				this.nivel = Integer.parseInt(leitor.readLine());
				this.xp = Integer.parseInt(leitor.readLine());
				// Adicionar forma de ler o deck
			} catch (Exception e) {
				throw new RuntimeException("Erro ao carregar os dados do jogador " + nome, e);
			}
		} else {
			salvarDados();
		}
	}

	public void salvarDados() {
		String nomeArquivo = "dados-" + this.nome + ".txt";
		try (BufferedWriter escritor = new BufferedWriter(new FileWriter(nomeArquivo))) {
			escritor.write(this.nivel + "\n");
			escritor.write(this.xp + "\n");
			// Adicionar forma de salvar o deck posteriormente
		} catch (Exception e) {
			throw new RuntimeException("Erro ao salvar os dados do jogador " + nome, e);
		}
	}
	
	public void fasePrincipal() {
	    @SuppressWarnings("resource") // por algum motivo não posso fechar o scanner no fim do código
		Scanner scanner = new Scanner(System.in);
	    System.out.println("\nFase Principal de " + nome);
	    
	    while (true) {
		    System.out.println("Mana disponível: " + this.mana);
		    System.out.println("Cartas na mão:");
	
		    // Exibe cartas na mão
		    for (int i = 0; i < this.mao.size(); i++) {
		        Carta carta = this.mao.get(i);
		        System.out.println((i + 1) + ". " + carta.getNome() + " (Custo: " + carta.getCustoMana() + ")");
		    }
	
		    // Escolher carta para jogar
		    System.out.print("Escolha o índice da carta para jogar (ou 0 para pular fase): ");
		    int escolha = scanner.nextInt() - 1;
	
		    if (escolha >= 0 && escolha < this.mao.size()) {
		        Carta cartaEscolhida = this.mao.get(escolha);
		        if (this.mana >= cartaEscolhida.getCustoMana()) {
		            this.jogarCarta(cartaEscolhida); // Joga a carta
		            this.mana -= cartaEscolhida.getCustoMana();
		            System.out.println("Jogou: " + cartaEscolhida.getNome());
		        } else {
		            System.out.println("Mana insuficiente para jogar esta carta.");
		        }
		    } else if (escolha == -1) {
		        System.out.println("Fase Principal encerrada.");
		        break;
		    } else {
		        System.out.println("Escolha inválida.");
		    }
		    
		}
	    
	    
	}
	
	
	public void primeiraMao() {
		for (int i = 0; i < 5; i++) {
			this.mao.add(deck.remove(0));
		}
	}
	
	public int comprarCarta() {
		if (this.deck.size() > 0) {
			this.mao.add(this.deck.remove(0)); // remove a carta do deck e adiciona à mão
			System.out.println("Carta comprada!");
			return 1; // indicar sucesso
		}
		return 0; // indica que não há mais cartas no deck
	}
	
	public void jogarCarta(Carta carta) {
		int i = this.mao.indexOf(carta);
		this.campo.add(this.mao.remove(i));
	}
	
	public void destruirCarta(Carta carta) {
		int i = this.campo.indexOf(carta); // pega o indice da carta no ArrayList campo
		this.cemiterio.add(this.campo.remove(i)); // remove a carta do campo e adiciona ao cemitério do jogador
	}
	
	public void atualizarMana(int cristalDeMana) {
		this.mana = cristalDeMana;
	}

	public void adicionarCristal() {
		if (this.cristalDeMana < 10) {
			this.cristalDeMana++;
		}
	}
	
	public int getCristalDeMana() {
		return this.cristalDeMana;
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

	public int aumentarXp() { // lógica de progressão de xp e nível
		int xpAumentado = 50 + (int)(Math.random() * 51); // a cada partida o jogador pode ganhar de 50 a 100 de xp
		this.xp += xpAumentado;
		if (this.xp >= 48 + 2 * this.nivel * this.nivel) {
			this.nivel++;
			this.xp -= 48 + 2 * this.nivel * this.nivel; 
			System.out.println("Nível aumentado!");
		}
		salvarDados();
		return xpAumentado;
	}

	// métodos que vou usar no campo de batalha
	
	public ArrayList<Carta> getDeck() {
		return deck;
	}

	public void setDeck(ArrayList<Carta> deck) {
		this.deck = deck;
	}

	public ArrayList<Carta> getMao() {
		return mao;
	}

	public void setMao(ArrayList<Carta> mao) {
		this.mao = mao;
	}

	public ArrayList<Carta> getCampo() {
		return campo;
	}

	public void setCampo(ArrayList<Carta> campo) {
		this.campo = campo;
	}

	public ArrayList<Carta> getCemiterio() {
		return cemiterio;
	}

	public void setCemiterio(ArrayList<Carta> cemiterio) {
		this.cemiterio = cemiterio;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}
	

}
