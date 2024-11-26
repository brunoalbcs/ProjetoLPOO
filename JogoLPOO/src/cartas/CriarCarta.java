package cartas;

import java.util.ArrayList;

public class CriarCarta {
    private final ArrayList<Carta> todasAsCartas = new ArrayList<Carta>();    
    
    public CriarCarta() {
        criarCartas();
    }
    
    public void criarCartas() {
        
    	todasAsCartas.add(new Criatura("Hércules Jovem", 3, 3, 4, "Ganha +1 de ataque quando enfrenta criaturas mitológicas", ""));
    	todasAsCartas.add(new Criatura("Medusa Enfurecida", 4, 4, 3, "Transforma a criatura atacante em pedra ao ser destruída", ""));
    	todasAsCartas.add(new Criatura("Cérbero Menor", 3, 2, 4, "Impede ataques diretos por uma rodada", ""));
    	todasAsCartas.add(new Criatura("Minotauro Aprendiz", 3, 4, 3, "Causa 1 de dano adicional a criaturas com menos de 3 de defesa", ""));
    	todasAsCartas.add(new Criatura("Harpia Juvenil", 2, 2, 2, "Reduz em 1 o ataque de todas as criaturas oponentes enquanto estiver em campo", ""));
    	todasAsCartas.add(new Criatura("Quimera Pequena", 3, 3, 3, "Pode atacar duas vezes por turno", ""));
    	todasAsCartas.add(new Criatura("Hidra Jovem", 3, 2, 3, "Regenera 1 de defesa a cada rodada", ""));
    	todasAsCartas.add(new Criatura("Grifo em Treinamento", 2, 2, 2, "Recebe +1 de ataque ao atacar criaturas voadoras", ""));
    	todasAsCartas.add(new Criatura("Centauro Novato", 3, 3, 3, "Pode atacar e recuar, evitando dano no próximo turno", ""));
    	todasAsCartas.add(new Criatura("Olho Espião", 2, 1, 3, "Permite que o controlador veja a mão do oponente uma vez por turno", ""));
    	todasAsCartas.add(new Criatura("Sátiro do Bosque", 2, 2, 2, "Ganha +1 de defesa ao início do turno", ""));
    	todasAsCartas.add(new Criatura("Ciclop Curioso", 3, 3, 4, "Pode bloquear ataques dirigidos ao jogador", ""));
    	todasAsCartas.add(new Criatura("Héstia Protetora", 2, 1, 4, "Aumenta em 1 a vida do jogador ao início do turno", ""));
    	todasAsCartas.add(new Criatura("Dríade Guardiã", 3, 3, 3, "Dá +1 de ataque a outra criatura aliada ao entrar em campo", ""));
    	todasAsCartas.add(new Criatura("Golem de Pedra", 4, 5, 4, "Imune a efeitos de feitiços enquanto estiver em campo", ""));
    	todasAsCartas.add(new Criatura("Fênix Jovem", 3, 3, 3, "Retorna para a mão do jogador ao ser destruída", ""));
    	todasAsCartas.add(new Criatura("Górgona Fraca", 2, 2, 2, "Transforma a criatura atacante em pedra ao ser destruída", ""));
    	todasAsCartas.add(new Criatura("Centauro Patrulheiro", 3, 3, 3, "Pode atacar e recuar, evitando dano no próximo turno", ""));
    	todasAsCartas.add(new Criatura("Leão de Nemeia", 3, 4, 3, "Reduz em 1 o ataque de todas as criaturas atacantes", ""));
    	todasAsCartas.add(new Criatura("Hidra Pequena", 2, 2, 2, "Regenera 1 de defesa a cada rodada", ""));

    	todasAsCartas.add(new Feitico("Raio Rápido", 2, "Causa 3 de dano a qualquer criatura ou jogador", ""));
    	todasAsCartas.add(new Feitico("Explosão de Energia", 2, "Causa 3 de dano a qualquer criatura ou jogador", ""));
    	todasAsCartas.add(new Feitico("Golpe Relâmpago", 2, "Causa 3 de dano a qualquer criatura ou jogador", ""));
    	todasAsCartas.add(new Feitico("Fúria do Olimpo", 2, "Causa 3 de dano a qualquer criatura ou jogador", ""));

    	todasAsCartas.add(new Encantamento("Força Aliada", 2, "Todas as suas criaturas ganham +1 de ataque enquanto este encantamento estiver em campo", ""));
    	todasAsCartas.add(new Encantamento("Poder do Céu", 2, "Todas as suas criaturas ganham +1 de ataque enquanto este encantamento estiver em campo", ""));
    	todasAsCartas.add(new Encantamento("Aura da Vitória", 2, "Todas as suas criaturas ganham +1 de ataque enquanto este encantamento estiver em campo", ""));
    	todasAsCartas.add(new Encantamento("Glória Olímpica", 2, "Todas as suas criaturas ganham +1 de ataque enquanto este encantamento estiver em campo", ""));

    }
    
    public ArrayList<Carta> getTodasAsCartas() {
        return todasAsCartas;
    }
    
    public ArrayList<Criatura> getCriaturas() {
    	ArrayList<Criatura> criaturas = new ArrayList<Criatura>();
    	
    	for (Carta c : todasAsCartas) {
    		if (c instanceof Criatura) {
    		criaturas.add((Criatura) c);
    		}	
    	}
    	
    	return criaturas;
    }    
    
    public ArrayList<Feitico> getFeiticos() {
    	ArrayList<Feitico> feiticos = new ArrayList<Feitico>();
    	
    	for (Carta c : todasAsCartas) {
    		if (c instanceof Feitico) {
    		feiticos.add((Feitico) c);
    		}	
    	}
    	
    	return feiticos;
    }
    
    public ArrayList<Encantamento> getEncantamentos() {
    	ArrayList<Encantamento> encantamentos = new ArrayList<Encantamento>();
    	
    	for (Carta c : todasAsCartas) {
    		if (c instanceof Encantamento) {
    		encantamentos.add((Encantamento) c);
    		}	
    	}
    	
    	return encantamentos;
    }
    
}
