package itba.tp.back;

public class Tablero {
	private Ficha[][] tablero = new Ficha[13][13];
	
	public Tablero(){
		
	}
	
	public boolean agregarFicha(Jugador jug, int fil, int col){
		if(tablero[fil][col] == null){
			tablero[fil][col] = new Ficha(jug.getColor(), fil, col);
			return true;
		}
		
		return false;
	}
	
	public void sacarFicha(int fil, int col){
		tablero[fil][col] = null;
		return;
	}
	
	public Ficha getFicha(int fila, int columna){
		if(tablero[fila][columna] == null)
			return null;
		
		return tablero[fila][columna];
	}
	
	
	
	
}