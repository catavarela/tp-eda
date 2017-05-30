package itba.tp.back;

public class Ficha {

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + columna;
		result = prime * result + fila;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ficha other = (Ficha) obj;
		if (columna != other.columna)
			return false;
		if (fila != other.fila)
			return false;
		return true;
	}

	private boolean color;
	private int fila;
	private int columna;
	
	public Ficha (boolean color, int fila, int columna){
		this. color = color;
		this.fila = fila;
		this.columna = columna;
	}
	
	public boolean getColor(){
		return color;
	}
	
	public int getFila(){
		return fila;
	}
	
	public int getColumna(){
		return columna;
	}
	
	public void setColor(boolean color){
		this.color = color;
	}
	
}
