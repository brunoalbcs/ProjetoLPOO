package main;

import java.util.ArrayList;

import cartas.Carta;
import cartas.Criatura;
import cartas.Encantamento;
import cartas.Feitico;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<Carta> deck = new ArrayList<>();
		deck.add(new Criatura("Hércules", 5, 4, 4, null));
		System.out.println("Carta: "+deck.get(0).getNome());
	}
	
}
