public class Tablero {

	private Casillero[][] tablero = new Casillero[5][5];
	private int[][] matrizDePuntos = new int[5][5];
	private int auxCoronas = 0; // aux;

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

	Tablero(Casillero[][] tablero) {
		this.tablero = tablero;
	}

	public void generarMatrizDePuntos() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (tablero[i][j] != null) {
					switch (tablero[i][j].getTipoTerreno()) {
					case "trigo":
						matrizDePuntos[i][j] = TipoTerreno.trigo;// 1
						break;
					case "agua":
						matrizDePuntos[i][j] = TipoTerreno.agua;// 2
						break;
					case "mina":
						matrizDePuntos[i][j] = TipoTerreno.mina;// 3
						break;
					case "pasto":
						matrizDePuntos[i][j] = TipoTerreno.pasto;// 4
						break;
					case "bosque":
						matrizDePuntos[i][j] = TipoTerreno.bosque;// 5
						break;
					default:
						matrizDePuntos[i][j] = 0;
					}
				}

			}
		}
	}

	public int calcularPuntaje() {
		generarMatrizDePuntos();
		int puntosTrigo = 0;// 1
		int puntosAgua = 0; // 2
		int puntosMina = 0;// 3
		int puntosPasto = 0;// 4
		int puntosBosque = 0;// 5
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				switch (matrizDePuntos[i][j]) {
				case 1:
					puntosTrigo += contarPuntosR(i, j, 1) * auxCoronas;
					break;
				case 2:
					puntosAgua += contarPuntosR(i, j, 2) * auxCoronas;
					break;
				case 3:
					puntosMina += contarPuntosR(i, j, 3) * auxCoronas;
					break;
				case 4:
					puntosPasto += contarPuntosR(i, j, 4) * auxCoronas;
					break;
				case 5:
					puntosBosque += contarPuntosR(i, j, 5) * auxCoronas;
					break;
				}
				auxCoronas = 0;
			}
		}
		return puntosTrigo + puntosAgua + puntosMina + puntosPasto + puntosBosque;
	}

	public int contarPuntosR(int i, int j, int t) {
		if (i >= 5 || i < 0 || j >= 5 || j < 0 || matrizDePuntos[i][j] != t) {
			return 0;
		}
		matrizDePuntos[i][j] = 0;
		auxCoronas += tablero[i][j].getCantCoronas();
		return (1 + contarPuntosR(i, j + 1, t) + contarPuntosR(i, j - 1, t) + contarPuntosR(i - 1, j, t)
				+ contarPuntosR(i + 1, j, t));
	}

	public static void main(String[] args) {
	}

}
