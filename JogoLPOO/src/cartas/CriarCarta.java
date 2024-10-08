package cartas;

public class CriarCarta {
	
	// Criaturas
	public cartas.Criatura hercules = new cartas.Criatura("Hércules, o Herói", 7, 8, 7, "Ganha +2 de ataque quando enfrenta criaturas mitológicas");
	public cartas.Criatura medusa = new cartas.Criatura("Medusa, a Górgona", 6, 4, 5, "Ao ser destruída, transforma a criatura atacante em pedra (remova-a do jogo)");
	public cartas.Criatura cerbero = new cartas.Criatura("Cérbero, Guardião do Submundo", 5, 6, 6, "Impede que oponentes ataquem diretamente por uma rodada");
	public cartas.Criatura minotauro = new cartas.Criatura("Minotauro, o Labirinto Vivo", 6, 7, 6, "Causa 2 de dano adicional a criaturas com menos de 5 de defesa");
	public cartas.Criatura harpias = new cartas.Criatura("Harpias, As Fúrias Aladas", 4, 3, 4, "Reduz em 1 o ataque de todas as criaturas oponentes enquanto estiver em campo");
	public cartas.Criatura quimera = new cartas.Criatura("Quimera, a Fera Tríplice", 7, 6, 7, "Pode atacar duas vezes por turno");
	public cartas.Criatura hidra = new cartas.Criatura("Hidra, a Serpente de Lerna", 6, 5, 6, "Regenera 1 de defesa a cada rodada");
	public cartas.Criatura grifo = new cartas.Criatura("Grifo, Guardião dos Céus", 5, 5, 5, "Recebe +3 de ataque quando ataca criaturas voadoras");
	public cartas.Criatura centauro = new cartas.Criatura("Centauro, o Guerreiro da Floresta", 4, 4, 5, "Pode atacar e depois recuar, evitando dano no próximo turno");
	public cartas.Criatura medonho = new cartas.Criatura("Medonho, o Olho", 4, 3, 6, "Permite que o controlador veja a mão do oponente uma vez por turno");

	// Feitiços
	public cartas.Feitico raioZeus = new cartas.Feitico("Raio de Zeus", 4, "Causa 5 de dano a qualquer criatura ou jogador");
	public cartas.Feitico ventosEolo = new cartas.Feitico("Invocação dos Ventos de Éolo", 3, "Impede que todas as criaturas no campo ataquem neste turno");
	public cartas.Feitico bencaoAtena = new cartas.Feitico("Benção de Atena", 2, "Aumenta o ataque e a defesa de uma criatura em +2 até o fim do turno");
	public cartas.Feitico maldicaoHades = new cartas.Feitico("Maldição de Hades", 5, "Destrói uma criatura no campo");
	public cartas.Feitico forcaTitanica = new cartas.Feitico("Força Titânica", 4, "Dobra o ataque de uma criatura até o final do turno");
	public cartas.Feitico lagrimasOrfeu = new cartas.Feitico("Lágrimas de Orfeu", 4, "Revive uma criatura do cemitério");
	public cartas.Feitico tempestadePoseidon = new cartas.Feitico("Tempestade de Poseidon", 5, "Causa 3 de dano a todas as criaturas oponentes");
	public cartas.Feitico curaAsclepio = new cartas.Feitico("Cura de Asclépio", 3, "Restaura 5 de vida ao jogador");
	public cartas.Feitico toqueMidas = new cartas.Feitico("Toque de Midas", 5, "Transforma uma criatura em ouro (remove-a do jogo)");
	public cartas.Feitico coroaDionisio = new cartas.Feitico("Coroa de Dionísio", 2, "Permite ao jogador comprar duas cartas adicionais");

	// Encantamentos
	public cartas.Encantamento favorDeuses = new cartas.Encantamento("Favor dos Deuses", 5, "Todas as suas criaturas ganham +1 de ataque e defesa enquanto este encantamento estiver em campo");
	public cartas.Encantamento aegisZeus = new cartas.Encantamento("Aegis de Zeus", 4, "A primeira criatura atacada a cada turno não sofre dano");
	public cartas.Encantamento prisaoTartarus = new cartas.Encantamento("Prisão de Tartarus", 4, "Oponente deve descartar uma carta do topo do deck a cada turno");
	public cartas.Encantamento auraApolo = new cartas.Encantamento("Aura de Apolo", 3, "Reduz em 1 o custo de mana de todas as suas feitiços");
	public cartas.Encantamento vinculoPrometeu = new cartas.Encantamento("Vínculo de Prometeu", 5, "Oponentes não podem jogar feitiços enquanto este encantamento estiver ativo");
	public cartas.Encantamento protecaoArtemis = new cartas.Encantamento("Proteção de Artemis", 3, "Criaturas com menos de 3 de ataque não podem ser alvo de feitiços");
	public cartas.Encantamento treguaOlimpica = new cartas.Encantamento("Trégua Olímpica", 4, "Nenhuma criatura pode atacar por 3 rodadas");
	public cartas.Encantamento luzHelios = new cartas.Encantamento("Luz de Hélios", 4, "Aumenta a vida do jogador em 2 pontos a cada turno");
	public cartas.Encantamento punicaoNemesis = new cartas.Encantamento("Punição de Nêmesis", 3, "A cada vez que o oponente destruir uma criatura sua, ele perde 3 de vida");
	public cartas.Encantamento seloCronos = new cartas.Encantamento("Selo de Cronos", 4, "Escolha uma carta na mão do oponente. Essa carta não pode ser jogada enquanto este encantamento estiver em campo");

	
	
	
}
