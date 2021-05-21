public class Tablero {

	private Casillero[][] tablero = new Casillero[5][5];
	private int[] trigo = new int[2];
	private int[] agua = new int[2];
	private int[] mina = new int[2];
	private int[] pasto = new int[2];

	public int calcularPuntaje() {
		return 1;
	}

	public boolean posicionarFicha(Ficha f, Posicion posCasillero1, Posicion posCasillero2) {
		if (tablero[posCasillero1.getX()][posCasillero1.getY()] == null
				&& tablero[posCasillero2.getX()][posCasillero2.getY()] == null) {
			f.getCasilleros()[0].setPosicion(posCasillero1);
			f.getCasilleros()[1].setPosicion(posCasillero2);
			tablero[posCasillero1.getX()][posCasillero1.getY()] = f.getCasilleros()[0];
			tablero[posCasillero2.getX()][posCasillero2.getY()] = f.getCasilleros()[1];
			return true;
		}
		return false;
	}

	public void contarPuntos() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {

				if (tablero[i][j].getTipoTerreno() == "tringo") {
					trigo[0]++;
					trigo[1] += tablero[i][j].getCantCoronas();
				} else if (tablero[i][j].getTipoTerreno() == "agua") {
					agua[0]++;
					agua[1] += tablero[i][j].getCantCoronas();
				} else if (tablero[i][j].getTipoTerreno() == "pasto") {
					pasto[0]++;
					pasto[1] += tablero[i][j].getCantCoronas();
				} else if (tablero[i][j].getTipoTerreno() == "mina") {
					mina[0]++;
					mina[1] += tablero[i][j].getCantCoronas();
				}

			}

		}
	}
}
