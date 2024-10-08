package principal;

import cartas.*;
import jogador.*;

public class CampoDeBatalha {
	
	public void atacar(Carta atacante, Carta alvo) {
		Criatura criaturaAtacante = (Criatura) atacante;
		Criatura criaturaAlvo = (Criatura) alvo;
		
		if (criaturaAtacante.getAtaque() >= criaturaAlvo.getDefesa()) {
			
		}
		
	}
	
}
