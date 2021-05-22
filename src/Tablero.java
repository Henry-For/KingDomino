public class Tablero {

	private Casillero[][] tablero = new Casillero[5][5];
	private int[] trigo = new int[2];
	private int[] agua = new int[2];
	private int[] mina = new int[2];
	private int[] pasto = new int[2];

	public Tablero() {
		tablero[2][2] = new Casillero(Casillero.TERRENO_REY, 0, new Posicion(2, 2));
	}

	public int calcularPuntaje() {
		return 1;
	}

	public boolean posicionarFicha(Ficha f, Posicion posCasillero1, Posicion posCasillero2) {
		if (tablero[posCasillero1.getX()][posCasillero1.getY()] == null && tablero[posCasillero2.getX()][posCasillero2.getY()] == null && tieneTerrenoCorrelativo(f, posCasillero1, posCasillero2)) {
			f.getCasilleros()[0].setPosicion(posCasillero1);
			f.getCasilleros()[1].setPosicion(posCasillero2);
			tablero[posCasillero1.getX()][posCasillero1.getY()] = f.getCasilleros()[0];
			tablero[posCasillero2.getX()][posCasillero2.getY()] = f.getCasilleros()[1];
			return true;
		}

		System.out.println("Posicion(es) ocupada(s) o tipos de terreno no posibles de conectar.");
		return false;
	}

	public boolean tieneTerrenoCorrelativo(Ficha f, Posicion posCasillero1, Posicion posCasillero2) {
		int x1 = posCasillero1.getX();
		int y1 = posCasillero1.getY();
		int x2 = posCasillero2.getX();
		int y2 = posCasillero2.getY();
		if (x1-1 >= 0 && tablero[x1 - 1][y1] != null && f.getCasilleros()[0].sonTerrenosConsecutivos(tablero[x1 - 1][y1]))
			return true;
		if (y1-1 >= 0 && tablero[x1][y1 - 1] != null && f.getCasilleros()[0].sonTerrenosConsecutivos(tablero[x1][y1 - 1]))
			return true;
		if (y1+1 < 5 && tablero[x1][y1 + 1] != null && f.getCasilleros()[0].sonTerrenosConsecutivos(tablero[x1][y1 + 1]))
			return true;
		if (x2+1 < 5 && tablero[x2 + 1][y2] != null && f.getCasilleros()[1].sonTerrenosConsecutivos(tablero[x2 + 1][y2]))
			return true;
		if (y2-1 >= 0 && tablero[x2][y2 - 1] != null && f.getCasilleros()[1].sonTerrenosConsecutivos(tablero[x2][y2 - 1]))
			return true;
		if (y2+1 < 5 && tablero[x2][y2 + 1] != null && f.getCasilleros()[1].sonTerrenosConsecutivos(tablero[x2][y2 + 1]))
			return true;
		return false;
	}
}
