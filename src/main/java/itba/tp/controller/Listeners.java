package itba.tp.controller;

import itba.tp.front.GUI;

public class Listeners {
	
	
	private static Go game;
	public Listeners(Go game) {
		this.game = game;
	}


	public static void llamadaDeCasillero(int fil, int col){
		if(game.mover(fil, col, game.getNext())){
			agregarFicha(fil, col);
			game.setNext((game.getNext().esMaquina()==true)?game.getPersona():game.getMaquina());
		}else{
			
		}
	}
	
	private static void agregarFicha(int fil, int col){
		GUI.ponerFicha(((game.getNext().getColor()==true)?true:false), fil, col);
		game.getTablero().agregarFicha(game.getNext(), fil, col);
	}
	
	
	
	
	
}
