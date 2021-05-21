public class Tablero {

	private Casillero[][] tablero = new Casillero[5][5];

	public int calcularPuntaje() {
		return 1;
	}
	
	public boolean posicionarFicha(Ficha f, Posicion posCasillero1, Posicion posCasillero2) {
		if(tablero[posCasillero1.getX()][posCasillero1.getY()] == null && tablero[posCasillero2.getX()][posCasillero2.getY()] == null) {	
			f.getCasilleros()[0].setPosicion(posCasillero1);
			f.getCasilleros()[1].setPosicion(posCasillero2);
			tablero[posCasillero1.getX()][posCasillero1.getY()] = f.getCasilleros()[0];
			tablero[posCasillero2.getX()][posCasillero2.getY()] = f.getCasilleros()[1];
			return true;
		}
		return false;
	}
		
}
