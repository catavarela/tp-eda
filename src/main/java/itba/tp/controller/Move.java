package itba.tp.controller;

import itba.tp.back.Jugador;
import itba.tp.back.Tablero;
import javafx.util.Pair;

public class Move {
	private int heuristica;
	private Tablero actual;
	private Tablero siguiente;
	private Pair<Integer, Integer> nuevaFicha;
	private Jugador j;
	
	public Move(Tablero actual, int x, int y, Jugador j) {
		this.actual = actual;
		nuevaFicha = new Pair<Integer, Integer>(x, y);
		siguiente = actual;
		siguiente.agregarFicha(j, x, y);
		heuristica();
	}
	public int getHeuristica(){
		return heuristica;
	}
	
	private void heuristica(){
		//Mejorar...
		heuristica = 0;
	}
	@Override
	public String toString() {
		return "("+nuevaFicha.getKey()+","+nuevaFicha.getValue()+") "+heuristica;
	}
}
