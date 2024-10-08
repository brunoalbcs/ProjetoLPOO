package principal;

import java.util.ArrayList;
import cartas.*;

public class Main {
	
	public static void main(String[] args) {
		CriarCarta criarCarta = new CriarCarta();
		
		
		ArrayList<Carta> deckP1 = new ArrayList<>();
		
		deckP1.add(new Criatura(criarCarta.hercules));
		deckP1.add(new Feitico(criarCarta.raioZeus));
		deckP1.add(new Encantamento(criarCarta.favorDeuses));
		
		
		for (Carta carta : deckP1) {
			if (carta instanceof Criatura) {
				Criatura criatura = (Criatura) carta;
				System.out.println(criatura.getNome() + " | Poder de ataque: "+criatura.getAtaque());
			}
			
			System.out.println(carta.getNome() +" | Custo: "+ carta.getCustoMana());
			
		}
			
	}
	
}
