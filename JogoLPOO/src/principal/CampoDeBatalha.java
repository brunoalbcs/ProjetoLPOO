package principal;

import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class CampoDeBatalha {
	private Jogador p1, p2;
	private boolean jogadorAtual; // true para p1, false para p2
	
	public CampoDeBatalha(Jogador p1, Jogador p2) {
		this.p1 = p1;
		this.p2 = p2;
		this.p1.criarDeck(); // criar os decks
		this.p2.criarDeck();
		Collections.shuffle(this.p1.getDeck()); // embaralhar os decks
		Collections.shuffle(this.p2.getDeck());
		this.p1.primeiraMao(); // cada jogador puxa as 5 primeiras cartas do deck embaralhado
		this.p2.primeiraMao();
		jogadorInicial(); // define true ou false aleatoriamente para a variável 'jogadorAtual'
		
	}
	
	public void jogadorInicial() {
		Random random = new Random();
		jogadorAtual = random.nextBoolean(); // true = p1; false = p2
	}
	
	public void alternarJogador() {
		jogadorAtual = !jogadorAtual; // alterna entre true e false onde cada valor representa um dos jogadores
	}
	
	
	
	public void faseDeCombate() {
        escolherAtacantes();
        escolherBloqueadoras();
        resolverCombate();
    }

    public void escolherAtacantes() {
        System.out.println("Selecionando criaturas para atacar...");
        // Falta implementar
    }

    public void escolherBloqueadoras() {
    	System.out.println("Selecionando criaturas para bloquear...");
    	// Falta implementar
    }

    public void resolverCombate() {
        System.out.println("Resolvendo combate...");
        // Falta implementar  
        // Implementar verificação de vitória a cada ataque que atingir a vida do jogador.
    }
    
    private void faseFinal() {
		System.out.println("Fim do turno de " + (jogadorAtual ? p1.getNome() : p2.getNome()));
		alternarJogador();
	}

    
    
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do Jogador 1: ");
        String nomeP1 = scanner.nextLine();
        System.out.print("Digite o nome do Jogador 2: ");
        String nomeP2 = scanner.nextLine();
        
		Jogador p1 = new Jogador(nomeP1);
		Jogador p2 = new Jogador(nomeP2);
		
		CampoDeBatalha campo = new CampoDeBatalha(p1, p2);
		/* nesse ponto, o campo de batalha tenho as informações:
		 * dados dos jogadores
		 * ao instanciar o campo, automaticamente são chamados os métodos de criação de deck.
		 * campo criado
		 * cemitério criado
		 * vida inicial de cada player = 20
		 */
		
		// Loop principal onde ficará rodando os turnos do jogo.
		double rodada = 1;
		do {  
			System.out.println("\nRodada "+(int)rodada);
			if (campo.jogadorAtual) {
				// Player 1
				
				// Fase de compra
				p1.comprarCarta();
				
				// Fase de mana
				p1.adicionarCristal();
				p1.atualizarMana(p1.getCristalDeMana());
				
				// Fase principal
				p1.fasePrincipal();
				
				// Fase de combate
				campo.faseDeCombate();
				
				// Fase final
				campo.faseFinal();
				
				
				
			} else {
				//Player 2
			
				// Fase de compra
				p2.comprarCarta();
				
				// Fase de mana
				p2.adicionarCristal();
				p2.atualizarMana(p2.getCristalDeMana());
				
				// Fase principal
				p2.fasePrincipal();
				
				// Fase de combate
				campo.faseDeCombate();
				
				// Fase final
				campo.faseFinal();
				
			}
			
			
			
			rodada += 0.5; // cada laço do while é a vez de um jogador, então a cada dois laços mudará a rodada.
			
			
			if (p1.getVida() <= 0) {
				System.out.println("VITÓRIA! "+p2.getNome()+" venceu!");
				break;
			} else if (p2.getVida() <= 0) {
				System.out.println("VITÓRIA! "+p1.getNome()+" venceu!");
				break;
			}
			
		} while (p1.getVida() > 0 && p2.getVida() > 0);
		
		scanner.close();
	}
}
