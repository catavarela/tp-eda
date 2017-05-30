package itba.tp.controller;

import itba.tp.front.GUI;
public class Main {
	
	public static void main(String[] args){
//		Argumentos
//		java -jar tpe.jar (-visual | -file archivo -player n) (-maxtime n | -depth n) [-prune] [-tree]
//		
//		
		Go game = new Go("Jugador");
		Listeners listener= new Listeners(game);
		
		//if(args[0]=="visual")
			GUI.iniciar();
		//else{
			//Por consola con parametros file y player
		//}
		
		
		
	}
	
}
