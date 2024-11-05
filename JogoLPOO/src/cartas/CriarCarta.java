package cartas;

import java.util.ArrayList;

public class CriarCarta {
    private final ArrayList<Carta> todasAsCartas = new ArrayList<Carta>();    
    
    public CriarCarta() {
        criarCartas();
    }
    
    public void criarCartas() {
        
        todasAsCartas.add(new Criatura("Hércules, o Herói", 7, 8, 7, "Ganha +2 de ataque quando enfrenta criaturas mitológicas"));
        todasAsCartas.add(new Criatura("Medusa, a Górgona", 6, 4, 5, "Ao ser destruída, transforma a criatura atacante em pedra (remova-a do jogo)"));
        todasAsCartas.add(new Criatura("Cérbero, Guardião do Submundo", 5, 6, 6, "Impede que oponentes ataquem diretamente por uma rodada"));
        todasAsCartas.add(new Criatura("Minotauro, o Labirinto Vivo", 6, 7, 6, "Causa 2 de dano adicional a criaturas com menos de 5 de defesa"));
        todasAsCartas.add(new Criatura("Harpias, As Fúrias Aladas", 4, 3, 4, "Reduz em 1 o ataque de todas as criaturas oponentes enquanto estiver em campo"));
        todasAsCartas.add(new Criatura("Quimera, a Fera Tríplice", 7, 6, 7, "Pode atacar duas vezes por turno"));
        todasAsCartas.add(new Criatura("Hidra, a Serpente de Lerna", 6, 5, 6, "Regenera 1 de defesa a cada rodada"));
        todasAsCartas.add(new Criatura("Grifo, Guardião dos Céus", 5, 5, 5, "Recebe +3 de ataque quando ataca criaturas voadoras"));
        todasAsCartas.add(new Criatura("Centauro, o Guerreiro da Floresta", 4, 4, 5, "Pode atacar e depois recuar, evitando dano no próximo turno"));
        todasAsCartas.add(new Criatura("Medonho, o Olho", 4, 3, 6, "Permite que o controlador veja a mão do oponente uma vez por turno"));

        todasAsCartas.add(new Feitico("Raio de Zeus", 4, "Causa 5 de dano a qualquer criatura ou jogador"));
        todasAsCartas.add(new Feitico("Invocação dos Ventos de Éolo", 3, "Impede que todas as criaturas no campo ataquem neste turno"));
        todasAsCartas.add(new Feitico("Benção de Atena", 2, "Aumenta o ataque e a defesa de uma criatura em +2 até o fim do turno"));
        todasAsCartas.add(new Feitico("Maldição de Hades", 5, "Destrói uma criatura no campo"));
        todasAsCartas.add(new Feitico("Força Titânica", 4, "Dobra o ataque de uma criatura até o final do turno"));
        todasAsCartas.add(new Feitico("Lágrimas de Orfeu", 4, "Revive uma criatura do cemitério"));
        todasAsCartas.add(new Feitico("Tempestade de Poseidon", 5, "Causa 3 de dano a todas as criaturas oponentes"));
        todasAsCartas.add(new Feitico("Cura de Asclépio", 3, "Restaura 5 de vida ao jogador"));
        todasAsCartas.add(new Feitico("Toque de Midas", 5, "Transforma uma criatura em ouro (remove-a do jogo)"));
        todasAsCartas.add(new Feitico("Coroa de Dionísio", 2, "Permite ao jogador comprar duas cartas adicionais"));

        todasAsCartas.add(new Encantamento("Favor dos Deuses", 5, "Todas as suas criaturas ganham +1 de ataque e defesa enquanto este encantamento estiver em campo"));
        todasAsCartas.add(new Encantamento("Aegis de Zeus", 4, "A primeira criatura atacada a cada turno não sofre dano"));
        todasAsCartas.add(new Encantamento("Prisão de Tartarus", 4, "Oponente deve descartar uma carta do topo do deck a cada turno"));
        todasAsCartas.add(new Encantamento("Aura de Apolo", 3, "Reduz em 1 o custo de mana de todas as suas feitiços"));
        todasAsCartas.add(new Encantamento("Vínculo de Prometeu", 5, "Oponentes não podem jogar feitiços enquanto este encantamento estiver ativo"));
        todasAsCartas.add(new Encantamento("Proteção de Artemis", 3, "Criaturas com menos de 3 de ataque não podem ser alvo de feitiços"));
        todasAsCartas.add(new Encantamento("Trégua Olímpica", 4, "Nenhuma criatura pode atacar por 3 rodadas"));
        todasAsCartas.add(new Encantamento("Luz de Hélios", 4, "Aumenta a vida do jogador em 2 pontos a cada turno"));
        todasAsCartas.add(new Encantamento("Punição de Nêmesis", 3, "A cada vez que o oponente destruir uma criatura sua, ele perde 3 de vida"));
        todasAsCartas.add(new Encantamento("Selo de Cronos", 4, "Escolha uma carta na mão do oponente. Essa carta não pode ser jogada enquanto este encantamento estiver em campo"));
    }
    
    public ArrayList<Carta> getTodasAsCartas() {
        return todasAsCartas;
    }
}
